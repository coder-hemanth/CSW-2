package Assignments.Answers.Assignment_1.Q1;

class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printDetails() {
        System.out.println("Make = " + this.make + ", model = " + this.model);
    }
}

public class CarTester {
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Urban Cruiser");
        Car myCar2 = new Car(null, null);
        myCar1.printDetails();
        myCar2.printDetails();
        myCar2.setMake("Maruti Suzuki");
        myCar2.setModel("Fronx");
        myCar1.printDetails();
        myCar2.printDetails();
    }
}
