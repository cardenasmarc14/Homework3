import java.lang.Math;

// Define a point class
class MyPoint {
    private double x, y;

    // Defaulting constructor 1 initializes the point to (0, 0)
    public MyPoint() {
        x = 0;
        y = 0;
    }
    
    // Constructor 2: Parameterized constructor initializes the point to specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Constructor 3: Copy constructor initializes the point to the same coordinates as another point p
    public MyPoint(MyPoint p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    // Accessor method to get the x and y of the point
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
    // Calculating and returning the distance between this point and point "p"
    public double distance(MyPoint p) {
        return Math.sqrt(((x - p.x) * (x - p.x)) + ((y - p.y) * (y - p.y)));
    }
    
    // This is for point and a point with coordinates x and y
    public double distance(int x, int y) {
        return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
    }
}

public class AssignmentPoint {

    public static void main(String[] args) {
        // Create two points
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println("Distance between P1 and P2: " + p1.distance(p2));

        MyPoint p3 = new MyPoint();

     
    }
}