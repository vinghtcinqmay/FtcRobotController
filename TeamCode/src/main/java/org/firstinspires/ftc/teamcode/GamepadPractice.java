package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamepadPractice extends OpMode {
    @Override
    public void init(){

    }

    @Override
    public void loop() {
        double speedforward= -gamepad1.left_stick_y/2.0;
        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData( "y",speedforward);
        telemetry.addData("a button", gamepad1.a);
    }
}



