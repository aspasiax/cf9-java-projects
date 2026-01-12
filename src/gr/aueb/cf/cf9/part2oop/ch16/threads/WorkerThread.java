package gr.aueb.cf.cf9.part2oop.ch16.threads;

/**
 * A simple worker class that implements {@link Runnable}.
 * It simulates a CPU-intensive task by looping through a large range of numbers.
 */
public class WorkerThread implements Runnable {

    // Field to store the name of the task for identification
    private final String taskName;

    /**
     * Constructor.
     * @param taskName the name of the worker task.
     */
    public WorkerThread(String taskName) {
        this.taskName = taskName; // FIX: matched the field name
    }

    @Override
    public void run() {
        // Get the name of the actual Thread executing this task
        String currentThreadName = Thread.currentThread().getName();

        System.out.printf("[%s] started. (Running on thread: %s)\n", taskName, currentThreadName);

        // Simulate heavy workload
        long count = 0;
        for (long i = 0; i < 2_000_000_000L; i++) {
            count++;
        }

        System.out.printf("[%s] finished.\n", taskName);
    }
}