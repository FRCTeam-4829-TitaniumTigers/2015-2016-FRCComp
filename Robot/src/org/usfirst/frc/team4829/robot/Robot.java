
package org.usfirst.frc.team4829.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    final String defaultAuto = "Default";
    final String customAuto = "My Auto";
    String autoSelected;
    SendableChooser chooser;
    
    //My Variables
    private CANTalon rightFront, leftFront, rightBack, leftBack;
    private RobotDrive driveTrain;
    private Joystick moveStick;
    private IO inputOutput;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        chooser = new SendableChooser();
        chooser.addDefault("Default Auto", defaultAuto);
        chooser.addObject("My Auto", customAuto);
        SmartDashboard.putData("Auto choices", chooser);
        
        //Custom Variable initialization. 
        rightFront = new CANTalon(RobotMap.rightFrontMotor);
        leftFront = new CANTalon(RobotMap.leftFrontMotor);
        rightBack = new CANTalon(RobotMap.rightBackMotor);
        leftBack = new CANTalon(RobotMap.leftBackMotor);
        try {
        	inputOutput = new IO(moveStick);
        }catch(Exception e){
        	System.out.println(e);
        };
        	
        driveTrain = new RobotDrive(rightFront, leftFront, rightBack, leftBack);
        moveStick = new Joystick(RobotMap.driveJoystrickUSB);
    }
    
	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString line to get the auto name from the text box
	 * below the gyroscope.
	 *
	 * You can add additional auto modes by adding additional comparisons to the switch structure below with additional strings.
	 * If using the SendableChooser make sure to add them to the chooser code above as well.
	 */
    public void autonomousInit() {
    	autoSelected = (String) chooser.getSelected();
//		autoSelected = SmartDashboard.getString("Auto Selector", defaultAuto);
		System.out.println("Auto selected: " + autoSelected);
    }

    /**
     * This function is called periodically during autonomous
     * Called every 20 milliseconds
     */
    public void autonomousPeriodic() {
    	switch(autoSelected) {
    	case customAuto:
        //Put custom auto code here   
            break;
    	case defaultAuto:
    	default:
    	//Put default auto code here
            break;
    	}
    	
    	driveTrain.drive(.5, 0);
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        driveTrain.arcadeDrive(moveStick);
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
