package frc.robot.commands;
import frc.robot.Robot;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class PickupCargo extends Command {


	NetworkTableEntry tx,ty,ta,tv;
	double x,y,a;
	double kp = SmartDashboard.getNumber("kp", .025);
	double thresh = 4;
	double sp_max = .5;
	double sp = 0.25;
	NetworkTableEntry light_state = Robot.limelight.getEntry("pipeline");
    public PickupCargo() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
		requires(Robot.drive);
		requires(Robot.cargoIntake);
    	light_state.setNumber(1);
    	tx = Robot.limelight.getEntry("tx");
    	ty = Robot.limelight.getEntry("ty");
    	ta = Robot.limelight.getEntry("ta");
    	tv = Robot.limelight.getEntry("tv");
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//light_state.setNumber(3);
    	//Robot.cargoIntake.shoot();
    	Timer.delay(.5);
    	x = tx.getDouble(0.0);
    	y = ty.getDouble(0.0);
		a = ta.getDouble(0.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	x = tx.getDouble(0.0);
		a = ta.getDouble(0.0);
    	SmartDashboard.putNumber("target", tv.getDouble(0.0));
    	/*if(x > 0)
    	{
    		//x = Math.abs(x);
    		Robot.drive.setRightSpeed(Math.max(((sp - x*kp)<sp_max?(sp - x*kp):sp_max)/(a*.1),0));
        	Robot.drive.setLeftSpeed(Math.min((sp + x*kp)/(a*.1), sp_max));
        	
        	SmartDashboard.putNumber("right speed",Math.max(((sp - x*kp)<sp_max?(sp - x*kp):sp_max)/(a*.1),0));
        	SmartDashboard.putNumber("left speed",Math.min((sp + x*kp)/(a*.1), sp_max));
    	}
    	else
    	{
    		x=Math.abs(x);
    		Robot.drive.setRightSpeed(Math.min((sp + x*kp)/(a*.1), sp_max));
    		Robot.drive.setLeftSpeed(Math.max(((sp - x*kp)<sp_max?(sp - x*kp):sp_max)/(a*.1),0));
    		SmartDashboard.putNumber("right speed",Math.min((sp + x*kp)/(a*.1), sp_max));
        	SmartDashboard.putNumber("left speed",Math.max(((sp - x*kp)<sp_max?(sp - x*kp):sp_max)/(a*.1),0));
    	}
    	SmartDashboard.putNumber("ta",a);
    	*/
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
		a = ta.getDouble(0.0);
		return true;
    	/*if(a >= thresh || tv.getDouble(0.0) == 0.0)
    	{
    		Robot.drive.setLeftSpeed(0);
    		Robot.drive.setRightSpeed(0);
    		Robot.cargoIntake.off();
    		return true;
    	}
    	return false;*/
    }

    // Called once after isFinished returns true
    protected void end() {
    	//light_state.setNumber(1);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

