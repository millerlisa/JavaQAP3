public class Circle extends Shape {
    private double radius;

    // No-arg constructor
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // Constructor that initializes the radius to the given value
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor that initializes the radius, color and filled to the given values
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to get area
    public String getArea() {
		double area = Math.PI * Math.pow(this.radius, 2);
        return String.format("%.1f", area);
    }

    // Method to get perimeter
    public String getPerimeter() {
		double perimeter = 2 * Math.PI * this.radius;
        return String.format("%.1f",perimeter);
    }

    // toString method
    @Override
    public String toString() {
        return "A Circle with radius = " + String.format("%.1f",this.radius) + ", which is a subclass of " + super.toString();
    }
}
