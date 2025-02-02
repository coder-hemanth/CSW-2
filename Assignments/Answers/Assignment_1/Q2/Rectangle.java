package Assignments.Answers.Assignment_1.Q2;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    public void printDetails() {
        System.out.println("Length: " + this.length + ", Width: " + this.width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.0, 15.60);
        System.out.println("Initial details of rectangle:");
        rectangle.printDetails();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        rectangle.setLength(17.06);
        rectangle.setWidth(11.20);
        System.out.println();
        System.out.println("Updated details of rectangle:");
        rectangle.printDetails();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
