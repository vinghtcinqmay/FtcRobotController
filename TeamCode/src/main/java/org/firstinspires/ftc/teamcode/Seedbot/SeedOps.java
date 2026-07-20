package org.firstinspires.ftc.teamcode.Seedbot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp
public class SeedOps extends OpMode {

 Variables variables= new Variables();
    public void init(){
        variables.init(hardwareMap);
    }
    @Override

    public void loop(){
      variables.drillOn();
    }
}
