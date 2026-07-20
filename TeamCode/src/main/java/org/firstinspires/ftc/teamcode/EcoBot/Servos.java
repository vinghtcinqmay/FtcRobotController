package org.firstinspires.ftc.teamcode.EcoBot;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
@Disabled
public class Servos {
    private Servo servopos,claw,linkage3,linkage2,linkage1;

    double setangle3=0.5;
    double setangle4=0.1;
    double setangle5=0.5;


    public void init(HardwareMap hwMap){
        setangle5=0;
        servopos=hwMap.get(Servo.class, "bucket");
        claw=hwMap.get(Servo.class, "claw");
        linkage3=hwMap.get(Servo.class, "linkage3");
        linkage2=hwMap.get(Servo.class, "linkage2");
        linkage1=hwMap.get(Servo.class, "linkage1");
    }
    public void setServopos(double angle) {
        servopos.setPosition(angle);
    }

    public void setclawposition(double angle2){

        claw.setPosition(angle2);
    }

    public void setLinkage3(double angle5) {
        setangle5 += angle5;
        setangle5 = Math.min(setangle5, 1.0);
        setangle5= Math.max(setangle5,0);

        linkage3.setPosition(setangle5);
    }

    public void setLinkage2(double angle4) {
        setangle4+=angle4;
        setangle4= Math.min(setangle4,1.0);
        setangle4= Math.max(setangle4,0.25);
        linkage2.setPosition(setangle4);
    }

    public void setLinkage1(double angle3){
        setangle3+=angle3;
        setangle3= Math.min(setangle3,1.0);
        setangle3= Math.max(setangle3,0.25);
        linkage1.setPosition(setangle3);
    }
    }



