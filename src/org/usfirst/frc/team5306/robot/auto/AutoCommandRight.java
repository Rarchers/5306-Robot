package org.usfirst.frc.team5306.robot.auto;

import org.usfirst.frc.team5306.enums.AutoSelect;
import org.usfirst.frc.team5306.robot.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoCommandRight extends Command {

	private AutoSelect auto;
	private String temp;
	private boolean isFinished = false;
    public AutoCommandRight(String temp) {
    	requires(Robot.cubebase);
    	requires(Robot.drivebase);
    	requires(Robot.pneumatics_drive);
    	this.temp = temp;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (temp.equalsIgnoreCase("RRR")) {
			auto = AutoSelect.RightRightRight;
		}else if (temp.equalsIgnoreCase("RRL")) {
			auto = AutoSelect.RightRightLeft;
		}else if (temp.equalsIgnoreCase("RLR")) {
			auto = AutoSelect.RightLeftRight;
		}else if (temp.equalsIgnoreCase("RLL")) {
			auto = AutoSelect.RightLeftLeft;
		}else if (temp.equalsIgnoreCase("LRR")) {
			auto = AutoSelect.LeftRightRight;
		}else if (temp.equalsIgnoreCase("LRL")) {
			auto = AutoSelect.LeftRightLeft;
		}else if (temp.equalsIgnoreCase("LLR")) {
			auto = AutoSelect.LeftLeftRight;
		}else {
			auto = AutoSelect.LeftLeftLeft;
		}
    	
    	DriverStation.reportError("------------------------------------------------", false);
    	DriverStation.reportError("-------------------AutonomousRight----------------", false);
    	DriverStation.reportError("------------------" + auto + "--------------", false);
    	DriverStation.reportError("------------------------------------------------", false);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	switch (auto) {
    	case RightRightRight:
    		RightRightRight();
    		break;
    	case RightRightLeft:
    		RightRightRight();
    		break;
    	case RightLeftRight:
    		RightRightRight();
    		break;
    	case RightLeftLeft:
    		RightRightRight();
    		break;
    	case LeftRightRight:
    		RightRightRight();
    		break;
    	case LeftRightLeft:
    		RightRightRight();
    		break;
    	case LeftLeftRight:
    		RightRightRight();
    		break;
		case LeftLeftLeft:
			RightRightRight();
			break;
		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isFinished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
    private void RightRightRight() {
    	Robot.cubebase.stopall();
    	while (true) 
    	{
    		if (Robot.autotime.get()<1) {
    			Robot.drivebase.run(.7, -.7);
			}
    		if (Robot.autotime.get()>=1) {
    			Robot.drivebase.Stop();
    			break;
			}
    	
    	}
		
   	}
       
       private void RightRightLeft() {
    	   Robot.cubebase.stopall();
       	while (true) 
       	{
       		if (Robot.autotime.get()<0.7) {
       			Robot.drivebase.run(.5, -.5);
   			}
       		if (Robot.autotime.get()>=0.7) {
       			Robot.drivebase.Stop();
       			break;
   			}
       	
       	}
   	}
       
       private void RightLeftRight() {
    	   Robot.cubebase.stopall();
       	while (true) 
       	{
       		if (Robot.autotime.get()<0.7) {
       			Robot.drivebase.run(.5, -.5);
   			}
       		if (Robot.autotime.get()>=0.7) {
       			Robot.drivebase.Stop();
       			break;
   			}
       	
       	}
   		
   	}
       
    /*   private void LeftRightRight() {
    	   Robot.cubebase.stopall();
          	while (true) 
          	{
          		if (Robot.autotime.get()<0.7) {
          			Robot.drivebase.run(.5, -.5);
      			}
          		if (Robot.autotime.get()>=0.7) {
          			Robot.drivebase.Stop();
          			break;
      			}
          	
          	}
   		
   	}
       private void LeftRightLeft() {
    	   Robot.cubebase.stopall();
    	   while (true) 
         	{
         		if (Robot.autotime.get()<0.9) {
         			Robot.drivebase.run(1,- 1);
     			}
         		if (Robot.autotime.get()>=0.9&&Robot.autotime.get()<1.2) {
         			Robot.drivebase.run(1, 0);
     			}
         		if (Robot.autotime.get()>1.2) {
					Robot.drivebase.Stop();
					break;
				}
         	
         	}
      	}
          
       private void LeftLeftRight() {
    	   Robot.cubebase.stopall();
    	   while (true) 
         	{
         		if (Robot.autotime.get()<0.9) {
         			Robot.drivebase.run(1,- 1);
     			}
         		if (Robot.autotime.get()>=0.9&&Robot.autotime.get()<1.2) {
         			Robot.drivebase.run(1, 0);
     			}
         		if (Robot.autotime.get()>1.2) {
					Robot.drivebase.Stop();
					break;
				}
         	
         	}
      	}*/
          
       private void RightLeftLeft() {
    	   Robot.cubebase.stopall();
       	while (true) 
       	{
       		if (Robot.autotime.get()<0.7) {
       			Robot.drivebase.run(.5, -.5);
   			}
       		if (Robot.autotime.get()>=0.7) {
       			Robot.drivebase.Stop();
       			break;
   			}
       	
       	}
      	}
       
      /* private void LeftLeftLeft() {
    	   while (true) 
         	{
         		if (Robot.autotime.get()<0.9) {
         			Robot.drivebase.run(1,- 1);
     			}
         		if (Robot.autotime.get()>=0.9&&Robot.autotime.get()<1.2) {
         			Robot.drivebase.run(1, 0);
     			}
         		if (Robot.autotime.get()>1.2) {
					Robot.drivebase.Stop();
					break;
				}
         	
         	}
      	} 
       */
}
