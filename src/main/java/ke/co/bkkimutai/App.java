package ke.co.bkkimutai;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Alright, please enter process (encrypt/decrypt): ");
        String process = scanner.next(); // Read the process (encrypt/decrypt) as a string

        System.out.print("Please enter the message: ");
        String message = scanner.next(); // Read the message as a string

        System.out.print("Please enter the key: ");
        int key = scanner.nextInt(); // Read the key as an integer

        Caesar caesar = new Caesar(message, process, key);

        if (process.equals("encrypt")) {
            String encryptedMessage = caesar.encryptMessage();
            System.out.println("Encrypted Message: " + encryptedMessage);
        } else if (process.equals("decrypt")) {
            String decryptedMessage = caesar.decryptMessage();
            System.out.println("Decrypted Message: " + decryptedMessage);
        } else {
            System.out.println("Invalid process. Please enter 'encrypt' or 'decrypt'.");
        }
    }
}