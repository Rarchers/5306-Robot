 package org.usfirst.frc.team5306.robot.commands;

import org.usfirst.frc.team5306.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class pneumatics2close extends Command {

    public pneumatics2close() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	 requires(Robot.pneumatics_drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	 Robot.pneumatics_drive.close1();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.pneumatics_drive.stop1();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
