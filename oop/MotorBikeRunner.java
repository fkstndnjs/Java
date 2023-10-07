package oop;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike car = new MotorBike();

        car.start();

        car.setSpeed(100);

        System.out.println(car.getSpeed());
    }
}
