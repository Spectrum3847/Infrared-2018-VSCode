package frc.robot.commands.puncher;

import frc.robot.commands.intake.IntakeOn;
import frc.robot.commands.intake.OpenIntake;
import frc.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class FullPunchGroup extends CommandGroup {
	public FullPunchGroup() {
		this.addParallel(new OpenIntake(), 5.1);
		this.addSequential(new WaitCommand(.1));
		this.addSequential(new ShootPuncher(1));
		
	}
	
	public void initialize() {
		Intake.printDebug("Full Punch");
	}
	
}
