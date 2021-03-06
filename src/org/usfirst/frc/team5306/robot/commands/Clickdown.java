package org.usfirst.frc.team5306.robot.commands;

import org.usfirst.frc.team5306.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Clickdown extends Command {

    public Clickdown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.cubebase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.oi.joystickButton21.get()) {
			Robot.cubebase.clickdown();
		}
    	else {
			end();
		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.cubebase.clickstop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
