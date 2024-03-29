/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.lib.drivers.SpectrumTalonSRX;
import frc.lib.drivers.LeaderTalonSRX;
import frc.lib.drivers.SRXGains;
import frc.robot.HW;
import frc.robot.Robot;
import frc.robot.commands.extension.ExtensionManualControl;
import frc.robot.commands.extension.ExtensionMotionMagicHold;

import com.ctre.phoenix.ParamEnum;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
import com.ctre.phoenix.motorcontrol.LimitSwitchSource;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Extension Subsystem
 */
public class Extension extends Subsystem {

	public final static int EXTENSION_REG = 0;
	public final static int EXTENSION_CLIMB = 1;
	
	public final static int upPositionLimit = 22500;// needs to be determined manually
	public final static int downPositionLimit = 0;
	private static int highScorePos = 22000;
	
	private int accel = 0;
	private int cruiseVel = 0;
	
	public SpectrumTalonSRX extensionBottomSRX = new SpectrumTalonSRX(HW.EXTENSION_BOTTOM);
	public LeaderTalonSRX extensionSRX = new LeaderTalonSRX(HW.EXTENSION_TOP, extensionBottomSRX);
	
	private SRXGains regularGains = new SRXGains(EXTENSION_REG, 0.560, 0.0, 5.600, 0.620, 100);
	private SRXGains climbGains = new SRXGains(EXTENSION_CLIMB, 0.0, 0.0, 0.0, 0.427, 0);
	private boolean zeroWhenDownLimit = true;
	
	private int targetPosition = 0;
	
