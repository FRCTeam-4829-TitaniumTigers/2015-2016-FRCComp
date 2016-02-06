package org.usfirst.frc.team4829.robot;

import edu.wpi.first.wpilibj.Joystick;

public class JoystickModified {
	
	String stickType;
	
	public JoystickModified(Joystick joy) {
		
		if(joy.getIsXbox())
			stickType = "xbox";
		else
			stickType = "attack3";
		
	}
	
}
