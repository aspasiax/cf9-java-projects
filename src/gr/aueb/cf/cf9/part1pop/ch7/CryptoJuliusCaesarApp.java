package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Implements the full Julius Caesar Cipher algorithm.
 * Shift every letter by a fixed integer (KEY).
 * Wrap around the alphabet using Modulo operator (%).
 * Handle Uppercase and Lowercase separately to preserve case.
 * Ignore non-letter characters.
 */
public class CryptoJuliusCaesarApp {

    public static void main(String[] args) {
        final int KEY = 3; // The shift key (Caesar used 3)

        String s1 = "BUZZ";           // Test wrap-around (Z -> C)
        String s2 = "Coding Factory"; // Test mixed case & space

        // String s1
        String encrypted1 = encrypt(s1, KEY);
        String decrypted1 = decrypt(encrypted1, KEY);

        System.out.println("Original:  " + s1);
        System.out.println("Encrypted: " + encrypted1);
        System.out.println("Decrypted: " + decrypted1);
        System.out.println();

        //String s2
        String encrypted2 = encrypt(s2, KEY);
        String decrypted2 = decrypt(encrypted2, KEY);

        System.out.println("Original:  " + s2);
        System.out.println("Encrypted: " + encrypted2);
        System.out.println("Decrypted: " + decrypted2);
    }

    /**
     * Encrypts the whole string using the cipher method for each char.
     */
    public static String encrypt(String s, int key) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                encrypted.append(cipher(ch, key));
            } else {
                encrypted.append(ch); // Keep spaces/symbols as is
            }
        }
        return encrypted.toString();
    }

    /**
     * Decrypts the whole string using the decipher method for each char.
     */
    public static String decrypt(String s, int key) {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                decrypted.append(decipher(ch, key));
            } else {
                decrypted.append(ch);
            }
        }
        return decrypted.toString();
    }

    /**
     * Encrypts a single character.
     * Formula: E(x) = (x + k) mod 26
     */
    public static char cipher(char ch, int key) {
        // Find the base ASCII value ('A' = 65 or 'a' = 97)
        int base = Character.isUpperCase(ch) ? 'A' : 'a';

        // Convert char to 0-25 range
        int originalPos = ch - base;

        // Apply shift and wrap around using modulo
        int encryptedPos = (originalPos + key) % 26;

        // Convert back to ASCII
        return (char) (base + encryptedPos);
    }

    /**
     * Decrypts a single character.
     * D(x) = (x - k) mod 26
     * Add 26 to handle negative results in Java.
     */
    public static char decipher(char ch, int key) {
        int base = Character.isUpperCase(ch) ? 'A' : 'a';

        int encryptedPos = ch - base;

        // Negative number % 26 remains negative.
        // Add 26 before modulo.
        int decryptedPos = ((encryptedPos - key) + 26) % 26;

        return (char) (base + decryptedPos);
    }
}