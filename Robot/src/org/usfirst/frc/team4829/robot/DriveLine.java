package org.usfirst.frc.team4829.robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.CANTalon;


/**
 *
 */
public class DriveLine extends Subsystem {
    
	private RobotDrive driveTrain;
	private CANTalon rightFront, leftFront, rightBack, leftBack;
	
	public DriveLine() {
		
		super("DriveLine");
		
		rightFront = new CANTalon(RobotMap.rightFrontMotor);
        leftFront = new CANTalon(RobotMap.leftFrontMotor);
        rightBack = new CANTalon(RobotMap.rightBackMotor);
        leftBack = new CANTalon(RobotMap.leftBackMotor);
        
        driveTrain = new RobotDrive(rightFront, leftFront, rightBack, leftBack);
		
	}

    public void initDefaultCommand() {
    	//So far we dont have any commands to run in this file, although it must be called as it is a 
    	//class from Subsystem.
    }
}

