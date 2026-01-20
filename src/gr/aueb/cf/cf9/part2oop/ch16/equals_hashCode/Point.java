package gr.aueb.cf.cf9.part2oop.ch16.equals_hashCode;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    @Override
    public boolean equals(Object other) {
        // If they are the same object in memory, they are equal.
        if (this == other) return true;

        // Type check & Casting
        // If 'other' is NOT a Point, return false.
        // If it IS a Point, cast it automatically to variable 'point'.
        if (!(other instanceof Point point)) return false;

        // Field comparison
        return getX() == point.getX() && getY() == point.getY();
    }

    @Override
    public int hashCode() {
        // Generates a hash based strictly on the same fields used in equals()
        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}