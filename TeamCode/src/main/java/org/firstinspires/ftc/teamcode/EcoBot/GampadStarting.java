package org.firstinspires.ftc.teamcode.EcoBot;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GampadStarting extends OpMode{
    @Override
    public void init(){

    }
    @Override
    public void loop(){
        double moveforwards= gamepad1.left_stick_y/2;
        double difference= gamepad1.left_stick_x-gamepad1.right_stick_x;
        double sumoftrigger= gamepad1.right_trigger+gamepad1.left_trigger;
        telemetry.addData("x",gamepad1.left_stick_x);
        telemetry.addData("y",moveforwards);
        telemetry.addData("abutton",gamepad1.a);
        telemetry.addData("y2",gamepad1.right_stick_y);
        telemetry.addData("x2",gamepad1.right_stick_x);
        telemetry.addData("B-Button",gamepad1.b);
        telemetry.addData("difference: ",difference);
        telemetry.addData("RT", gamepad1.right_trigger );
        telemetry.addData("LT", gamepad1.left_trigger);
        telemetry.addData("Sum: ",sumoftrigger);

    }
}
