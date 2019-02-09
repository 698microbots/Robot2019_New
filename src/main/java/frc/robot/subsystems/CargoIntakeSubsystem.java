package frc.robot.subsystems;

import frc.robot.RobotMap;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CargoIntakeSubsystem extends Subsystem {

    //Spark cargoMotor = new Spark(RobotMap.cargoIntakeMotor);
    public static CANSparkMax cargoMotor = new CANSparkMax(0,  CANSparkMaxLowLevel.MotorType.kBrushless);
	public static CANEncoder en = new CANEncoder(cargoMotor);

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

    public double getPosition()
    {
        return en.getPosition();
    }

    public double getVelocity()
    {
        return en.getVelocity();
    }
}

