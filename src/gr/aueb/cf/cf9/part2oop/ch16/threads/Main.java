package gr.aueb.cf.cf9.part2oop.ch16.threads;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main Thread Started: ");

        // 1. Create Threads
        // We wrap our Runnable (Worker) inside a Thread object.
        Thread t1 = new Thread(new WorkerThread("Worker-1"));
        Thread t2 = new Thread(new WorkerThread("Worker-2"));
        Thread t3 = new Thread(new WorkerThread("Worker-3"));

        // 2. Start Threads
        // .start() instructs the JVM to create a new execution thread and call run() inside it.
        // If we called .run() directly, it would run sequentially in the main thread.
        t1.start();
        t2.start();
        t3.start();

        // 3. Main thread continues immediately
        // This demonstrates the asynchronous nature of multithreading.
        // The message below will likely appear BEFORE the workers finish.
        System.out.println("Main Thread Finished: ");
    }
}