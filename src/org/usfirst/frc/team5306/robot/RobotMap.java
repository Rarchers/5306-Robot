/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5306.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	    public static SpeedController driveBaseSpeedControllerleftfront;
	    public static SpeedController driveBaseSpeedControllerleftback;
	    public static SpeedController driveBaseSpeedControllerrightfront;
	    public static SpeedControllerGroup driveBaseSpeedControllerGroupRight;
	    public static SpeedController driveBaseSpeedControllerrightback;
	    public static SpeedControllerGroup driveBaseSpeedControllerGroupLeft;
	    public static DifferentialDrive driveBaseDifferentialDrive;
	    public static DigitalInput limitSwitchup;
	    public static DigitalInput limitSwitchdown;
	    
	    public static SpeedController click;
	    
	    // arms take the cube
	    public static SpeedController takeleft;
	    public static SpeedController takeright;
	    
	    // arms for lift cube
	    public static SpeedController liftleft;
	    public static SpeedController liftright;
	    
	    
	    
	    public static void init() {
	    	driveBaseSpeedControllerleftfront = new Spark(0);
	    	driveBaseSpeedControllerleftback = new Spark(1);
	    	driveBaseSpeedControllerrightfront = new Spark(2);
	    	driveBaseSpeedControllerrightback = new Spark(3);
	    	driveBaseSpeedControllerGroupRight = new SpeedControllerGroup(driveBaseSpeedControllerrightback, driveBaseSpeedControllerrightfront);
	    	driveBaseSpeedControllerGroupLeft = new SpeedControllerGroup(driveBaseSpeedControllerleftback, driveBaseSpeedControllerleftfront);
	    	driveBaseDifferentialDrive = new DifferentialDrive(driveBaseSpeedControllerGroupLeft, driveBaseSpeedControllerGroupRight);
	    	
	    	// limit switch
	    	limitSwitchup = new DigitalInput(0);
	    	limitSwitchdown = new DigitalInput(1);
	    	//take
	    	takeleft = new Spark(4);
	    	takeright = new Spark(5);
	    	
	    	click = new Spark(8);
	    	//lift
	    	liftleft = new Spark(6);
	    	liftright = new Spark(7);
	
	    	//open a thread to show camera for drivers
	    new Thread(() -> {
			UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
			camera.setResolution(640, 480);
			camera.setFPS(30);
	

//			CvSink cvSink = CameraServer.getInstance().getVideo();
//			CvSource outputStream = CameraServer.getInstance().putVideo("Blur", 640,
//			480);
//			Mat source = new Mat();
//			Mat output = new Mat();
//			while(true) {
//			cvSink.grabFrame(source);
//			Imgproc.cvtColor(source, output, Imgproc.COLOR_BGR2GRAY);
//			outputStream.putFrame(output);
//			}
		}).start();
        
	
	
	
	
	
}
}
