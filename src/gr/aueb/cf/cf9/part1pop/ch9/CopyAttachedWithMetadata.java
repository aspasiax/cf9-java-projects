package gr.aueb.cf.cf9.part1pop.ch9;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

/**
 * Simulates a File Upload scenario.
 * 1. Takes a source file name from the user.
 * 2. Generates a random unique filename using {@link UUID}.
 * 3. Preserves the original file extension.
 * 4. Copies the binary data safely.
 */
public class CopyAttachedWithMetadata {

    public static void main(String[] args) {
        String fileSystemPath = "./";
        Scanner in = new Scanner(System.in);
        String userInputFile;
        String extension = "";

        System.out.println("Please insert the input file name:");
        userInputFile = in.nextLine();

        File sourceFile = new File(fileSystemPath + userInputFile);

        // Validation: Check if file exists
        if (!sourceFile.exists()) {
            System.err.println("Error: File '" + sourceFile.getAbsolutePath() + "' not found.");
            return;
        }

        // Metadata Extraction
        String filename = sourceFile.getName();
        int dotIndex = filename.lastIndexOf('.');

        if (dotIndex > 0 && dotIndex < filename.length() - 1) {
            extension = filename.substring(dotIndex);
        }

        // --- UUID Generation
        String uniqueName = UUID.randomUUID().toString().replace("-", "");
        String destinationFileName = fileSystemPath + uniqueName + extension;
        File destFile = new File(destinationFileName);

        // --- Copy Process
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("\nFile Upload Successful");
            System.out.println("Source: " + sourceFile.getAbsolutePath());
            System.out.println("Destination: " + destFile.getAbsolutePath());
            System.out.println("Renamed to: " + uniqueName + extension);

        } catch (IOException e) {
            System.err.println("Copy failed: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}