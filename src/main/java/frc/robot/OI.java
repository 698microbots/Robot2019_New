/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick left = new Joystick(0);
	public Joystick right = new Joystick(1);
	
	public Button leftTrig = new JoystickButton(left, 1);
	public Button rightTrig = new JoystickButton(right, 1);
	public Button leftButtonl = new JoystickButton(left, 4); //intake cargo
	public Button rightButtonl = new JoystickButton(left, 5); //shoot cargo
	public Button leftButtonr = new JoystickButton(right, 4); //up elevator
	public Button rightButtonr = new JoystickButton(right, 5); //down elevator
	
	public OI()
	{
		//rightTrig.whenPressed(new PickupCargo());
		leftTrig.whenPressed(new TriggerCargo());
		rightTrig.whenPressed(new pickup());
		//leftTrig.whenReleased(new CargoOff());
		//leftButtonr.whenPressed(new MoveElevator(true));
		//rightButtonr.whenPressed(new MoveElevator(false));
	}
}
