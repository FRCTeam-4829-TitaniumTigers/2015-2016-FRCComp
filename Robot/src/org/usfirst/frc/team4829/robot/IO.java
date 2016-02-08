package org.usfirst.frc.team4829.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.command.PrintCommand;

public class IO {
    // Create the joystick and the 8 buttons on it
	Joystick jStick;
	Button button1, button2, button3, button4, button5, button6, button7, button8;

	public IO(Joystick joy) {
		//Initialization of all variables. 
		jStick = joy;
		button1 = new JoystickButton(jStick, 1);
		button2 = new JoystickButton(jStick, 2);
		button3 = new JoystickButton(jStick, 3);
		button4 = new JoystickButton(jStick, 4);
		button5 = new JoystickButton(jStick, 5);
		button6 = new JoystickButton(jStick, 6);
		button7 = new JoystickButton(jStick, 7);
		button8 = new JoystickButton(jStick, 8);
		
		button1.whenPressed(new PrintCommand("Button One Pressed"));
		button2.whenPressed(new PrintCommand("Button Two Pressed"));
		button3.whenPressed(new PrintCommand("Button Three Pressed"));
		button4.whenPressed(new PrintCommand("Button Four Pressed"));
		button5.whenPressed(new PrintCommand("Button Five Pressed"));
		button6.whenPressed(new PrintCommand("Button Six Pressed"));
		button7.whenPressed(new PrintCommand("Button Seven Pressed"));
		button8.whenPressed(new PrintCommand("Button Eight"));
	}
	
}
