package frc.robot.commands.auto.modes;

import frc.paths.LeftScale;
import frc.paths.LeftScaleSneaky;
import frc.paths.TestSTurnAuto;
import frc.robot.Robot;
import frc.robot.commands.FollowTrajectory;
import frc.robot.commands.arm.ArmFwdHome;
import frc.robot.commands.arm.SetArmPos;
import frc.robot.commands.auto.DriveForTime;
import frc.robot.commands.auto.DriveUntilLine;
import frc.robot.commands.auto.DriveUntilWall;
import frc.robot.commands.auto.InPlaceTurn;
import frc.robot.commands.intake.EjectCube;
import frc.robot.commands.puncher.ShootPuncher;
import frc.robot.subsystems.Arm;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftSneakyScaleMode extends CommandGroup {

	public LeftSneakyScaleMode() {
		super("LeftSneakyScale");
		//If the switch is on the left make sure we turn before driving
		this.addParallel(new SetArmPos(Arm.Position.FwdScore));
		this.addSequential(new FollowTrajectory(new LeftScaleSneaky()));
		this.addSequential(new InPlaceTurn(-30),1);
		this.addSequential(new ShootPuncher(), 1);
		this.addParallel(new ArmFwdHome());
	}


}