	public Extension() {
		super("Extension");
		boolean extensionInvert = true;
    	boolean extensionPhase = true;
    	extensionSRX.configOpenloopRamp(0);
    	extensionSRX.configClosedloopRamp(0);
    	extensionSRX.setNeutralMode(NeutralMode.Brake);
    	extensionSRX.setInverted(extensionInvert);
    	extensionSRX.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0);
    	extensionSRX.setSensorPhase(extensionPhase);
    	extensionSRX.configForwardLimitSwitchSource(LimitSwitchSource.FeedbackConnector, LimitSwitchNormal.NormallyOpen);
    	extensionSRX.configReverseLimitSwitchSource(LimitSwitchSource.FeedbackConnector, LimitSwitchNormal.NormallyOpen);
    	extensionSRX.configNominalOutputForward(0);
    	extensionSRX.configNominalOutputReverse(0);
    	extensionSRX.configPeakOutputForward(1);
    	extensionSRX.configPeakOutputReverse(-1);
    	extensionSRX.configVoltageCompSaturation(Robot.prefs.getNumber("E: Voltage Comp", 12));
    	extensionSRX.enableVoltageCompensation(true);
    	extensionSRX.configContinuousCurrentLimit(20);
    	extensionSRX.configPeakCurrentLimit(30);
    	extensionSRX.configPeakCurrentDuration(1000);
    	extensionSRX.enableCurrentLimit(true);
    	extensionSRX.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
    	extensionSRX.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);
    	
    	extensionSRX.configForwardSoftLimitEnable(true);
    	extensionSRX.configForwardSoftLimitThreshold(upPositionLimit);
    	
    	extensionSRX.configReverseSoftLimitEnable(false);
    	extensionSRX.configReverseSoftLimitThreshold(downPositionLimit);

    	//Clear Extension Position on Reverse Limit Switch
    	extensionSRX.configSetParameter(ParamEnum.eClearPositionOnLimitR, 1, 0, 0, 0);
    	
    	extensionBottomSRX.setFollowerFramePeriods();
		extensionSRX.selectProfileSlot(EXTENSION_REG, 0);
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		//setDefaultCommand(new ExtensionManualControl());
		setDefaultCommand(new ExtensionMotionMagicHold());
	}
	
	public void periodic() {
		if (Robot.prefs.getBoolean("E: Set Gains", false)) {
			setMotionMagicValues((int)Robot.prefs.getNumber("E: MM Accel", 5000), (int)Robot.prefs.getNumber("E: MM CruiseVel", 2000));
			getPrefsGains();
			extensionSRX.setGains(regularGains);
			extensionSRX.setGains(climbGains);
		}
	}
	
	public void getPrefsGains() {
		regularGains.setGains(EXTENSION_REG,
		Robot.prefs.getNumber("E: up P", 3.5),
		Robot.prefs.getNumber("E: up I", 0.0),
		Robot.prefs.getNumber("E: up D", 30.0),
		Robot.prefs.getNumber("E: up F", 0.5115),
		0);
		
		climbGains.setGains(EXTENSION_CLIMB,
		Robot.prefs.getNumber("E: climb P", 6.0),
		Robot.prefs.getNumber("E: climb I", 0.0),
		Robot.prefs.getNumber("E: climb D", 60.0),
		Robot.prefs.getNumber("E: climb F", 0.5115),
		0);
	}
	
	public void setToClimbeGains() {
		extensionSRX.selectProfileSlot(EXTENSION_CLIMB, 0);
	}
	
	public void setToRegularGains() {
		extensionSRX.selectProfileSlot(EXTENSION_REG, 0);
		
	}
	
	public void setHighScorePos() {
		highScorePos = (int)Robot.prefs.getNumber("E: High Score", 20000);
	}
	
	public int getHighScorePos() {
		return highScorePos;
	}
	
	public void disableLimitSwitches(boolean t) {
		extensionSRX.overrideLimitSwitchesEnable(!t);
	}
	
	public void setZeroWhenDownLimit(boolean val) {
		zeroWhenDownLimit = val;
	}
	
	public void setOpenLoop(double value) {
		extensionSRX.set(ControlMode.PercentOutput, value);
	}
	
	public void set(ControlMode controlMode, double signal) {
    	/*if(controlMode == ControlMode.MotionMagic) {
    		this.manageGainProfile(signal);
    	}*/
    	extensionSRX.set(controlMode, signal);
    }
	
	public boolean getFwdLimitSW() {
		return extensionSRX.getSensorCollection().isFwdLimitSwitchClosed();
	}
	
	public boolean getRevLimitSW() {
		return extensionSRX.getSensorCollection().isRevLimitSwitchClosed();
	}
	
	public int getCurrentPosition() {
    	return extensionSRX.getSelectedSensorPosition(0);
    }
	
	public int getTargetPosition() {
		return targetPosition;
	}
	
	public int getSRXTarget() {
		return (int) extensionSRX.getClosedLoopTarget(0);
	}
	
    public void setTargetPosition(int position) {
    	targetPosition = position;
    }
	
	public int getError() {
		return extensionSRX.getClosedLoopError(0);
	}
	
	public double getOutput() {
		return extensionSRX.getMotorOutputVoltage();
	}
	
	public void setTargetToCurrentPosition() {
		setTargetPosition(getCurrentPosition());
	}
	
	public boolean isDown() {
		return getCurrentPosition() < 100;
	}
	
	public void manageGainProfile(double targetPosition) {
		double currentPosition = getCurrentPosition();
		if (currentPosition < targetPosition) {
				extensionSRX.selectProfileSlot(EXTENSION_REG, 0);
		} else {
			extensionSRX.selectProfileSlot(EXTENSION_CLIMB, 0);
		}
	} 
	
	public void setMotionMagicValues(int acceleration, int cruiseVelocity) {
		if (accel != acceleration && cruiseVel != cruiseVelocity) {
			accel = acceleration;
			cruiseVel = cruiseVelocity;
			extensionSRX.configMotionAcceleration(accel);
			extensionSRX.configMotionCruiseVelocity(cruiseVel);
		}
	}
	
	 public void motionMagicControl() {
		 //If we can't extend extend then set position to 0
		 if (!Robot.arm.canExtend()) {
			targetPosition = 0;
		 }
		//manageGainProfile(targetPosition);
    	extensionSRX.set(ControlMode.MotionMagic, targetPosition);
	 }
	 
	 public double getCurrent() {
		 return extensionSRX.getOutputCurrent() + extensionBottomSRX.getOutputCurrent();
	 }
	
	//Add the dashboard values for this subsystem
	public void dashboard() {
		SmartDashboard.putNumber("Extension/Position", getCurrentPosition());
		SmartDashboard.putNumber("Extension/Output", getOutput());
		SmartDashboard.putNumber("Extension/Target", getTargetPosition());
		SmartDashboard.putNumber("Extension/Error", getError());
		SmartDashboard.putNumber("Extension/Velocity", this.extensionSRX.getSelectedSensorVelocity(0));
		
		SmartDashboard.putNumber("Extension Current Total", getCurrent());
		
		if (extensionSRX.getControlMode() == ControlMode.MotionMagic) {
			SmartDashboard.putNumber("Extension/Acitve Traj Veloctiy", extensionSRX.getActiveTrajectoryVelocity());
			SmartDashboard.putNumber("Extension/Acitve Traj Position", extensionSRX.getActiveTrajectoryPosition());
		} else {
			SmartDashboard.putNumber("Extension/Acitve Traj Veloctiy", -1);
			SmartDashboard.putNumber("Extension/Acitve Traj Position", -1);
		}
	}
	
	
	/*Modify this method to return false if there is a problem with the subsystem
	  Based on 254-2017 Code
	*/
	public boolean checkSystem() {
		return true;
		
		/** Example checkSystem from 254's 2017 Robot
		 System.out.println("Testing HOPPER.--------------------------------------");
        final double kCurrentThres = 0.5;

        mMasterTalon.changeControlMode(CANTalon.TalonControlMode.Voltage);
        mSlaveTalon.changeControlMode(CANTalon.TalonControlMode.Voltage);

        mMasterTalon.set(0.0);
        mSlaveTalon.set(0.0);

        mMasterTalon.set(-6.0f);
        Timer.delay(4.0);
        final double currentMaster = mMasterTalon.getOutputCurrent();
        mMasterTalon.set(0.0);

        Timer.delay(2.0);

        mSlaveTalon.set(6.0f);
        Timer.delay(4.0);
        final double currentSlave = mSlaveTalon.getOutputCurrent();
        mSlaveTalon.set(0.0);

        mMasterTalon.changeControlMode(CANTalon.TalonControlMode.PercentVbus);
        mSlaveTalon.changeControlMode(CANTalon.TalonControlMode.PercentVbus);

        System.out.println("Hopper Master Current: " + currentMaster + " Slave current: " + currentSlave);

        boolean failure = false;

        if (currentMaster < kCurrentThres) {
            failure = true;
            System.out.println("!!!!!!!!!!!!!!!!! Hopper Master Current Low !!!!!!!!!!!!!!!!!");
        }

        if (currentSlave < kCurrentThres) {
            failure = true;
            System.out.println("!!!!!!!!!!!!!!!! Hooper Slave Current Low !!!!!!!!!!!!!!!!!!!");
        }

        if (!Util.allCloseTo(Arrays.asList(currentMaster, currentSlave), currentMaster, 5.0)) {
            failure = true;
            System.out.println("!!!!!!!!!!!!!!!! Hopper Currents Different !!!!!!!!!!!!!!!!!");
        }

        return !failure;
		 */
	}
}
