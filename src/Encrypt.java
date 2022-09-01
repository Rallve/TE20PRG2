import javax.swing.*;

public class Encrypt {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Skriv ett meddelande");
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int ascii = letter;
            String bin = Integer.toBinaryString(ascii);

            System.out.println(letter);
            System.out.println(ascii);
            System.out.println(bin);

            for (int n = 0; n < bin.length(); n++) {

            }
        }
    }
}
