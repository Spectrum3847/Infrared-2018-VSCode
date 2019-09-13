package frc.robot.commands.auto.modes;

import frc.paths.LeftScale;
import frc.paths.LeftScaleM2;
import frc.paths.LeftScaleM3;
import frc.paths.TestSTurnAuto;
import frc.robot.Robot;
import frc.robot.commands.FollowTrajectory;
import frc.robot.commands.arm.ArmFwdHome;
import frc.robot.commands.arm.ArmRevHome;
import frc.robot.commands.arm.SetArmPos;
import frc.robot.commands.auto.DriveForTime;
import frc.robot.commands.auto.DriveUntilLine;
import frc.robot.commands.auto.DriveUntilWall;
import frc.robot.commands.auto.InPlaceTurn;
import frc.robot.commands.intake.EjectCube;
import frc.robot.commands.intake.OpenIntakeOn;
import frc.robot.commands.puncher.ShootPuncher;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Arm.Position;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftScale2Cube extends CommandGroup {

	public LeftScale2Cube() {
		super("LeftScale");
		//If the switch is on the left make sure we turn before driving
		this.addParallel(new SetArmPos(Arm.Position.FwdScore));
		this.addSequential(new FollowTrajectory(new LeftScale()));
		this.addSequential(new ShootPuncher(), .75);
		this.addParallel(new ArmRevHome());
		this.addSequential(new InPlaceTurn(90),3);
		this.addParallel(new OpenIntakeOn(1));
		this.addSequential(new FollowTrajectory(new LeftScaleM2()));
		this.addParallel(new SetArmPos(Position.FwdScore));
		this.addSequential(new FollowTrajectory(new LeftScaleM3()));
		//this.addSequential(new DriveForTime(1,-.3));
	}


}
