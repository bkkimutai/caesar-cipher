package ke.co.bkkimutai;

public class Caesar {
    private String msg;
    private String process;
    private Integer key;

    public Caesar(String msg, String process, Integer key) {
        this.msg = msg;
        this.process = process;
        this.key = key;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }
    public String encryptMessage() {
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < msg.length(); i++) {
            char extractedCharacter = msg.charAt(i);

            try {
                if (Character.isLetter(extractedCharacter)) {
                    char base = Character.isUpperCase(extractedCharacter) ? 'A' : 'a';
                    extractedCharacter = (char) (base + (extractedCharacter - base + key) % 26);
                }
            } catch (Exception e) {
                // Handle the exception (e.g., log an error message)
                System.err.println("An error occurred during encryption: " + e.getMessage());
                // You can also choose to ignore the exception or take other appropriate actions.
            }

            encryptedMessage.append(extractedCharacter);
        }

        return encryptedMessage.toString();
    }



    public String decryptMessage() {
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            char currentChar = msg.charAt(i);
            if (Character.isLetter(currentChar)) {
                char shiftedChar = (char) (currentChar - key);
                if (Character.isUpperCase(currentChar)) {
                    if (shiftedChar < 'A') {
                        shiftedChar = (char) ('Z' - ('A' - shiftedChar - 1));
                    }
                } else {
                    if (shiftedChar < 'a') {
                        shiftedChar = (char) ('z' - ('a' - shiftedChar - 1));
                    }
                }
                decryptedMessage.append(shiftedChar);
            } else {
                decryptedMessage.append(currentChar);
            }
        }
        return decryptedMessage.toString();
    }

}
