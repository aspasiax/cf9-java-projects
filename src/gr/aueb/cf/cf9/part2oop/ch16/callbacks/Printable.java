package gr.aueb.cf.cf9.part2oop.ch16.callbacks;

/**
 * A Functional Interface used as a Callback mechanism.
 * Contains a single abstract method {@code print()}.
 * Being a {@link FunctionalInterface}, it can be implemented via:
 * Anonymous Classes
 * Lambda Expressions
 * Method References
 *
 */
@FunctionalInterface
public interface Printable {
    void print();
}