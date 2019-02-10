/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.*;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class ElevatorSubsystem extends Subsystem 
{
  
  public static CANSparkMax spark = new CANSparkMax(3,  CANSparkMaxLowLevel.MotorType.kBrushless);
  public static CANEncoder en = new CANEncoder(spark);
  public static CANPIDController pid = new CANPIDController(spark); 

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void PID(double sp)
  {
    pid.setP(0.0);
    pid.setI(0.0);
    pid.setD(0.0);
    pid.setOutputRange(-1, 1);
    pid.setReference(sp, ControlType.kPosition);
  }

  public double getPosition()
  {
    return en.getPosition();
  }
}
