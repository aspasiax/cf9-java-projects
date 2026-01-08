package gr.aueb.cf.cf9.part2oop.ch15.skeletal_impl;

/**
 * Represents a Square.
 * Enforces the invariant that width must always equal height.
 */
public class Square extends AbstractRectangle {

    public Square() {}

    /**
     * Constructor taking a single side.
     * Passes the same value to width and height of the parent.
     */
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width); // Sync height
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height); // Sync width
    }

    @Override
    public String toString() {
        return "Square (side =" + getWidth() + ")";
    }
}