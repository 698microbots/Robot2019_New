package frc.robot.commands;
import frc.robot.Robot;


import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class MoveElevator extends Command {

    private double elevator = Robot.m_oi.xbox1.getRawAxis(Robot.m_oi.XBOX_R_YAXIS);
    
    //public MoveElevator(double sp, boolean direction) 
    public MoveElevator(){
        requires(Robot.elevator);
        //this.sp = sp;
        //this.direction = direction;
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        //Robot.elevator.PID(sp);
        /*if(direction)
        {
            Robot.elevator.upElevator();
        }
        else
            Robot.elevator.downElevator();
            */
           if(Math.abs(elevator) < .2)
            {
                elevator = 0;
            }
            if(elevator > 0)
            {
                elevator = elevator;
            }
            if(elevator < 0)
            {
                elevator = 1.5*elevator;
            }
           Robot.elevator.setElevator(elevator);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       // if(!Robot.m_oi.lowestport.get() || !Robot.m_oi.middleport.get() || !Robot.m_oi.highestport.get())
    	{
    		//return true;
    	}
        //else return false;
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
