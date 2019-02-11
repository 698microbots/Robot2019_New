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
	public Button lowestport = new JoystickButton(right, 4); //lowest port
	public Button middleport = new JoystickButton(right, 5); //middle port
	public Button highestport = new JoystickButton(right, 6); //highest port
	
	public OI()
	{
		//rightTrig.whenPressed(new PickupCargo());
		leftTrig.whenPressed(new TriggerCargo());
		rightTrig.whenPressed(new pickup());
		//leftTrig.whenReleased(new CargoOff());
		lowestport.whenPressed(new MoveElevator(100)); //change for rotations
		middleport.whenPressed(new MoveElevator(100)); //change for rotations
		highestport.whenPressed(new MoveElevator(100)); //change for rotations
	}
}
