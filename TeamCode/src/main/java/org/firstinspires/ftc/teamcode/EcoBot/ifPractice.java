package org.firstinspires.ftc.teamcode.EcoBot;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class ifPractice extends OpMode {
    @Override
    public void init(){

    }
    @Override
    public void loop(){
        boolean AButton = gamepad1.a;
        boolean BButton = gamepad1.b;
        double Movement=gamepad1.left_stick_y;

        if (AButton){
            telemetry.addData("Turbo Speed ", -gamepad1.left_stick_y);
        }
        else{
            telemetry.addData("Normal Speed ", -gamepad1.left_stick_y*0.6);
        }

    }

}
