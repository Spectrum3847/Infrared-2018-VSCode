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
import frc.robot.commands.puncher.ShootPuncher;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveForTimeStraight extends CommandGroup {

	public DriveForTimeStraight() {
		super("CeneterSWpigeon");
		//If the switch is on the left make sure we turn before driving
		this.addSequential(new DriveForTime(3,.6),3);
	}


}
