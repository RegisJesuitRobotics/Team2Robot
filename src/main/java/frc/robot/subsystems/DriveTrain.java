/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
TalonSRX leftMotorBack = new TalonSRX(RobotMap.LEFT_TALON_BACK_PORT);
TalonSRX leftMotorFront = new TalonSRX(RobotMap.LEFT_TALON_FRONT_PORT);
TalonSRX rightMotorBack = new TalonSRX(RobotMap.RIGHT_TALON_BACK_PORT);
TalonSRX rightMotorFront = new TalonSRX(RobotMap.RIGHT_TALON_FRONT_PORT);
  @Override
  public void initDefaultCommand() {

  }
  
  public void setLeftMotorBack(double leftSpeedBack) {
    leftMotorBack.set(ControlMode.PercentOutput, leftSpeedBack);
  }
    public void setLeftMotorFront(double leftSpeedFront) {
    leftMotorFront.set(ControlMode.PercentOutput, leftSpeedFront);
  }
    public void setRightMotorBack(double rightSpeedBack) {
    rightMotorBack.set(ControlMode.PercentOutput, rightSpeedBack);
  }
    public void setRightMotorFront(double rightSpeedFront) {
    rightMotorFront.set(ControlMode.PercentOutput, rightSpeedFront);
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

	public void setLeftBackMotor(int i) {
	}
}
