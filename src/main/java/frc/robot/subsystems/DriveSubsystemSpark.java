package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.Encoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystemSpark extends Subsystem {

	private static final CANSparkMax driveRightRearMotorspark = new CANSparkMax(RobotMap.driveRightRearMotorspark ,  CANSparkMaxLowLevel.MotorType.kBrushless);
	private static final CANSparkMax driveRightFrontMotorspark = new CANSparkMax(RobotMap.driveRightFrontMotorspark ,  CANSparkMaxLowLevel.MotorType.kBrushless);
	private static final CANSparkMax driveLeftRearMotorspark = new CANSparkMax(RobotMap.driveLeftRearMotorspark ,  CANSparkMaxLowLevel.MotorType.kBrushless);
	private static final CANSparkMax driveLeftFrontMotorspark = new CANSparkMax(RobotMap.driveLeftFrontMotorspark ,  CANSparkMaxLowLevel.MotorType.kBrushless);
	
	//private final static boolean rightEncoderInverted = false;
	//private final static boolean leftEncoderInverted = false;
	//private static final Encoder driveRightEncoder = new Encoder(RobotMap.driveRightEncoderChannelA, RobotMap.driveRightEncoderChannelB, rightEncoderInverted);
	//private static final Encoder driveLeftEncoder = new Encoder(RobotMap.driveLeftEncoderChannelA, RobotMap.driveLeftEncoderChannelB, leftEncoderInverted);

    public void initDefaultCommand() {
    	setDefaultCommand(new JoystickDrive());
    }
    /**s
	 * Set the speed of the two right motors
	 * @param speed between -1 and 1
	 */
	public void setRightSpeed(double speed) {
		speed = -speed;
		if(speed<-1) speed =-1;
		if(speed>1) speed=1;
		driveRightRearMotorspark.set(speed);
		driveRightFrontMotorspark.set(speed);
	}
	
	/**
	 * Set the speed of the two left motors
	 * @param speed between -1 and 1
	 */
	public void setLeftSpeed(double speed) {
		if(speed<-1) speed =-1;
		if(speed>1) speed=1;
		driveLeftRearMotorspark.set(speed);
		driveLeftFrontMotorspark.set(speed);
	}
	
	/*
	public double getRightSpeed()
	{
		return driveRightFrontMotorspark.getSpeed();
	}
	
	public double getLeftSpeed()
	{
		return driveLeftFrontMotorspark.getSpeed();
	}
	*/
}

