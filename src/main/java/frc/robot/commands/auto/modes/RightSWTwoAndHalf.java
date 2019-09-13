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

public class RightSWTwoAndHalf extends CommandGroup {
	
	double ejectCubeTime = 0.5;

	public RightSWTwoAndHalf() {
		super("CeneterSWpigeon");
		//If the switch is on the left make sure we turn before driving
		this.addParallel(new SetArmPos(Arm.Position.FwdPortal)); //Arm to 2nd Cube Position
		this.addSequential(new FollowTrajectory(new RightSwitchCenter()),4);
		//this.addSequential(new DriveUntilWall());
		this.addParallel(new EjectCube(), ejectCubeTime);
		this.addSequential(new FollowTrajectory(new RightSwitchCenter2()),6);
		this.addParallel(new ArmFwdHome());
		this.addParallel(new OpenIntakeOn(1));
		this.addSequential(new FollowTrajectory(new RightSwitchCenter3()),4);
		this.addParallel(new IntakeOn(1),1);
		this.addSequential(new FollowTrajectory(new RightSwitchCenter4()),4);//Backup to wall
		this.addParallel(new SetArmPos(Arm.Position.FwdPortal)); //Raise Arm to score
		this.addParallel(new IntakeStop());
		this.addSequential(new FollowTrajectory(new RightSwitchCenter5()),5); //Drive to switch
		this.addParallel(new EjectCube(), ejectCubeTime);
		this.addSequential(new FollowTrajectory(new RightSwitchCenter6()),5);//Back to Center
		this.addParallel(new SetArmPos(Arm.Position.Fwd2ndRowCube),5); //Arm to 2nd Cube Position
		this.addParallel(new IntakeOn(1)); // Turn intake on
		this.addSequential(new FollowTrajectory(new RightSwitchCenter7()),5); //Drive Fwd and Intake
		this.addSequential(new FollowTrajectory(new RightSwitchCenter8()),5); //Backup
		this.addParallel(new IntakeStop()); // Turn intake off
		this.addParallel(new SetArmPos(Arm.Position.FwdPortal)); //Raise Arm
		this.addSequential(new FollowTrajectory(new RightSwitchCenter9()),5); //Drive Back to Switch
		//this.addSequential(new EjectCube(), ejectCubeTime);
		
		
	}


}
