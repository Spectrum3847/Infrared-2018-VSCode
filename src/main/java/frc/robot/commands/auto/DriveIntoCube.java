package frc.robot.commands.auto;

import frc.lib.util.Debugger;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class DriveIntoCube extends Command {

	private double cruiseCurrent = 40;
	private double throttle;
	private double turnAdjustment;
	private double initTime;
	private double lastUpdate;
	
	public DriveIntoCube() {
		this.requires(Robot.drive);
	}

	public void initialize(){
		Debugger.println("Driving to cube", Robot._auton, Debugger.info3);
		this.throttle = Robot.prefs.getNumber("2A: Drive To Wall Throttle", 5);
		this.turnAdjustment = Robot.prefs.getNumber("2A: Drive to Wall Drive Straight Adjust", -.05);
		this.initTime = Timer.getFPGATimestamp();
		this.lastUpdate = initTime;
	}
	
	public void execute(){
		Robot.drive.difDrive.curvatureDrive(throttle, turnAdjustment, false);
		double t = Timer.getFPGATimestamp();
		if((t - initTime) > 1.25){
			if( (t - lastUpdate) > .5){
				cruiseCurrent = Robot.drive.leftSRX.getOutputCurrent();
				lastUpdate = t;
				Debugger.println("Drive to wall cruiseCurrent:" + cruiseCurrent, Robot._auton, Debugger.verbose1);
				Debugger.println("Drive to wall throttle:" + throttle, Robot._auton, Debugger.verbose1);
			}
		}
		
			
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if ((Timer.getFPGATimestamp() - initTime > .75) && Robot.drive.leftSRX.getOutputCurrent() > Robot.prefs.getNumber("2A: Drive to Wall Current Trigger", 9)+5){
			
			Debugger.println("Hit wall. Time: " + (Timer.getFPGATimestamp() - initTime) + " Current: " + Robot.drive.leftSRX.getOutputCurrent(), Robot._auton, Debugger.info3);
			return true;
		}
		return false;
	}
	
	protected void end(){
		Robot.drive.difDrive.arcadeDrive(0, 0);
	}
	
	protected void interrupted(){
		this.end();
	}

}
