package ke.co.bkkimutai;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean programRunning = true;
        while (programRunning) {
            System.out.print("Welcome Caesar EncryptDecrypt, please select your option (encrypt, decrypt or Quit): ");
            String process = scanner.next(); // Read the process (encrypt/decrypt) as a string

            if (process.toLowerCase().startsWith("e")) {

                System.out.print("Please enter the message: ");
                scanner.nextLine(); // Consume the newline character left in the buffer
                String message = scanner.nextLine(); // Read the message as a string

                System.out.print("Please enter the key: ");
                int key = scanner.nextInt(); // Read the key as an integer

                Caesar caesar = new Caesar(message, process, key);
                String encryptedMessage = caesar.encryptMessage();
                System.out.println("Encrypted Message: " + encryptedMessage);
            }else if(process.toLowerCase().startsWith("d")) {
                System.out.print("Please enter the message: ");
                scanner.nextLine(); // Consume the newline character left in the buffer
                String message = scanner.nextLine(); // Read the message as a string

                System.out.print("Please enter the key: ");
                int key = scanner.nextInt(); // Read the key as an integer

                Caesar caesar = new Caesar(message, process, key);
                String decryptedMessage = caesar.decryptMessage();
                System.out.println("Decrypted Message: " + decryptedMessage);
            }else if(process.toLowerCase().startsWith("q")){
                programRunning = false;
                System.out.print("Goodbye!");
            } else {
                System.out.println("Invalid process. Please enter 'encrypt', 'decrypt' or Exit.");
            }
        }
    }
}