package gr.aueb.cf.cf9.part2oop.ch17.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();

        list.insertFirst("Athens");
        list.insertFirst("Paris");   // Paris <-> Athens
        list.insertLast("London");   // Paris <-> Athens <-> London
        list.insertLast("Rome");     // Paris <-> Athens <-> London <-> Rome

        list.traverse();
        list.traverseReverse(); //Rome <-> London <-> Athens <-> Paris

        System.out.println("\nSize: " + list.size());

        System.out.println("Removing Last: " + list.removeLast().getItem()); // Rome
        list.traverse();
    }
}