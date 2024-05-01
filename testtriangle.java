import java.util.Scanner;

// Abstract class representing a geometric object
abstract class GeometricObject {
    // Abstract methods to calculate area and perimeter
    public abstract double area();
    public abstract double perimeter();

    // Instance variables
    private String color;
    private boolean filled;

    // Getters and setters for color and filled
    public String getColor() {
        return color;
    }
    public void setColor(String aColor) {
        color = aColor;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean aFilled) {
        filled = aFilled;
    }

    // Constructors
    public GeometricObject() {
        filled = false;
    }

    public GeometricObject(String aColor, boolean aFilled) {
        color = aColor;
        filled = aFilled;
    }
}

// Class representing a triangle
class Triangle extends GeometricObject {
    // Instance variables for the sides of the triangle
    private double side1;
    private double side2;
    private double side3;

    // Constructors
    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }
    public Triangle(String aColor, boolean aFilled, double aSide1, double aSide2, double aSide3) {
        super(aColor, aFilled);
        side1 = aSide1;
        side2 = aSide2;
        side3 = aSide3;
    }

    // Getters and setters for the sides of the triangle
    public double getSide1() {
        return side1;
    }
    public void setSide1(double aSide1) {
        side1 = aSide1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double aSide2) {
        side2 = aSide2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double aSide3) {
        side3 = aSide3;
    }

    // Calculating the area
    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        double t = s * (s - side1) * (s - side2) * (s - side3);
        return Math.sqrt(t);
    }

    // Calculating the perimeter
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    // Override toString method to provide information about the triangle
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}

// Tesing the Triangle class
public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s1, s2, s3;
        
        // Prompt user to enter triangle sides
        System.out.println("Enter 3 sides of the triangle :");
        s1 = scanner.nextDouble();
        s2 = scanner.nextDouble();
        s3 = scanner.nextDouble();
        scanner.nextLine();
        
        // Prompt to enter color
        System.out.println("Enter the color : ");
        String color = scanner.nextLine();
        
        // Prompt to enter if triangle is filled
        System.out.println("Is triangle filled?");
        boolean filled = scanner.nextBoolean();
        
        // Create a geometric object representing a triangle
        GeometricObject geometricObject = new Triangle(color, filled, s1, s2, s3);
        
        // Display triangle information
        System.out.println(geometricObject);
        System.out.println("Area: " + geometricObject.area());
        System.out.println("Perimeter: " + geometricObject.perimeter());
    }
}
