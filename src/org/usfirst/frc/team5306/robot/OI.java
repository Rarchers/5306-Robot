/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5306.robot;

import org.usfirst.frc.team5306.robot.commands.Clickdown;
import org.usfirst.frc.team5306.robot.commands.Clickup;
import org.usfirst.frc.team5306.robot.commands.Emptycommand;
import org.usfirst.frc.team5306.robot.commands.Liftdown;
import org.usfirst.frc.team5306.robot.commands.Liftup;
import org.usfirst.frc.team5306.robot.commands.Takein;
import org.usfirst.frc.team5306.robot.commands.Takeout;
import org.usfirst.frc.team5306.robot.commands.pneumatics2close;
import org.usfirst.frc.team5306.robot.commands.pneumatics2open;
import org.usfirst.frc.team5306.robot.commands.test;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//define three joy_stick
  public Joystick joystick1;
  public Joystick joystick2;
  public Joystick joystick3;
  //define joy_stick 1 buttons
  public JoystickButton joystickButton11;
  public JoystickButton joystickButton12;
  public JoystickButton joystickButton21;
  public JoystickButton joystickButton22;
  public JoystickButton joystickButton34;
  public JoystickButton joystickButton32;
  public JoystickButton joystickButton35;
  public JoystickButton joystickButton36;
  public JoystickButton joystickButton31;
  public JoystickButton joystickButton33;
	    
public  OI() 
{
	
	//define every buttons
	 joystick1 = new Joystick(0);
	 joystick2 = new Joystick(1);
	 joystick3 = new Joystick(2);
	 joystickButton11 = new JoystickButton(joystick1, 1);
	 joystickButton12 = new JoystickButton(joystick1, 2);
	 joystickButton21 = new JoystickButton(joystick2, 1);
	 joystickButton22 = new JoystickButton(joystick2, 2);
	 joystickButton34 = new JoystickButton(joystick3, 4);
	 joystickButton32 = new JoystickButton(joystick3, 2);
	 joystickButton35 = new JoystickButton(joystick3, 5);
	 joystickButton36 = new JoystickButton(joystick3, 6);
	 joystickButton31 = new JoystickButton(joystick3, 1);
	 joystickButton33 = new JoystickButton(joystick3, 3);


	 
	 //update by Rarcher in 2018.7.12      this button now change for RobotStatus forehead
	 joystickButton11.whenPressed(new Clickdown());
	 joystickButton12.whenPressed(new Emptycommand());
	 joystickButton21.whenPressed(new Clickdown());
	 joystickButton22.whenPressed(new test());
	 joystickButton34.whenPressed(new Takein());
	 joystickButton32.whenPressed(new Takeout());
	 joystickButton31.whenPressed(new Liftup());
	 joystickButton33.whenPressed(new Liftdown());
	 joystickButton35.whenPressed(new pneumatics2close());
	 joystickButton36.whenPressed(new pneumatics2open());
	 
	 
	
}
	    
	   
}
