
package frc.robot.commands.auto;

import frc.lib.util.Debugger;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class WaitBeforeAuton extends CommandGroup{
	
	public WaitBeforeAuton(double secs, Command cmd){
		this.addSequential(new WaitCommand(secs));
		this.addSequential(cmd);
	}

	protected void initialize(){
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}

	protected void end(){
	}
	
	public void isInterrupted(){
		this.end();
	}
}
