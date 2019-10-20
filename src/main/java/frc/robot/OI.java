/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public XboxController	xbox0 	= new XboxController(2);
	public XboxController	xbox1 	= new XboxController(3);
	public int XBOX_R_XAXIS = 4;
	public int XBOX_R_YAXIS = 5;
	public int XBOX_L_XAXIS = 0;
	public int XBOX_L_YAXIS = 1;
	public Joystick left = new Joystick(1);
    public Joystick driverController = new Joystick(2);
	public Button driverButtonA = new JoystickButton(xbox0, 1); 
	public Button driverButtonB = new JoystickButton(xbox0, 2);
	public Button driverButtonX = new JoystickButton(xbox0, 3);
	public Button driverButtonY = new JoystickButton(xbox0, 4);
	public Button driverButtonLeftBumper = new JoystickButton(xbox0, 5);
	public Button driverButtonRightBumper = new JoystickButton(xbox0, 6);
	public Button driverButtonLeftTrigger = new JoystickButton(xbox0, 7);
	
	





	
	public Button Rocket0 = new JoystickButton(left, 1);
	public Button Rocket1 = new JoystickButton(left, 2);
	/*
	public Button Rocket2 = new JoystickButton(left, 3);
	public Button Rocket3 = new JoystickButton(left, 4);
	public Button Hatch1 = new JoystickButton(left, 5);
	public Button Hatch2 = new JoystickButton(left, 6);
	public Button Hatch3 = new JoystickButton(left, 7);
	public Button Elevup = new JoystickButton(left, 8);
	public Button Elevdwn = new JoystickButton(left, 9);
	public Button delpoy = new JoystickButton(left, 10);
	*/
	//public Button rightTrig = new JoystickButton(right, 1);
	//public Button leftButtonl = new JoystickButton(left, 4); //intake cargo
	//public Button rightButtonl = new JoystickButton(left, 5); //shoot cargo
	//public Button lowestport = new JoystickButton(right, 4); //lowest port
	//public Button middleport = new JoystickButton(right, 5); //middle port
	//public Button highestport = new JoystickButton(right, 6); //highest port
	
	public OI()
	{
		driverButtonX.whileHeld(new pickup());
		driverButtonY.whenPressed(new TriggerCargo());
		driverButtonLeftBumper.whenPressed(new PlaceHatch());
		driverButtonRightBumper.whenPressed(new PickHatch());

		
		//driverButtonRightTrigger.whenPressed(new TriggerCargo());
		//driverButtonA.whenPressed(new PickupCargo());
		//driverButtonB.whenPressed(new AlignToTarget());


		
		//Rocket0.whileHeld(new MoveElevator(true)); //change for rotations
		//Rocket1.whileHeld (new MoveElevator(false)); //change for rotations
		
		/*
		//Rocket0.whenPressed(new MoveElevator(100)); //change for rotations
		//Rocket1.whenPressed(new MoveElevator(100)); //change for rotations
		Rocket2.whenPressed(new MoveElevator(100)); //change for rotations
		Rocket3.whenPressed(new MoveElevator(100)); //change for rotations
		Hatch1.whenPressed(new MoveElevator(100)); //change for rotations
		Hatch2.whenPressed(new MoveElevator(100)); //change for rotations
		Hatch3.whenPressed(new MoveElevator(100)); //change for rotations
		Elevup.whenPressed(new MoveElevator(100)); //change for rotations
		Elevdwn.whenPressed(new MoveElevator(100)); //change for rotations
		*/
	}
	
	}


