package ke.co.bkkimutai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarTest {

    @Test
    public void testEncryptMessage() {
        Caesar caesar = new Caesar("Hello", "encrypt", 3);
        String encryptedMessage = caesar.encryptMessage();
        assertEquals("Khoor", encryptedMessage);
    }

    @Test
    public void testDecryptMessage() {
        Caesar caesar = new Caesar("Khoor", "decrypt", 3);
        String decryptedMessage = caesar.decryptMessage();
        assertEquals("Hello", decryptedMessage);
    }

    @Test
    public void testEncryptMessageWithSpaces() {
        Caesar caesar = new Caesar("Hello World", "encrypt", 3);
        String encryptedMessage = caesar.encryptMessage();
        assertEquals("Khoor Zruog", encryptedMessage);
    }

    @Test
    public void testDecryptMessageWithSpaces() {
        Caesar caesar = new Caesar("Khoor Zruog", "decrypt", 3);
        String decryptedMessage = caesar.decryptMessage();
        assertEquals("Hello World", decryptedMessage);
    }
    @Test
    public void testEncryptMessageWithPunctuationAndMixedCase() {
        Caesar caesar = new Caesar("Hello, zero sum", "encrypt", 3);
        String encryptedMessage = caesar.encryptMessage();
        assertEquals("Khoor, chur vxp", encryptedMessage);
    }

}
