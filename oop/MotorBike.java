package oop;

public class MotorBike {
    private int speed;

    MotorBike(){
        this(5);
    }
    MotorBike(int speed){
        this.speed = speed;
    }

    void setSpeed(int speed){
        if(speed>0)
            this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }

    void start(){
        System.out.println("started");
    }

    void increaseSpeed(int howMuch){
        setSpeed(this.speed + howMuch);
    }
}
