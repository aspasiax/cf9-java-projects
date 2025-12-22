package gr.aueb.cf.cf9.part1pop.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Demonstrates different ways to write data to files using the java.io package.
 * {@link FileWriter}: Low-level character writing.
 * {@link BufferedWriter}: Efficient writing using a memory buffer.
 * {@link PrintStream}: Versatile printing (used by System.out).
 * {@link PrintWriter}: Best for writing text/characters safely.
 */
public class FileWritersJavaIO {

    public static void main(String[] args) {
        // Using relative paths makes the code portable (runs on any PC)
        // The file is created in the project root folder.
        File testFile = new File("src/gr/aueb/cf/cf9/part1pop/ch9/test.txt");

        try {
            // 1. Basic FileWriter
            fileWriter(testFile);

            // 2. Buffered Writer (Better performance)
            bufferWriter(testFile);

            // 3. PrintStream (Flexible usage)
            // We can write to a file
            try (PrintStream filePs = new PrintStream("testFile", StandardCharsets.UTF_8)) {
                sayHello(filePs);
            }
            // or to the console using the same method
            sayHello(System.out);

        } catch (IOException e) {
            System.err.println("File I/O Error: " + e.getMessage());
        }
    }

    /**
     * Writes using FileWriter.
     * Good for simple text, but writes to disk frequently (slow for large data).
     * @param file the target file
     * @throws IOException if writing fails
     */
    public static void fileWriter(File file) throws IOException {
        // 'true' in constructor means append mode (don't overwrite/erase content)
        try (FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8, true)) {
            fw.write("Method 1: Hello from FileWriter\n");
            // flush() is automatically called on close()
            fw.flush();
        }
    }

    /**
     * Writes using BufferedWriter.
     * Best Practice for performance.
     * It gathers data in RAM and writes to disk in chunks.
     * @param file the target file
     */
    public static void bufferWriter(File file) throws IOException {
        // Chaining: FileWriter (Basic) -> wrapped in -> BufferedWriter (Efficient)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8, true))) {
            bw.write("Method 2: Hello from BufferedWriter");
            bw.newLine(); // Cross-platform new line separator
        }
    }

    /**
     * Writes using PrintStream.
     * Capable of writing raw bytes and text. System.out is a PrintStream.
     */
    public static void printStream(File file) throws IOException {
        try (PrintStream ps = new PrintStream(file, StandardCharsets.UTF_8)) {
            ps.println("Method 3: Hello from PrintStream");
        }
    }

    /**
     * Writes using PrintWriter.
     * Similar to PrintStream but optimized for Characters (Text).
     * Preferred over PrintStream for text files.
     */
    public static void printWriter(File file) throws IOException {
        try (PrintWriter pw = new PrintWriter(file, StandardCharsets.UTF_8)) {
            pw.println("Method 4: Hello from PrintWriter");
        }
    }

    /**
     * Demonstrates Polymorphism in I/O.
     * Accepts any PrintStream (File or Console).
     */
    public static void sayHello(PrintStream ps) {
        ps.println("Hello Coding Factory! (via generic PrintStream)");
    }
}