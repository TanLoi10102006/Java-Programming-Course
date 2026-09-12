import javax.swing.JFrame;
import javax.swing.JLabel;

public class main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Test Swing");

        frame.add(new JLabel("Hello Swing"));

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
