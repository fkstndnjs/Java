package oop;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike car = new MotorBike(50);
        MotorBike def = new MotorBike();

        car.start();

        System.out.println(def.getSpeed());
        System.out.println(car.getSpeed());

        car.setSpeed(100);

        System.out.println(car.getSpeed());

        car.increaseSpeed(100);

        System.out.println(car.getSpeed());
    }
}
