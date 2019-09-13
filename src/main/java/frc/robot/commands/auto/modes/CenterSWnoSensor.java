package frc.robot.commands.auto.modes;

import frc.lib.drivers.GameState;
import frc.robot.Robot;
import frc.robot.commands.auto.DriveForTime;
import frc.robot.commands.auto.DriveUntilWall;
import frc.robot.commands.auto.SWTurnForTime;
import frc.robot.commands.auto.TurnForTime;
import frc.robot.commands.intake.IntakeOn;
import frc.robot.commands.intake.OpenIntake;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CenterSWnoSensor extends CommandGroup {

	public CenterSWnoSensor() {
		super("CeneterSWnoSensor");
		//If the switch is on the left make sure we turn before driving
		this.addSequential(new SWTurnForTime(Robot.prefs.getNumber("2A: SW Turn Time", 1),
					Robot.prefs.getNumber("2A: SW Turn Throttle", -.3)));
		this.addSequential(new DriveUntilWall(.6),10);
		this.addSequential(new IntakeOn(-1));
		this.addSequential(new DriveForTime(1,-.3));
	}


}
