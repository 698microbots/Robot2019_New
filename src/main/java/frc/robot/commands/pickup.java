package frc.robot.commands;
import frc.robot.Robot;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class pickup extends Command {


	
    public pickup() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
		
		requires(Robot.cargoIntake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//light_state.setNumber(3);
    	Robot.cargoIntake.intake();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.cargoIntake.off();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

