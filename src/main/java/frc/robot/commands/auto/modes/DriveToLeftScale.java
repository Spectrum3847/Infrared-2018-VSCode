package frc.robot.commands.auto.modes;

import frc.paths.ArcLeft;
import frc.robot.commands.FollowTrajectory;
import frc.robot.commands.arm.SetArmPos;
import frc.robot.commands.auto.InPlaceTurn;
import frc.robot.commands.intake.IntakeOn;
import frc.robot.subsystems.Arm.Position;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveToLeftScale extends CommandGroup {

	public DriveToLeftScale() {
		super("Drive to Left Scale");
		this.addParallel(new IntakeOn(1));
		this.addSequential(new InPlaceTurn(120,false),1.5);
		this.addParallel(new SetArmPos(Position.FwdScore));
		this.addParallel(new IntakeOn(0));
		this.addSequential(new FollowTrajectory(new ArcLeft()));
	}


}
