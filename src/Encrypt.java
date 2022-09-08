import javax.swing.*;
import java.util.*;

public class Encrypt {
    public static void main(String[] args) {
        //List<String> log = new ArrayList<String>();
        String message = "";
        String input = JOptionPane.showInputDialog("Skriv ett meddelande");
        char key = JOptionPane.showInputDialog("Ange nyckel").charAt(0);
        System.out.println(key);
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int ascii = letter;
            //String keyBin = Integer.toBinaryString(key);

            //String bin = Integer.toBinaryString(ascii);
            //String hex = Integer.toHexString(ascii);

            int enc = ascii^key;

            //System.out.println(enc);

            char encChar = (char) enc;
            //System.out.println(encChar);

            message += encChar;

            /*
            log.add("");

            System.out.println(letter);
            System.out.println(ascii);
            System.out.println(bin);
            System.out.println(hex);
            System.out.println(keyBin);
            System.out.println(enc);
            System.out.println(dec);
            System.out.println("");

             */
        }
        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
    }
}
