package frc.robot.commands.AutoTune;

import frc.lib.drivers.SpectrumTalonSRX;
import frc.lib.util.BobCircularBuffer;
import frc.lib.util.Util;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AutoTuneVelocityCalculateF extends Command {

	private int samplesRequired;
	private int samplesGathered = 0;
	private int paramterSlot = 0;
	
	private SpectrumTalonSRX _talon;
	private StringBuilder _sb;
	private BobCircularBuffer cBuff;
    
    public AutoTuneVelocityCalculateF(Subsystem requiredSubsystem, SpectrumTalonSRX talon, int srxParameterSlot, int numSamplesRequired) {
    	this._talon = talon;
    	this._talon.config_kF(srxParameterSlot, 0);
    	this._talon.config_kP(srxParameterSlot, 0);
    	this._talon.config_kI(srxParameterSlot, 0);
    	this._talon.config_kD(srxParameterSlot, 0);
    	this.samplesRequired = numSamplesRequired;
    	this.samplesGathered = 0;
    	this.cBuff = new BobCircularBuffer(samplesRequired);
    	this.paramterSlot = srxParameterSlot;
    	this._sb = new StringBuilder();
    	requires(requiredSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Calculating feed forward gain (F).");
    	System.out.println("Gathering Data...");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double outputSignal = _talon.getMotorOutputVoltage() / _talon.getBusVoltage();
    	double speed = _talon.getSelectedSensorVelocity(paramterSlot);
    	
    	cBuff.addLast(speed);
    	samplesGathered++;
    	
    	_sb.append("\tOutput: ");
    	_sb.append(outputSignal);
    	_sb.append("\tSpeed: ");
    	_sb.append(speed);
    	_sb.append("\n");
    	
    	if(samplesGathered % 10 == 0) {
    		System.out.println(_sb.toString());
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return samplesGathered >= samplesRequired;
    }

    // Called once after isFinished returns true
    protected void end() {
    	double kF = 1023 / Util.mean(cBuff.toArray());
    	_talon.config_kF(paramterSlot, kF);
    	System.out.println("Calculated F gain = " + kF);
    	System.out.println("Finished calculating F gain.  Switching to speed mode.");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	_talon.set(ControlMode.PercentOutput, 0);
    }
}