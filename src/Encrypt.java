import javax.swing.*;
import java.util.*;

public class Encrypt {
    public static void main(String[] args) {
        //List<String> log = new ArrayList<String>();
        String message = "";
        String input = JOptionPane.showInputDialog("Skriv ett meddelande");
        String key = JOptionPane.showInputDialog("Ange nyckel");

        String extKey = extendKey(input, key);

        String encStr = encrypt(input, extKey);
        System.out.println(encStr);
    }

    private static String extendKey(String input, String key) {
        String binKey = "";
        String extKey = "";
        for (int n = 0; n < key.length(); n++) {
            binKey += key.charAt(n);
        }
        for (int i = 0; i < (input.length()); i++) {
            extKey += binKey.charAt(i % binKey.length());
        }
        return extKey;
    }

    private static String encrypt(String input, String extKey) {
        int enc;
        char encChar = '\0';
        String encStr = "";
        for (int i = 0; i < input.length(); i++) {
            enc = input.charAt(i) ^ extKey.charAt(i);
            encChar = (char) enc;
            encStr += encChar;
        }
        return encStr;
    }
}