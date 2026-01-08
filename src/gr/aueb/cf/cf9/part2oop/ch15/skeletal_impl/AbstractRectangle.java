package gr.aueb.cf.cf9.part2oop.ch15.skeletal_impl;

/**
 * Skeletal implementation of {@link IRectangle}.
 * Handles the storage of dimensions and the calculation logic
 * for Area and Perimeter, preventing code duplication in subclasses.
 */
public abstract class AbstractRectangle implements IRectangle {
    private double width;
    private double height;

    public AbstractRectangle() {}

    public AbstractRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean isSquare() {
        return width == height;
    }

    @Override
    public String toString() {
        return String.format("Shape [width = %.1f, height = %.1f]", width, height);
    }
}
