package org.firstinspires.ftc.teamcode.EcoBot;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class EcoBotTeleOp extends OpMode {
    double forward, strafe, rotate;

    MecanumDrive drive = new MecanumDrive();
    Servos bucket = new Servos();
    Servos claw = new Servos();
    Servos linkage3 =new Servos();

    Servos linkage2= new Servos();

    Servos linkage1= new Servos();

    @Override
    public void init(){
        drive.init(hardwareMap);
        bucket.init(hardwareMap);
        claw.init(hardwareMap);
        bucket.setServopos(0);
        claw.setclawposition(0);
        linkage3.init(hardwareMap);
        linkage3.setLinkage3(0);
        linkage2.init(hardwareMap);
        linkage1.init(hardwareMap);


    }
    @Override
    public void loop(){
        forward=gamepad1.left_stick_y;
        strafe=gamepad1.left_stick_x;
        rotate=gamepad1.right_stick_x;
        telemetry.addData("Forward: ", forward);
        telemetry.addData("Strafe: ", strafe);
        telemetry.addData("Rotate: ", rotate);

        drive.drive(forward, -strafe, -rotate);

        if (gamepad1.x){
            bucket.setServopos(0);
        }
        else if (gamepad1.b){
            bucket.setServopos(1);
        }

        if (gamepad1.left_bumper){
                claw.setclawposition(1);
        }
        else if (gamepad1.right_bumper){
            claw.setclawposition(0);
        }

        if (gamepad1.y) {
            linkage3.setLinkage3(0.01);
        }
        if (gamepad1.a) {
            linkage3.setLinkage3(-0.01);
        }
        else{
            linkage3.setLinkage3(0);
        }

        if (gamepad1.dpad_up) {
            linkage2.setLinkage2(-0.0009);
        }
        if (gamepad1.dpad_down){
            linkage2.setLinkage2(0.0009);
        }

        if (gamepad1.dpad_left){
            linkage1.setLinkage1(0.005);
        }
        if (gamepad1.dpad_right){
            linkage1.setLinkage1(-0.005);
        }




    }
}

