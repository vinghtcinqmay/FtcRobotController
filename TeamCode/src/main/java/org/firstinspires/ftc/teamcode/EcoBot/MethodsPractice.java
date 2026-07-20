package org.firstinspires.ftc.teamcode.EcoBot;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class MethodsPractice extends OpMode {
    @Override
    public void init(){

    }
    double squarekeepingsigh(double YAxis){
        double output= YAxis*YAxis;
        if (YAxis <0){
            output*=-1;
        }
        return output;
    }
    @Override
    public void loop(){

        double YAxis=gamepad1.left_stick_y;
        telemetry.addData("YAxis Orignal", YAxis);
              YAxis=squarekeepingsigh(YAxis);
        telemetry.addData("YAxis Squared",YAxis);

    }
}
