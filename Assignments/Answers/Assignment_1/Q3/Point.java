package Assignments.Answers.Assignment_1.Q3;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printDetails() {
        System.out.println("X: " + x + ", Y: " + y);
    }

    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(point1);
        System.out.println("Initial details of point1:");
        point1.printDetails();
        System.out.println();
        System.out.println("Initial details of point2:");
        point2.printDetails();
        point1.setX(5);
        point1.setY(6);
        System.out.println();
        System.out.println("Modified details of point1:");
        point1.printDetails();
        System.out.println();
        System.out.println("Details of point2 after modifying point1:");
        point2.printDetails();
    }
}
