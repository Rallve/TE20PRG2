import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("");
        String output = "h";
        if (input.charAt(0) == 'h' && input.charAt(1) == 'e') {
            for (int i = 1; i < input.length() && i < 1000; i++) {
                if (input.charAt(i) == 'y') {
                    output += "y";
                    System.out.println(output);
                    break;
                } else if (input.charAt(i) == 'e') {
                    output += "ee";
                } else {
                    break;
                }
            }
        }
    }
}