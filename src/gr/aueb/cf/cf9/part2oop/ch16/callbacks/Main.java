package gr.aueb.cf.cf9.part2oop.ch16.callbacks;

public class Main {

    public static void main(String[] args) {

        // 1: Anonymous Inner Class (The "Old" Way)
        // Verbose, lots of boilerplate code.
        Printable anonymous = new Printable() {
            @Override
            public void print() {
                System.out.println("1. Hello form Anonymous Class!");
            }
        };

        // 2: Lambda Expression (The "Modern" Way)
        // Concise. Removes the ceremony of creating a class.
        // Logic: () -> { implementation }
        Printable lambda = () -> System.out.println("2. Hello from Lambda!");

        // 3: Method Reference (The "Cleanest" Way)
        // If a method already exists that matches the signature (void -> void), just point to it.
        // Syntax: ClassName::methodName
        Printable methodRef = Main::printMessage;


        // Execution (Triggering the Callbacks)
        System.out.println("Executing Callbacks: ");

        doWithPrintable(anonymous);
        doWithPrintable(lambda);
        doWithPrintable(methodRef);

        // --- Direct Execution (Inline) ---
        System.out.println("\nInline Execution: ");

        // Inline Lambda
        doWithPrintable(() -> System.out.println("4. Inline Lambda"));

        // Inline Method Reference (System.out.println void-void variant just prints a newline)
        doWithPrintable(System.out::println);
    }

    /**
     * A simple utility method matching the Printable signature (void -> void).
     */
    public static void printMessage() {
        System.out.println("3. Hello from Method Reference!");
    }

    /**
     * This method accepts a callback (strategy) and executes it.
     * It doesn't know what will happen, only that it must call print().
     * * @param printable the callback to execute
     */
    public static void doWithPrintable(Printable printable) {
        printable.print();
    }
}