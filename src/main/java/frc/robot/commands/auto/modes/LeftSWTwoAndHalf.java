package frc.robot.commands.auto.modes;

import frc.paths.*;
import frc.robot.Robot;
import frc.robot.commands.FollowTrajectory;
import frc.robot.commands.arm.ArmFwdHome;
import frc.robot.commands.arm.ArmMotionMagicHold;
import frc.robot.commands.arm.ArmMotionMagicPos;
import frc.robot.commands.arm.ArmRevHome;
import frc.robot.commands.arm.SetArmPos;
import frc.robot.commands.auto.DriveForTime;
import frc.robot.commands.auto.DriveUntilWall;
import frc.robot.commands.intake.EjectCube;
import frc.robot.commands.intake.IntakeOn;
import frc.robot.commands.intake.IntakeStop;
import frc.robot.commands.intake.IntakeUntilCurrent;
import frc.robot.commands.intake.OpenIntakeOn;
import frc.robot.subsystems.Arm;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftSWTwoAndHalf extends CommandGroup {
	
	double ejectCubeTime = 0.5;

	public LeftSWTwoAndHalf() {
		super("CeneterSWpigeon");
		//If the switch is on the left make sure we turn before driving
		this.addParallel(new SetArmPos(Arm.Position.FwdPortal)); //Arm to 2nd Cube Position
		this.addSequential(new FollowTrajectory(new LeftSwitchCenter()),4);
		//this.addSequential(new DriveUntilWall());
		this.addParallel(new EjectCube(), ejectCubeTime);
		this.addSequential(new FollowTrajectory(new LeftSwitchCenter2()),6);
		this.addParallel(new ArmFwdHome());
		this.addParallel(new OpenIntakeOn(1));
		this.addSequential(new FollowTrajectory(new LeftSwitchCenter3()),4);
		this.addParallel(new IntakeOn(1),1);
		this.addSequential(new FollowTrajectory(new LeftSwitchCenter4()),4);//Backup to wall
		this.addParallel(new SetArmPos(Arm.Position.FwdPortal)); //Raise Arm to score
		this.addParallel(new IntakeStop());
		this.addSequential(new FollowTrajectory(new LeftSwitchCenter5()),5); //Drive to switch
		this.addParallel(new EjectCube(), ejectCubeTime);
		this.addSequential(new FollowTrajectory(new LeftSwitchCenter6()),5);//Back to Center
		this.addParallel(new SetArmPos(Arm.Position.Fwd2ndRowCube),5); //Arm to 2nd Cube Position
		this.addParallel(new IntakeOn(1)); // Turn intake on
		this.addSequential(new FollowTrajectory(new LeftSwitchCenter7()),5); //Drive Fwd and Intake
		this.addSequential(new FollowTrajectory(new LeftSwitchCenter8()),5); //Backup
		this.addParallel(new IntakeStop()); // Turn intake off
		this.addParallel(new SetArmPos(Arm.Position.FwdPortal)); //Raise Arm
		this.addSequential(new FollowTrajectory(new LeftSwitchCenter9()),5); //Drive Back to Switch
		//this.addSequential(new EjectCube(), ejectCubeTime);
		
		
	}


}
