package org.usfirst.frc.team5306.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RobotWait extends Command {
	private long wait;
	private long startTime;
	
    public RobotWait(long time) {
      
    	 this.wait = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	startTime = System.currentTimeMillis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	 return startTime + wait < System.currentTimeMillis();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
