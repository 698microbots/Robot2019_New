/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

public class XboxDrive extends Command {

  double kp = SmartDashboard.getNumber("kp", .025);
	double max_thresh = .12;
	double min_thresh = .08;
  public XboxDrive() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.drive);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.gyro.reset();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
<<<<<<< HEAD:src/main/java/frc/robot/commands/pickup.java
    //SmartDashboard.putNumber("Position", Robot.cargoIntake.getPosition());
    //SmartDashboard.putNumber("Velocity", Robot.cargoIntake.getVelocity());
=======
    if(Math.abs(Robot.m_oi.getDriverRightX()) > max_thresh)
    	{
    		Robot.drive.setRightSpeed(-Robot.m_oi.getDriverRightX());
        	Robot.drive.setLeftSpeed(Robot.m_oi.getDriverRightX());
        	Robot.gyro.reset();
    	}
    	else if(Math.abs(Robot.m_oi.getDriverRightX()) > min_thresh)
    	{
    		Robot.drive.setRightSpeed(0);
        	Robot.drive.setLeftSpeed(0);
    	}
    	
		double angle = Robot.gyro.getAngle();
    	//double angle = 0;
		
		Robot.drive.setRightSpeed((Robot.m_oi.getDriverLeftY() + angle*kp));
    	Robot.drive.setLeftSpeed((Robot.m_oi.getDriverLeftY() - angle*kp));

    	SmartDashboard.putNumber("Left Speed", (Robot.m_oi.getDriverLeftY() + angle*kp));
    	SmartDashboard.putNumber("Right Speed", (Robot.m_oi.getDriverLeftY() - angle*kp));
    	SmartDashboard.putNumber("Angle", Robot.gyro.getAngle());
>>>>>>> c84427eecf3fa3f78f968cea888e6cb66f21c448:src/main/java/frc/robot/commands/XboxDrive.java
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
<<<<<<< HEAD:src/main/java/frc/robot/commands/pickup.java
    if(!Robot.m_oi.driverButtonRightTrigger.get())
    	{
    		return true;
    	}
    	else return false;
=======
    return false;
>>>>>>> c84427eecf3fa3f78f968cea888e6cb66f21c448:src/main/java/frc/robot/commands/XboxDrive.java
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.drive.setRightSpeed(0);
    Robot.drive.setLeftSpeed(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
