package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ElevatorSubsystem extends Subsystem 
{
	private static final Spark spark = new Spark(RobotMap.elevatorMotor);

    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void up()
    {
    	spark.set(0.5);
    }
    
    public void down()
    {
    	spark.set(-0.5);
    }
}

