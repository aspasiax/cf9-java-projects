package gr.aueb.cf.cf9.part1pop.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Challenge: Read a CSV file containing locations and convert it
 * into a structured format (JSON-style objects).
 * Input Format: Location,Latitude,Longitude
 * Output Format: { location: 'Name', latitude: Lat, longitude: Lon },
 */
public class LocationsJavaIO {

    public static void main(String[] args) {
        String inFilePath = "locations.csv";
        String outFilePath = "locations-formatted.txt";

        // Create sample data so the code runs out-of-the-box
        createCSV(inFilePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            String line;
            String[] tokens;

            // 1. Read the Header line (to skip it)
            String headerLine = reader.readLine();

            if (headerLine == null) {
                System.err.println("Error: The file is empty.");
                return;
            }
            // We don't use the header tokens, but we needed to consume the line.
            // String[] headerTokens = headerLine.split(",");

            // 2. Read the rest of the file line by line
            while ((line = reader.readLine()) != null) {
                tokens = line.split(",");

                // Ensure the line has exactly 3 columns
                if (tokens.length == 3) {
                    String location = tokens[0].trim();
                    String lat = tokens[1].trim();
                    String lon = tokens[2].trim();

                    // Format and Write to file
                    ps.printf("{ location: '%s', latitude: %s, longitude: %s },\n", location, lat, lon);

                    // Print to Console for verification
                    System.out.printf("{ location: '%s', latitude: %s, longitude: %s },\n", location, lat, lon);
                } else {
                    System.err.println("Skipping invalid line: " + line);
                }
            }

            System.out.println("\nTransformation complete! Check " + outFilePath);

        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }
    }

    /**
     * Creates a CSV file.
     */
    public static void createCSV(String filename) {
        try (PrintWriter pw = new PrintWriter(filename, StandardCharsets.UTF_8)) {
            pw.println("Location,Latitude,Longitude");
            pw.println("Athens, 37.9838, 23.7275");
            pw.println("Thessaloniki, 40.6401, 22.9444");
            pw.println("Patra, 38.2466, 21.7345");
            pw.println("Heraklion, 35.3387, 25.1442");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}