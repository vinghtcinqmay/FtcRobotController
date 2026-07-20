package org.firstinspires.ftc.teamcode.Seedbot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class Variables{
    private DcMotor drillbit;

    public void init(HardwareMap hwMap){
        drillbit=hwMap.get(DcMotor.class, "drillbit");
        drillbit.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
    public void drillOn(){
        drillbit.setPower(1);
    }
    public void drillOff(){
        drillbit.setPower(0);
    }
}

