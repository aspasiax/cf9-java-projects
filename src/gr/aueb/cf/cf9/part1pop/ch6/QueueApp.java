package gr.aueb.cf.cf9.part1pop.ch6;

import java.util.Arrays;

/**
 * Demonstrates a Queue data structure based on an array.
 * A Queue follows the FIFO (First-In, First-Out) principle.
 * Operations:
 * Enqueue: Adds an element to the end (tail).
 * Dequeue: Removes and returns the element from the front (head).
 */
public class QueueApp {

    // Static buffer
    static int[] queue = new int[10];
    static int pivot = -1; // points to the last element added

    public static void main(String[] args) {
        // Enqueue some elements
        enqueue(10);
        enqueue(20);
        enqueue(30);

        System.out.println("Initial Queue: ");
        printQueue(); // 10 20 30

        // Dequeue
        int val = dequeue();
        System.out.println("\nDequeued: " + val);

        System.out.println("\nQueue after Dequeue: ");
        printQueue(); // 20 30
    }

    public static void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        queue[++pivot] = val;
    }

    /**
     * Removes the first element using Arrays.copyOfRange.
     * Logic:
     * 1. Copy from index 1 (skip the first element).
     * 2. Extend to queue.length + 1 (this adds a 0 at the end).
     * 3. Assign the new array back to the queue reference.
     *
     * @return the removed element
     */
    public static int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty!");
        }

        // Get the value at the front
        int valueToReturn = queue[0];

        // Create a new array that starts from index 1 (shifting left)
        // and ends at length + 1 (padding the end with 0 to keep size constant).
        queue = Arrays.copyOfRange(queue, 1, queue.length + 1);

        // Decrease pivot because we have one less valid element
        pivot--;

        return valueToReturn;
    }

    public static boolean isEmpty() {
        return pivot == -1;
    }

    public static boolean isFull() {
        return pivot == queue.length - 1;
    }

    public static void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i <= pivot; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
