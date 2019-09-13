package frc.robot.commands.auto.modes;

import frc.robot.Robot;
import frc.robot.commands.auto.DriveForTime;
import frc.robot.commands.auto.DriveUntilWall;
import frc.robot.commands.auto.InPlaceTurn;
import frc.robot.commands.intake.EjectCube;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CenterSWpigeon extends CommandGroup {

	public CenterSWpigeon() {
		super("CeneterSWpigeon");
		//If the switch is on the left make sure we turn before driving
		this.addSequential(new InPlaceTurn(Robot.prefs.getNumber("2A: CenterSW Pigeon Angle", 90)));
		this.addSequential(new DriveUntilWall(.6),10);
		this.addSequential(new EjectCube(), 3);
		this.addSequential(new DriveForTime(1,-.3));
	}


}
