package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CargoIntakeSubsystem extends Subsystem {

    Spark cargoMotor = new Spark(RobotMap.cargoIntakeMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void intake()
    {
    	cargoMotor.set(.5);
    }
    
    public void shoot()
    {
    	cargoMotor.set(-.5);
    }
    
    public void off()
    {
    	cargoMotor.set(0.0);
    }
}

