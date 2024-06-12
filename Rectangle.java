public class Rectangle extends Shape {
    private double width;
    private double length;

    // No-arg constructor
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor that initializes the width and length to the given values
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Constructor that initializes the width, length, color and filled to the given values
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return this.width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return this.length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Method to get area
    public double getArea() {
        return this.width * this.length;
    }

    // Method to get perimeter
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    // toString method
    @Override
    public String toString() {
        return "A Rectangle with width = " + this.width + " and length = " + this.length + ", which is a subclass of " + super.toString();
    }
}
