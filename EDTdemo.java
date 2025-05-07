import javax.swing.*;
import java.awt.*;
public class EDTdemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> 
        {
        JFrame frame = new JFrame("EDT demo");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("This is EDT Demo using invoke later");
       frame.add(label);
       frame.setVisible(true);
    });
    }
}
