/* Aarav Goyal
 * Encrypt.java
 * 1/8/2025
 */

import java.util.Scanner;

public class Encrypt {
    private String line;

    public Encrypt() {
        line = "";
    }

    public static void main(String[] args) {
        Encrypt encrypt = new Encrypt();
        encrypt.rotate13Times();
    }

    public void rotate13Times() {
        System.out.print("\n\n\nWelcome to Encrypt.java. Please enter a word, phrase, or sentence.\n\n-> ");
        getString();
        for (int i = 1; i <= 13; i++) { // Loop 13 times
            encryptString();
            printString(i);
        }
    }

    public void getString() {
        Scanner in = new Scanner(System.in);
        line = in.nextLine();
    }

    public void encryptString() {
        String encrypted = ""; // Start with an empty string

        for (int x = 0; x < line.length(); x++) {
            char ch = line.charAt(x);

            if (ch >= 'A' && ch <= 'Z') {
                // Uppercase letters
                ch = (char) ((ch - 'A' + 2) % 26 + 'A');
            } else if (ch >= 'a' && ch <= 'z') {
                // Lowercase letters
                ch = (char) ((ch - 'a' + 2) % 26 + 'a');
            }
            // Concatenate the transformed character
            encrypted += ch;
        }

        line = encrypted; // Update the line with the encrypted string
    }

    public void printString(int number) {
        System.out.println("\nEncryption " + number + ": \n" + line);
    }
}
