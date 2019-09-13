
package frc.robot.commands.auto;

import frc.lib.util.Debugger;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveForTime extends Command{

	private double throttle;
	private double time;
	
	public DriveForTime(double time, double throttle){
		this.time = time;
		this.setTimeout(time);
		this.throttle = throttle;
		this.requires(Robot.drive);
	}

	protected void initialize(){
	}
	
	protected void execute(){
		Robot.drive.difDrive.curvatureDrive(throttle, 0, false);
	}
	
	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end(){
		Debugger.println("DRIVE FOR TIME FINISHED", Robot._auton, Debugger.info3);
		Robot.drive.difDrive.tankDrive(0, 0);
	}
	
	public void isInterrupted(){
		Debugger.println("DRIVE FOR TIME INTERRUPTED", Robot._auton, Debugger.info3);
		this.end();
	}
}
