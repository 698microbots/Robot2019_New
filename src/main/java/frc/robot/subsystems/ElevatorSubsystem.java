/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.MoveElevator;

/**
 * Add your docs here.
 */
public class ElevatorSubsystem extends Subsystem 
{
  
  
  public static CANSparkMax spark = new CANSparkMax(RobotMap.elevatorMotor,  CANSparkMaxLowLevel.MotorType.kBrushless);
 // public static CANPIDController pid = spark.getPIDController();
  //public static CANEncoder en = spark.getEncoder();
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new MoveElevator());
  }

  public void PID(double sp)
  {
    //pid.setP(0.0);
    //pid.setI(0.0);
    //pid.setD(0.0);
    //pid.setOutputRange(-1, 1);
    //pid.setReference(sp, ControlType.kPosition);
  }

  /*
 public double getPosition()
  {
    return en.getPosition();
  }
  */
  /*
  public void upElevator()
  {
    spark.set(0.5);
  }
  */
  public void setElevator(double numElevator)
  {
    spark.set(numElevator);
  }
/*
  public void downElevator()
  {
    spark.set(-0.1);
  }
  */
}

