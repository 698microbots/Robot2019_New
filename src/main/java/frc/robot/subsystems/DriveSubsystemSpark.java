package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.JoystickDrive;
import frc.robot.commands.XboxDrive;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystemSpark extends Subsystem {

	private static final Spark driveRightRearMotorspark = new Spark(RobotMap.driveRightRearMotorspark);
	private static final Spark driveRightFrontMotorspark = new Spark(RobotMap.driveRightFrontMotorspark);
	private static final Spark driveLeftRearMotorspark = new Spark(RobotMap.driveLeftRearMotorspark);
	private static final Spark driveLeftFrontMotorspark = new Spark(RobotMap.driveLeftFrontMotorspark);
	
	private final static boolean rightEncoderInverted = false;
	private final static boolean leftEncoderInverted = false;
	private static final Encoder driveRightEncoder = new Encoder(RobotMap.driveRightEncoderChannelA, RobotMap.driveRightEncoderChannelB, rightEncoderInverted);
	private static final Encoder driveLeftEncoder = new Encoder(RobotMap.driveLeftEncoderChannelA, RobotMap.driveLeftEncoderChannelB, leftEncoderInverted);

    public void initDefaultCommand() {
    	setDefaultCommand(new XboxDrive());
    }
    /**
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
	
	public double getRightSpeed()
	{
		return driveRightFrontMotorspark.getSpeed();
	}
	
	public double getLeftSpeed()
	{
		return driveLeftFrontMotorspark.getSpeed();
	}
}

