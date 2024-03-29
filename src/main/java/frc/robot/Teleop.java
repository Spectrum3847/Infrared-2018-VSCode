package frc.robot;

import frc.robot.commands.arm.ArmMotionMagicHold;
import frc.robot.commands.extension.ExtensionMotionMagicHold;

import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * The Driver Control period of the competition
 */
public class Teleop {
	
    public static void init() {
        Scheduler.getInstance().removeAll();
    	Robot.drive.setNeutralMode(NeutralMode.Brake);
    	Robot.arm.setOpenLoop(0.0); // Make sure the arm doesn't move when we start teleop
        Robot.compressor.start();
        Robot.compressor.setClosedLoopControl(true);
        Robot.arm.setTargetToCurrentPosition();
        Robot.extension.setTargetToCurrentPosition();
        new ArmMotionMagicHold().start();
        new ExtensionMotionMagicHold().start();
        
        //Do things if connected to FMS only, so when telop starts during a match but not during testing
        if (DriverStation.getInstance().isFMSAttached()){
        }
   
        
        //Robot.logger.openFile();
    }

    public static void periodic() {
        Scheduler.getInstance().run();
		if (SmartDashboard.getBoolean("Compressor ENABLE", true)) {
			Robot.compressor.start();
		} else {
			Robot.compressor.stop();
		}
        //Robot.logger.logAll();
    }

    public static void cancel() {
    	System.out.println("Cancel");
        Scheduler.getInstance().removeAll();
    }
}
