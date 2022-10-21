import javax.swing.*;

public class encryptVIew {



    public static void main(String[] args) {
        JFrame frame = new JFrame("encryptVIew");
        frame.setContentPane(new encryptVIew().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
}

