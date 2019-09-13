package frc.robot.commands.puncher;

import frc.robot.commands.intake.IntakeOn;
import frc.robot.commands.intake.OpenIntake;
import frc.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class HalfPunchGroup extends CommandGroup {
	public HalfPunchGroup() {
		this.addParallel(new OpenIntake(), 1);
		this.addSequential(new WaitCommand(.1));
		this.addSequential(new HalfPuncher());
	}
	

	public void initialize() {
		Intake.printDebug("Half Punch");
	}
}
