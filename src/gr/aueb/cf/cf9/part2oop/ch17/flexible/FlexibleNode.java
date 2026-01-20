package gr.aueb.cf.cf9.part2oop.ch17.flexible;

/**
 * In place of Object we can have
 * any data type.
 */
public class FlexibleNode {
    private Object value;

    public FlexibleNode() {}

    public FlexibleNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}
