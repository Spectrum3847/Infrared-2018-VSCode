package frc.robot.commands.auto.modes;

import frc.paths.CrossTheLine;
import frc.paths.LeftScale;
import frc.paths.TestSTurnAuto;
import frc.robot.Robot;
import frc.robot.commands.FollowTrajectory;
import frc.robot.commands.arm.SetArmPos;
import frc.robot.commands.auto.DriveForTime;
import frc.robot.commands.auto.DriveUntilLine;
import frc.robot.commands.auto.DriveUntilWall;
import frc.robot.commands.auto.InPlaceTurn;
import frc.robot.commands.intake.EjectCube;
import frc.robot.commands.intake.IntakeOn;
import frc.robot.commands.puncher.ShootPuncher;
import frc.robot.subsystems.Arm.Position;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftSW extends CommandGroup {

	public LeftSW() {
		super("LeftSW");
		//If the switch is on the left make sure we turn before driving
		this.addSequential(new FollowTrajectory(new CrossTheLine()),4);
		this.addParallel(new SetArmPos(Position.FwdPortal));
		this.addSequential(new InPlaceTurn(-90),3);
		this.addSequential(new DriveUntilWall(.6),2);
		this.addSequential(new EjectCube(), 3);
		//this.addSequential(new DriveForTime(1,-.3));
	}


}
