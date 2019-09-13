
package frc.robot.commands.auto;

import frc.lib.drivers.GameState.Side;
import frc.lib.util.Debugger;
import frc.paths.ArcLeft;
import frc.paths.ArcRight;
import frc.paths.LeftSwitchCenter3;
import frc.robot.Robot;
import frc.robot.commands.FollowTrajectory;
import frc.robot.commands.auto.modes.DriveToLeftScale;
import frc.robot.commands.auto.modes.DriveToRightScale;

import edu.wpi.first.wpilibj.command.Command;

public class DriveToScale extends Command{

	private double throttle;
	private double time;
	
	public DriveToScale(){

	}

	protected void initialize(){
		if (Robot.gameState.scaleSide == Side.LEFT) {
			new DriveToLeftScale().start();
		} else {
			new DriveToRightScale().start();
		}
	}
	
	protected void execute(){
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
