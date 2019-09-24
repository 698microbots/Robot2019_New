package frc.robot.commands;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TriggerCargo extends Command {

    public TriggerCargo() {
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.cargoIntake.shoot();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //SmartDashboard.putNumber("Position", Robot.cargoIntake.getPosition());
        //SmartDashboard.putNumber("Velocity", Robot.cargoIntake.getVelocity());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
<<<<<<< HEAD
    	if(!Robot.m_oi.driverButtonLeftTrigger.get())
=======
    	if(!Robot.m_oi.driverButtonB.get())
>>>>>>> c84427eecf3fa3f78f968cea888e6cb66f21c448
    	{
    		return true;
    	}
    	else return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.cargoIntake.off();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	//Robot.cargoIntake.off();
    }
}
