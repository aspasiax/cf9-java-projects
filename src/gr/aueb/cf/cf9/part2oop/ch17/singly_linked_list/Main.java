package gr.aueb.cf.cf9.part2oop.ch17.singly_linked_list;

public class Main {

    public static void main(String[] args) {
        // Test with Integers
        SingleList<Integer> list = new SingleList<>();

        list.insertFirst(10);
        list.insertFirst(5);  // List: 5 -> 10
        list.insertLast(20);  // List: 5 -> 10 -> 20

        System.out.println("Initial List: ");
        list.traverse();
        System.out.println("Size: " + list.size());

        // Remove First
        Node<Integer> removed = list.removeFirst();
        System.out.println("\nRemoved First: " + removed);
        list.traverse(); // List: 10 -> 20

        // Remove Last
        Node<Integer> removedLast = list.removeLast();
        System.out.println("Removed Last: " + removedLast);
        list.traverse(); // List: 10

        // Test with Strings
        System.out.println("\nString List Test: ");
        SingleList<String> strList = new SingleList<>();
        strList.insertLast("Athens");
        strList.insertFirst("Paris");
        strList.insertLast("London"); // Paris -> Athens -> London

        strList.traverse();
    }
}