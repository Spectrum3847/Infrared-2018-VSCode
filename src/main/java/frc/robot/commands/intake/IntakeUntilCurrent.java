/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.intake;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Intake;


public class IntakeUntilCurrent extends Command {
	
	private double speed;
	
	public IntakeUntilCurrent() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.intake);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		speed = Robot.prefs.getNumber("I: Intake Speed", 1);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.intake.setOpenLoop(speed);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		//check if we have a cube and the left bumper isn't pressed
		return Robot.intake.isIntakeComplete(Robot.prefs.getNumber("I: Current Threshold", 8),
				Robot.prefs.getNumber("I: Threshold Time", 0.5)) && !OI.operatorController.rightTriggerButton.get();
		
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.intake.setOpenLoop(0);
		
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Robot.intake.setOpenLoop(0);
	}
}
