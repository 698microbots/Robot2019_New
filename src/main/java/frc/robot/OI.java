/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.*;
import frc.robot.subsystems.CargoIntakeSubsystem;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private static final int LEFT_HORIZ_AXIS = 0;
	private static final int LEFT_VERT_AXIS = 1;
	private static final int RIGHT_HORIZ_AXIS = 4;
	private static final int RIGHT_VERT_AXIS = 5;
	
	public Joystick left = new Joystick(0);
	public Joystick right = new Joystick(1);

	
	public Button leftTrig = new JoystickButton(left, 1);
	/*public Button rightTrig = new JoystickButton(right, 1);
	public Button leftButtonl = new JoystickButton(left, 4); //intake cargo
	public Button rightButtonl = new JoystickButton(left, 5); //shoot cargo
	public Button lowestport = new JoystickButton(right, 4); //lowest port
	public Button middleport = new JoystickButton(right, 5); //middle port
	public Button highestport = new JoystickButton(right, 6); //highest port*/


	public Joystick driverController = new Joystick(0);
	public Button driverButtonA = new JoystickButton(driverController, 1); 
	public Button driverButtonB = new JoystickButton(driverController, 2);
	public Button driverButtonX = new JoystickButton(driverController, 3);
	public Button driverButtonY = new JoystickButton(driverController, 4);
	public Button driverButtonLeftBumper = new JoystickButton(driverController, 5);
	public Button driverButtonRightBumper = new JoystickButton(driverController, 6);
	public Button driverButtonBack = new JoystickButton(driverController, 7);
	public Button driverButtonStart = new JoystickButton(driverController, 8);
	public Button driverButtonLeftAxisPress = new JoystickButton(driverController, 9);
	public Button driverButtonRightAxisPress = new JoystickButton(driverController, 10);

	public OI()
	{
		driverButtonRightBumper.whenPressed(new PickupCargo());
		driverButtonLeftBumper.whenPressed(new AlignToTarget());
		driverButtonX.whenPressed(new PickHatch());
		driverButtonY.whenPressed(new PlaceHatch());
		driverButtonB.whenPressed(new TriggerCargo());
		/*rightTrig.whenPressed(new PickupCargo());
		leftTrig.whenPressed(new TriggerCargo());
		rightTrig.whenPressed(new pickup());
		leftTrig.whenReleased(new CargoOff());
		lowestport.whenPressed(new MoveElevator(100)); //change for rotations
		middleport.whenPressed(new MoveElevator(100)); //change for rotations
		highestport.whenPressed(new MoveElevator(100)); //change for rotations*/

	}

	public double getDriverRightY() {
		return -driverController.getRawAxis(RIGHT_VERT_AXIS);
	}

	public double getDriverRightX() {
		return driverController.getRawAxis(RIGHT_HORIZ_AXIS);
	}

	public double getDriverLeftY() {
		return -driverController.getRawAxis(LEFT_VERT_AXIS);
	}

	public double getDriverLeftX() {
		return driverController.getRawAxis(LEFT_HORIZ_AXIS);
	}
}
