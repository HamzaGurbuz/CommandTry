package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class WristSubsystem extends SubsystemBase {

    private final Servo wrist2;

    public WristSubsystem(HardwareMap hardwareMap){
        wrist2 = hardwareMap.get(Servo.class, "wrist2");
        wrist2.setDirection(Servo.Direction.FORWARD);
    }

    public void moveWrist(double pos){
        wrist2.setPosition(pos);
    }


}
