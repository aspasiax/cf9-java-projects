package gr.aueb.cf.cf9.part1pop.ch7;

/**
 * Demonstrates a simple encryption algorithm (Caesar Cipher logic).
 * Shift +1 for Encryption.
 * Shift -1 for Decryption.
 * Wraps around edges (z -> a, a -> z).
 * Ignores non-letter characters (numbers, punctuation remain unchanged).
 */
public class CryptoNextCharApp {

    public static void main(String[] args) {
        String s = "Coding Factory 9!";

        // 1. Encryption
        String encrypted = encrypt(s);
        System.out.println("Original:  " + s);
        System.out.println("Encrypted: " + encrypted);

        // 2. Decryption
        String decrypted = decrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);
    }

    /**
     * Encrypts a string by shifting every letter to the next one.
     */
    public static String encrypt(String s) {
        StringBuilder encrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            // Check if it's a letter (A-Z or a-z)
            if (Character.isLetter(ch)) {
                encrypted.append(cipher(ch));
            } else {
                // Keep punctuation/numbers exactly as they are
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }

    /**
     * Decrypts a string by shifting every letter to the previous one.
     */
    public static String decrypt(String s) {
        StringBuilder decrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                decrypted.append(decipher(ch));
            } else {
                decrypted.append(ch);
            }
        }
        return decrypted.toString();
    }

    /**
     * Helper method: Shifts char forward (a -> b, ..., z -> a).
     */
    public static char cipher(char ch) {
        // Handle wrap-around cases
        if (ch == 'z') return 'a';
        if (ch == 'Z') return 'A';

        // Shift by +1
        // (char) cast is needed because ch + 1 results in an int
        return (char) (ch + 1);
    }

    /**
     * Helper method: Shifts char backward (b -> a, ..., a -> z).
     */
    public static char decipher(char ch) {
        // Handle wrap-around cases
        if (ch == 'a') return 'z';
        if (ch == 'A') return 'Z';

        // Shift by -1
        return (char) (ch - 1);
    }
}