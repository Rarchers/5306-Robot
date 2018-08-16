/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5306.robot;


import org.usfirst.frc.team5306.robot.auto.AutoCommandLeft;
import org.usfirst.frc.team5306.robot.auto.AutoCommandMid;
import org.usfirst.frc.team5306.robot.auto.AutoCommandRight;
import org.usfirst.frc.team5306.robot.auto.Nothing;
import org.usfirst.frc.team5306.robot.subsystems.Cubebase;
import org.usfirst.frc.team5306.robot.subsystems.Drivebase;
import org.usfirst.frc.team5306.robot.subsystems.Pneumatics_drive;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {

	public static Drivebase drivebase;
	public static Pneumatics_drive pneumatics_drive;
	public static OI oi;
	public static Cubebase cubebase;
	public static Timer autotime;
	Command autonomousCommand;

	SendableChooser<Command> chooser = new SendableChooser<>();
	
	
	

	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		RobotMap.init();
		drivebase = new Drivebase();
		cubebase = new Cubebase();
		pneumatics_drive = new Pneumatics_drive();
		autotime = new Timer();
		oi = new OI();
	
		//Autonomous Chooser init
		chooser.addDefault("Default Auto",new Nothing());
	    chooser.addObject("Left Auto", new AutoCommandLeft(DriverStation.getInstance().getGameSpecificMessage()));
	    chooser.addObject("Mid Auto", new AutoCommandMid(DriverStation.getInstance().getGameSpecificMessage()));
	    chooser.addObject("Right Auto", new AutoCommandRight(DriverStation.getInstance().getGameSpecificMessage()));
		SmartDashboard.putData("Auto mode", chooser);
		//autoChooser.addObject(AutoSelect.values()[2].toString(),AutoSelect.values()[2]);
		
		
	
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
	    autonomousCommand = chooser.getSelected();
		if (autonomousCommand!=null) autonomousCommand.start();
		autotime.start();
		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
