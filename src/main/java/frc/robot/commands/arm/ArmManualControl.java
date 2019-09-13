/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.arm;

import edu.wpi.first.wpilibj.command.Command;

import frc.lib.controllers.SpectrumThumbStick;
import frc.lib.controllers.SpectrumXboxController;
import frc.robot.OI;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class ArmManualControl extends Command {
	public ArmManualControl() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.arm);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.arm.disableLimitSwitches(true);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
			Robot.arm.setOpenLoop(OI.operatorController.leftStick.getY() * -1);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.arm.disableLimitSwitches(false);
		Robot.arm.setOpenLoop(0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}
