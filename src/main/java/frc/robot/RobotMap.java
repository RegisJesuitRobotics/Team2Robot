/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //controller ports
  public static final int LEFT_STICK_X = 1;
  public static final int LEFT_TRIGGER_PORT = 3;
  public static final int RIGHT_TRIGGER_PORT = 4;

  //drive motors
  public static final int LEFT_TALON_BACK_PORT = 0;
  public static final int LEFT_TALON_FRONT_PORT = 1;
  public static final int RIGHT_TALON_BACK_PORT = 2;
  public static final int RIGHT_TALON_FRONT_PORT = 3;

  //Drive Constants
  public static final double DEADZONE = 0.1;

  //forklift motor
  public static final int FORKLIFT_TALON_PORT = 4;
  public static final int DRIVER_CONTROLLER = 0;
}
