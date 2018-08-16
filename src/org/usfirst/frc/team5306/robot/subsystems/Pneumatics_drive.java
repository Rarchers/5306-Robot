package org.usfirst.frc.team5306.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics_drive extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private static DoubleSolenoid doubleSolenoid ;
	
	public Pneumatics_drive() 
	{
		doubleSolenoid = new DoubleSolenoid(0,1);
	
	}
	
	public void close1() {
		doubleSolenoid.set(DoubleSolenoid.Value.kForward);
	}
	
	public void open1() {
		doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
	public void stop1() {
		doubleSolenoid.set(DoubleSolenoid.Value.kOff);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

