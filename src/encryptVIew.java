import javax.swing.*;

public class encryptVIew {



    public static void main(String[] args) {
        JFrame frame = new JFrame("encryptVIew");
        frame.setContentPane(new encryptVIew().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        pb1 = new JProgressBar(0,100);
    }

    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JProgressBar pb1;




}

