package org.usfirst.frc.team7078954.robot.subsystems;

import java.util.Set;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

/**
 *
 */
public class GUCCI extends Subsystem {
	
    Potentiometer pot1 = new AnalogPotentiometer(0, 360, 40);
	AnalogInput ai = new AnalogInput(1);
	pot1 = new AnalogPotentiometer(ai, 360, 40);
	//pot = new AnalogPotentiometer(ai, 360, 40)

	//Potentiometer pot = new AnalogPotentiometer(0, 360, 40);
	double degrees = pot1.get();
	System.out.print(degrees);

   public void initDefaultCommand() {
   ///Set the default command for a subsystem here ;
   setDefaultCommand(new MySpecialCommand());   
	}
}

