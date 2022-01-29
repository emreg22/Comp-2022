// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import static frc.robot.Constants.*;
import frc.robot.subsystems.Climber;

public class RetractSecondaryCommand extends CommandBase {
  /** Creates a new OuttakeCommand. */
  private Climber CLIMBER;

  public RetractSecondaryCommand(Climber CLIMBER) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(CLIMBER);
    this.CLIMBER = CLIMBER;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize(){
    CLIMBER.retractSecondary();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    CLIMBER.offSecondary();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
