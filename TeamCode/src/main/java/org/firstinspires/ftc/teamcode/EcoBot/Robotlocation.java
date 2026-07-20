package org.firstinspires.ftc.teamcode.EcoBot;

public class Robotlocation {
    double angle;

    double x;
    public Robotlocation(double angle){
        this.angle=angle;
    }

    // this metod normallizes robot heading
    public double GetHeading(){
        double angle= this.angle;
         while (angle>=180){
             angle-=360;
         }
         while (angle<=-180){
             angle+=360;
         }
        return angle;
    }
    public void turnRobot(double anglechange){
        angle+=anglechange;
    }

    public void setAngle(double angle){
        this.angle=angle;
    }
    public double getAngle(){
        return this.angle;
    }
    public void changeX(double changeamount){
        x+=changeamount;
    }
    public void setx(double x){
        this.x=x;
    }
    public double getX(){
        return this.x;
    }
}

