package org.usfirst.frc.team5306.robot.subsystems;

import org.usfirst.frc.team5306.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Cubebase extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void intake() 
    {
    	RobotMap.takeleft.set(1);
    	RobotMap.takeright.set(-1);
    }
    
    public void outtake() {
		RobotMap.takeleft.set(-1);
		RobotMap.takeright.set(1);
	}
    
    public void stoptake() {
		RobotMap.takeleft.set(0);
		RobotMap.takeright.set(0);
	}
    
    public void liftup() 
    {
    	RobotMap.liftleft.set(1);
    	RobotMap.liftright.set(1);
    }
    
    public void liftdown() {
		RobotMap.liftleft.set(-1);
		RobotMap.liftright.set(-1);
	}
    
    public void stoplift() {
		RobotMap.liftleft.set(0);
		RobotMap.liftright.set(0);
	}
    
    public void clickdown() 
    {
    	RobotMap.click.set(.5);
    }
    
    public void clickup() 
    {
    	RobotMap.click.set(-1);
    }
    
    public void clickstop() 
    {
    	RobotMap.click.set(0);
    }
    public void stopall() 
    {
    stoplift();
    stoptake();
    }
    
}

