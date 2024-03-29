package frc.robot.commands.hook;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Extension;

import edu.wpi.first.wpilibj.command.Command;

public class ReadyClimb extends Command {

	boolean curl = false;
	public ReadyClimb() {
		requires(Robot.hook);
		requires(Robot.arm);
		requires(Robot.extension);
	}

	protected void initialize() {
		curl = false;
	}
	
	protected void execute() {
		if(OI.operatorController.leftBumper.get() || curl == true) {
			Robot.arm.setPos(Arm.Position.Curl);
			curl = true;
		} else {
			Robot.arm.setPos(Arm.Position.CENTER);
		}
		

		//Only extend hooks and extension if arm is up
		if (Robot.arm.canExtend()) {
			Robot.hook.hooksExtend();
			Robot.extension.setTargetPosition(Extension.upPositionLimit);
		}
		
		Robot.arm.motionMagicControl();
		Robot.extension.motionMagicControl();
	}
	
	// Make this return true when this Command no longer needs to run execute()
		@Override
		protected boolean isFinished() {
			return false;
		}

		// Called once after isFinished returns true
		@Override
		protected void end() {
		}

		// Called when another command which requires one or more of the same
		// subsystems is scheduled to run
		@Override
		protected void interrupted() {
			this.end();
		}

}
