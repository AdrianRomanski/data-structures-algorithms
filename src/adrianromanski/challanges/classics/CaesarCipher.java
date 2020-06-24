package adrianromanski.challanges.classics;

import java.security.AlgorithmConstraints;

public class CaesarCipher {

    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypt(String plainText, int n) {

        StringBuilder cipherText = new StringBuilder();

        for(int i = 0; i <plainText.length(); i++) {
            char charToEncrypt = plainText.charAt(i);
            char replaceVal = ' ';

            if(charToEncrypt != ' ') {
                int x = ALPHABET.indexOf(charToEncrypt);
                int keyVal = (n + x) % 26;
                replaceVal = ALPHABET.charAt(keyVal);
            }

            cipherText.append(replaceVal); // 0(1) because using StringBuffer
        }
        return cipherText.toString();

    }

    public String decrypt(String cipherText, int n) {

        StringBuilder plainText = new StringBuilder();

        for(int i = 0; i < cipherText.length(); i++) {
            char charToDecrypt = cipherText.charAt(i);
            char replaceVal = ' ';

            if(charToDecrypt != ' ') {
                int x = ALPHABET.indexOf(charToDecrypt);
                int keyVal = (x - n) % 26;

                if(keyVal < 0) {
                    keyVal = ALPHABET.length() + keyVal;
                }

                replaceVal = ALPHABET.charAt(keyVal);
            }

            plainText.append(replaceVal);
        }

        return plainText.toString();
    }
}
