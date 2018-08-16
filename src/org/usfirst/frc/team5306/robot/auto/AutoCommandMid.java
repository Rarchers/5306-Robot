package org.usfirst.frc.team5306.robot.auto;
import javax.swing.RootPaneContainer;

import org.usfirst.frc.team5306.enums.AutoSelect;
import org.usfirst.frc.team5306.robot.Robot;


import edu.wpi.first.wpilibj.DriverStation;

import edu.wpi.first.wpilibj.command.Command;

public class AutoCommandMid extends Command {
	
	private AutoSelect auto;
	private String temp;
    public AutoCommandMid(String temp) {
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
    	DriverStation.reportError("-------------------AutonomousMid----------------", false);
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
    		RightRightLeft();
    		break;
    	case RightLeftRight:
    		RightLeftRight();
    		break;
    	case RightLeftLeft:
    		RightLeftLeft();
    		break;
    	case LeftRightRight:
    		LeftRightRight();
    		break;
    	case LeftRightLeft:
    		LeftRightLeft();
    		break;
    	case LeftLeftRight:
    		LeftLeftRight();
    		break;
		case LeftLeftLeft:
			LeftLeftLeft();
			break;
		}
    	
		//Robot.drivebase.DriveTank(1, 1);
		//new drivecar(1, 1, 5);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    //details
    
