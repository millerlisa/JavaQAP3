public class Square extends Rectangle {
    // No-arg constructor
    public Square() {
        super();
    }

    // Constructor that initializes the side to the given value
    public Square(double side) {
        super(side, side);
    }

    // Constructor that initializes the side, color and filled to the given values
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter for side (width and length are the same for a square)
    public double getSide() {
        return getWidth();
    }

    // Setter for side
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth and setLength from superclass Rectangle
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // toString method
    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
