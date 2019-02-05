package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class HatchIntakeSubsystem extends Subsystem {

	DoubleSolenoid HatchSolenoid = new DoubleSolenoid(RobotMap.HatchSolenoidForwardPort,RobotMap.HatchSolenoidReturnPort);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void extendPiston()
    {
    	HatchSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void retractPiston()
    {
    	HatchSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
}

