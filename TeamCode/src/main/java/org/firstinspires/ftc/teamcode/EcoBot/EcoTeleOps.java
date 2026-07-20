package org.firstinspires.ftc.teamcode.EcoBot;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class EcoTeleOps extends OpMode {
    EcoBotVariables ecoBotVariables = new EcoBotVariables();

    @Override
    public void init(){
        ecoBotVariables.init(hardwareMap);

    }
    @Override
    public void loop(){
        ecoBotVariables.setFrontRightMotorSpeed(0.5);
        telemetry.addData("Motor Revolutions", ecoBotVariables.getMotorRevs());
    }
}
