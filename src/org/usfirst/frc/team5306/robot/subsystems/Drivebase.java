package org.usfirst.frc.team5306.robot.subsystems;


import org.usfirst.frc.team5306.robot.RobotMap;
import org.usfirst.frc.team5306.robot.commands.driverobot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */

public class Drivebase extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private final DifferentialDrive differentialDrive = RobotMap.driveBaseDifferentialDrive;
    
//   

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new driverobot());	
    }
    @Override
    public void periodic() {
        // Put code here to be run every loop

    }
    
    public void DriveTank(double left, double right) {
    	
    	differentialDrive.tankDrive(left, right);
    }
    public void DriveArcade(double speed, double turn) {
    	differentialDrive.arcadeDrive(speed, turn);
    }
    
    public void Stop() {
    	differentialDrive.stopMotor();
     }
    
    public void DriveRobotbyTime(double leftpower,double rightpower,double second) 
    {
    	differentialDrive.tankDrive(leftpower, rightpower);
    	Timer.delay(second);
    	Stop();
    }
    
    public void TurnLeft45() 
    {
    	DriveRobotbyTime(1, -1, 500);
    }
    
    public void TurnRight45() {
    	differentialDrive.tankDrive(1,-1);
    	Timer.delay(.8);
    	Stop();
    }    
    
    public void TurnLeft90() 
    {
    	differentialDrive.tankDrive(-1, 1);
    	Timer.delay(1.5);
    	Stop();
    }
    
    public void TurnRight90() 
    {
    	differentialDrive.tankDrive(1, -1);
    	Timer.delay(1.5);
    	Stop();
    }
    
    public void run(double leftspeed,double rightspeed) 
    {
  RobotMap.driveBaseSpeedControllerGroupLeft.set(leftspeed);
  RobotMap.driveBaseSpeedControllerGroupRight.set(rightspeed);
    }
}

