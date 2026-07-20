package org.firstinspires.ftc.teamcode.EcoBot;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
@Disabled
public class EcoBotVariables {
    private DcMotor frontRightMotor;
    private double ticksperrev;

    public void init(HardwareMap hwMap){

        frontRightMotor= hwMap.get(DcMotor.class, "frontLeftMotor");
        frontRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksperrev = frontRightMotor.getMotorType().getTicksPerRev();

    }

    public void setFrontRightMotorSpeed(double speed){
        //Value from -1->1
        frontRightMotor.setPower(speed);
    }

    public double getMotorRevs() {
        return frontRightMotor.getCurrentPosition();
    }
}