    private void RightRightRight()  {
    	//first.take cube down and lift to high
    	Robot.cubebase.stopall();
    	while (true) 
    	{
    		//first.take cube down and lift to high
    		if (Robot.autotime.get()<.5) {
				Robot.cubebase.clickdown();//pay attention: maybe this is clickup()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
    		if (Robot.autotime.get()>=.5&&Robot.autotime.get()<2.5) {
    			Robot.cubebase.clickstop();
				Robot.cubebase.liftdown();//pay attention: maybe this is liftdown()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
    		 //about 300cm      note:  0.08*2->90*2=180cm   0.08*3->90*3=270cm  270+45=315cm->0.08*3+0.08/2=0.28s
    		if (Robot.autotime.get()>=2.5&&Robot.autotime.get()<3.9) {
				Robot.cubebase.stoplift();
				Robot.drivebase.run(.53, -.53 );
			}
    		if (Robot.autotime.get()>=3.9&&Robot.autotime.get()<5.9) {
				Robot.cubebase.stopall();
				Robot.drivebase.Stop();
			}
    		if (Robot.autotime.get()>5.9&&Robot.autotime.get()<6.2) {
				Robot.pneumatics_drive.close1();
			}
    		if (Robot.autotime.get()>6.2) {
    			Robot.cubebase.stopall();
				Robot.drivebase.Stop();
				break;
			}
    		
    	}
	}
    
    private void RightRightLeft() {
    	//first.take cube down and lift to high
    	Robot.cubebase.stopall();
    	while (true) 
    	{
    		//first.take cube down and lift to high
    		if (Robot.autotime.get()<.5) {
				Robot.cubebase.clickdown();//pay attention: maybe this is clickup()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
    		if (Robot.autotime.get()>=.5&&Robot.autotime.get()<2.5) {
    			Robot.cubebase.clickstop();
				Robot.cubebase.liftdown();//pay attention: maybe this is liftdown()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
    		 //about 300cm      note:  0.08*2->90*2=180cm   0.08*3->90*3=270cm  270+45=315cm->0.08*3+0.08/2=0.28s
    		if (Robot.autotime.get()>=2.5&&Robot.autotime.get()<3.9) {
				Robot.cubebase.stoplift();
				Robot.drivebase.run(.53, -.53 );
			}
    		if (Robot.autotime.get()>=3.9&&Robot.autotime.get()<5.9) {
				Robot.cubebase.stopall();
				Robot.drivebase.Stop();
			}
    		if (Robot.autotime.get()>5.9&&Robot.autotime.get()<6.2) {
				Robot.pneumatics_drive.close1();
			}
    		if (Robot.autotime.get()>6.2) {
    			Robot.cubebase.stopall();
				Robot.drivebase.Stop();
				break;
			}
    	}
	}
    
    private void RightLeftRight() {
    	//first.take cube down and lift to high
    	Robot.cubebase.stopall();
    	while (true) 
    	{
    		//first.take cube down and lift to high
    		if (Robot.autotime.get()<.5) {
				Robot.cubebase.clickdown();//pay attention: maybe this is clickup()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
    		if (Robot.autotime.get()>=.5&&Robot.autotime.get()<2.5) {
    			Robot.cubebase.clickstop();
				Robot.cubebase.liftdown();//pay attention: maybe this is liftdown()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
    		 //about 300cm      note:  0.08*2->90*2=180cm   0.08*3->90*3=270cm  270+45=315cm->0.08*3+0.08/2=0.28s
    		if (Robot.autotime.get()>=2.5&&Robot.autotime.get()<3.9) {
				Robot.cubebase.stoplift();
				Robot.drivebase.run(.53, -.53 );
			}
    		if (Robot.autotime.get()>=3.9&&Robot.autotime.get()<5.9) {
				Robot.cubebase.stopall();
				Robot.drivebase.Stop();
			}
    		if (Robot.autotime.get()>5.9&&Robot.autotime.get()<6.2) {
				Robot.pneumatics_drive.close1();
			}
    		if (Robot.autotime.get()>6.2) {
    			Robot.cubebase.stopall();
				Robot.drivebase.Stop();
				break;
    		}}
    		
		
	}
    
    private void LeftRightRight() {
    	//first.take cube down and lift to high
    	Robot.cubebase.stopall();
    	while (true) 
    	{
    		//first.take cube down and lift to high
    		if (Robot.autotime.get()<1) {
				Robot.drivebase.run(.53, -.53);
			}
    		if (Robot.autotime.get()>=1) {
				Robot.drivebase.Stop();
				break;
			}
    		
    	
    	}
		
	}
    private void LeftRightLeft() {
    	//first.take cube down and lift to high
    	Robot.cubebase.stopall();
    	while (true) 
    	{
    		//first.take cube down and lift to high
    		if (Robot.autotime.get()<1) {
				Robot.drivebase.run(.53, -.53);
			}
    		if (Robot.autotime.get()>=1) {
				Robot.drivebase.Stop();
				break;
			}
    		
    	
    	}
   	}
       
    private void LeftLeftRight() {
    	//first.take cube down and lift to high
    	Robot.cubebase.stopall();
    	while (true) 
    	{
    		//first.take cube down and lift to high
    		if (Robot.autotime.get()<1) {
				Robot.drivebase.run(.53, -.53);
			}
    		if (Robot.autotime.get()>=1) {
				Robot.drivebase.Stop();
				break;
			}
    		
    	
    	}
   	}
       
    private void RightLeftLeft() {
    	//first.take cube down and lift to high
    	Robot.cubebase.stopall();
    	while (true) 
    	{
    		//first.take cube down and lift to high
    		if (Robot.autotime.get()<.5) {
				Robot.cubebase.clickdown();//pay attention: maybe this is clickup()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
    		if (Robot.autotime.get()>=.5&&Robot.autotime.get()<2.5) {
    			Robot.cubebase.clickstop();
				Robot.cubebase.liftdown();//pay attention: maybe this is liftdown()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
    		 //about 300cm      note:  0.08*2->90*2=180cm   0.08*3->90*3=270cm  270+45=315cm->0.08*3+0.08/2=0.28s
    		if (Robot.autotime.get()>=2.5&&Robot.autotime.get()<3.9) {
				Robot.cubebase.stoplift();
				Robot.drivebase.run(.53, -.53 );
			}
    		if (Robot.autotime.get()>=3.9&&Robot.autotime.get()<5.9) {
				Robot.cubebase.stopall();
				Robot.drivebase.Stop();
			}
    		if (Robot.autotime.get()>5.9&&Robot.autotime.get()<6.2) {
				Robot.pneumatics_drive.close1();
			}
    		if (Robot.autotime.get()>6.2) {
    			Robot.cubebase.stopall();
				Robot.drivebase.Stop();
				break;
			}
    		
    		
    		
    	
    	}
   	}
    
    private void LeftLeftLeft() { 
    	//first.take cube down and lift to high
    	Robot.cubebase.stopall();
    	while (true) 
    	{
    		//first.take cube down and lift to high
    		if (Robot.autotime.get()<1) {
				Robot.drivebase.run(.53, -.53);
			}
    		if (Robot.autotime.get()>=1) {
				Robot.drivebase.Stop();
				break;
			}
    		
    	
    	}
		}
		
    
    
    
    
    
    
 /*   private void data() {
    	//left 90
    	Robot.cubebase.stopall();
    	while (true) 
    	{
    		
    		if (Robot.autotime.get()<0.15) {
				Robot.drivebase.run(-1,-1 );
			}
    	
    	
    	//==========================================
    
    	while (true) 
    	{
    		
    		if (Robot.autotime.get()<0.08) {
    			//one car long 89cm
				Robot.drivebase.run(-1, 1 );
			}
    	
    	}
	}
	Robot.cubebase.stopall();
    	while (true) 
    	{
    		//first.take cube down and lift to high
    		if (Robot.autotime.get()<.5) {
				Robot.cubebase.clickdown();//pay attention: maybe this is clickup()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
    		if (Robot.autotime.get()>=.5&&Robot.autotime.get()<2) {
    			Robot.cubebase.clickstop();
				Robot.cubebase.liftdown();//pay attention: maybe this is liftdown()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
    		if (Robot.autotime.get()>=2&&Robot.autotime.get()<2.07) {
    			Robot.cubebase.stoplift();
				Robot.drivebase.run(-.5, -.5 );
			}
    		 //about 300cm      note:  0.08*2->90*2=180cm   0.08*3->90*3=270cm  270+45=315cm->0.08*3+0.08/2=0.28s
    		if (Robot.autotime.get()>=2.07&&Robot.autotime.get()<3.07) {
				
				Robot.drivebase.run(.5, -.5 );
			}
    		
    		if (Robot.autotime.get()>=3.07&&Robot.autotime.get()<3.5) {
				Robot.cubebase.stopall();
				Robot.drivebase.Stop();
			}
    		if (Robot.autotime.get()>=3.5&&Robot.autotime.get()<3.57) {
    			Robot.cubebase.stoplift();
				Robot.drivebase.run(.5, .5 );
			}
    		if (Robot.autotime.get()>=3.57&&Robot.autotime.get()<4) {
				Robot.cubebase.stopall();
				Robot.drivebase.Stop();
			}
    		if (Robot.autotime.get()>4&&Robot.autotime.get()<4.1) {
				Robot.pneumatics_drive.close1();
			}
    		if (Robot.autotime.get()>4.1) {
    			Robot.cubebase.stopall();
				Robot.drivebase.Stop();
			}
    		
    	
    	}
}*/
    


}
