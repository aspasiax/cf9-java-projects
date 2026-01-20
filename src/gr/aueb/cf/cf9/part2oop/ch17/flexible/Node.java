package gr.aueb.cf.cf9.part2oop.ch17.flexible;

/**
 * Defines a {@link Node}
 * class with a single int field.
 */
public class Node {
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
