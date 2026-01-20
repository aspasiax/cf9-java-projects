package gr.aueb.cf.cf9.part2oop.ch17.flexible;

public class Main {

    public static void main(String[] args) {
        FlexibleNode flexibleNode = new FlexibleNode();

        flexibleNode.setValue("Coding");

        // No compile-time safety
        int value = (int) flexibleNode.getValue();

        System.out.println(value);
    }
}
