package org.usfirst.frc.team5306.robot.commands;

import org.usfirst.frc.team5306.robot.Robot;


import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Lift extends Command {

    public Lift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis); 
    	requires(Robot.cubebase);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	/*if (Robot.oi.joystick3.getY()>0&&RobotMap.limitSwitchup.get()) {
    		RobotMap.liftleft.set(0);
        	RobotMap.liftleft.set(0);
		}
    	else if (Robot.oi.joystick3.getY()<0&&RobotMap.limitSwitchup.get()) {
    		RobotMap.liftleft.set(Robot.oi.joystick3.getY());
        	RobotMap.liftleft.set(Robot.oi.joystick3.getY());
		}
    	else if (Robot.oi.joystick3.getY()<0&&RobotMap.limitSwitchdown.get()) {
    		RobotMap.liftleft.set(0);
        	RobotMap.liftleft.set(0);
		}
    	else if (Robot.oi.joystick3.getY()>0&&RobotMap.limitSwitchdown.get()) {
    		RobotMap.liftleft.set(Robot.oi.joystick3.getY());
        	RobotMap.liftleft.set(Robot.oi.joystick3.getY());
		}
    	else if (!RobotMap.limitSwitchdown.get()&&!RobotMap.limitSwitchup.get()) {
			RobotMap.liftleft.set(Robot.oi.joystick3.getY());
    	    RobotMap.liftleft.set(Robot.oi.joystick3.getY());
		}*/
    	
    /*	if (Robot.oi.joystickButton31.get()) {
    		RobotMap.liftleft.set(.5);
    	    RobotMap.liftleft.set(.5);
		}
    	if (Robot.oi.joystickButton33.get()) {
    		RobotMap.liftleft.set(-.5);
    	    RobotMap.liftleft.set(-.5);
		}
    	else {
    		RobotMap.liftleft.set(0);
    	    RobotMap.liftleft.set(0);
		}*/
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
