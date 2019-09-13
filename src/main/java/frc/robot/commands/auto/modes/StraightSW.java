package frc.robot.commands.auto.modes;

import frc.paths.LeftScale;
import frc.paths.TestSTurnAuto;
import frc.robot.Robot;
import frc.robot.commands.FollowTrajectory;
import frc.robot.commands.auto.DriveForTime;
import frc.robot.commands.auto.DriveUntilLine;
import frc.robot.commands.auto.DriveUntilWall;
import frc.robot.commands.auto.InPlaceTurn;
import frc.robot.commands.intake.EjectCube;
import frc.robot.commands.intake.IntakeOn;
import frc.robot.commands.puncher.ShootPuncher;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class StraightSW extends CommandGroup {

	public StraightSW() {
		super("CeneterSWpigeon");
		//Drive Until Wall, score cube if it's on the color
		this.addSequential(new DriveUntilWall(.6),4);
		this.addSequential(new IntakeOn(-1), 3);
		this.addSequential(new DriveForTime(1,-.3));
	}
}
