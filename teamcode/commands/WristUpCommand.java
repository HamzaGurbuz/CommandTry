package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.WristSubsystem;

public class WristUpCommand extends CommandBase {

    private final WristSubsystem wristSubsystem;

    public WristUpCommand(WristSubsystem wristSubsystem){
        this.wristSubsystem = wristSubsystem;
        addRequirements(wristSubsystem);
    }

    @Override
    public void execute(){
        wristSubsystem.moveWrist(0.17);

    }
}
