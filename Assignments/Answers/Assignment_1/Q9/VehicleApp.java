package Assignments.Answers.Assignment_1.Q9;

interface Vehicle {

    void accelerate();

    void brake();

}

class Car implements Vehicle {

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void brake() {
        System.out.println("Car is braking.");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to " + speed + " km/h for " + duration + " seconds.");
    }

}

class Bicycle implements Vehicle {

    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h for " + duration + " seconds.");
    }

}

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        car.accelerate();
        car.brake();
        bicycle.accelerate();
        bicycle.brake();
        Car myCar = new Car();
        myCar.accelerate(100);
        myCar.accelerate(100, 10);
        Bicycle myBicycle = new Bicycle();
        myBicycle.accelerate(20);
        myBicycle.accelerate(20, 5);
    }
}
