package frc.robot.commands;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

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
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(!Robot.m_oi.leftTrig.get())
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
