package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.ParallelCommandGroup;

import org.firstinspires.ftc.teamcode.subsystems.SliderSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.WristSubsystem;

public class SliderAndWristUpCommand extends ParallelCommandGroup {
    public SliderAndWristUpCommand(SliderSubsystem sliderSubsystem, WristSubsystem wristSubsystem) {
        addCommands(
                new SliderFowardCommand(sliderSubsystem), // Slider hareket eder
                new WristDownCommand(wristSubsystem)     // Bilek aynı anda hareket eder
        );
    }
}
