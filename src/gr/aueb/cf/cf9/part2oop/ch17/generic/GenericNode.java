package gr.aueb.cf.cf9.part2oop.ch17.generic;

/**
 * A Generic wrapper class.
 * By using &lt;T&gt;, we defer the type decision until instantiation.
 * This class ensures type safety at compile-time.
 *
 * @param <T> the type of value to store.
 */
public class GenericNode<T> {
    private T value;

    public GenericNode() {}

    public GenericNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericNode{" + "value=" + value + '}';
    }
}