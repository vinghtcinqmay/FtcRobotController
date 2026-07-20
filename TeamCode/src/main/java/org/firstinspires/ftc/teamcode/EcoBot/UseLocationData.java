package org.firstinspires.ftc.teamcode.EcoBot;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class UseLocationData extends OpMode {
    Robotlocation robotlocation= new Robotlocation(0);

    @Override
    public void init(){
        robotlocation.setAngle(0);
        robotlocation.setx(0);
    }
    @Override
    public void loop(){
        if (gamepad1.a){
            robotlocation.turnRobot(0.1);
        }
        else if (gamepad1.b){
            robotlocation.turnRobot(-0.1);
        }

        if (gamepad1.dpad_right){
            robotlocation.changeX(0.1);
        }
        else if (gamepad1.dpad_left){
            robotlocation.changeX(-0.1);
        }
        telemetry.addData("Heading", robotlocation.GetHeading());
        telemetry.addData("Get data", robotlocation.getAngle());
        telemetry.addData("X Value", robotlocation.getX());
    }
}
