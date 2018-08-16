package org.usfirst.frc.team5306.robot.commands;

import org.usfirst.frc.team5306.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class drivecar extends Command {

	private double leftpower;
	private double rightpower;
	private double time;
    public drivecar(double left,double right,double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivebase);
    	this.leftpower=left;
    	this.rightpower = right;
    	this.time = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivebase.DriveRobotbyTime(leftpower, rightpower, time);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivebase.Stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
