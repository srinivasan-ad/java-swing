import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo extends JFrame {
    private JLabel displayLabel;

    public SwingDemo() {
        setTitle("Timepiece Icon Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Load Icons
        // ImageIcon watchIcon = new ImageIcon("watch.png");
        // ImageIcon clockIcon = new ImageIcon("clock.png");
        // ImageIcon timerIcon = new ImageIcon("timer.png");

        // Buttons
        JButton watchButton = new JButton("watchIcon");
        watchButton.setToolTipText("Watch");
        
        JToggleButton clockToggle = new JToggleButton("clockIcon");
        clockToggle.setToolTipText("Clock");
        
        JButton timerButton = new JButton("timerIcon");
        timerButton.setToolTipText("Timer");

        // Label to display result
        displayLabel = new JLabel("Select a timepiece");
        displayLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Add ActionListeners
        watchButton.addActionListener(e -> displayLabel.setText("Watch selected"));
        clockToggle.addActionListener(e -> {
            if (clockToggle.isSelected()) {
                displayLabel.setText("Clock selected");
            } else {
                displayLabel.setText("Clock deselected");
            }
        });
        timerButton.addActionListener(e -> displayLabel.setText("Timer selected"));

        // Add to Frame
        add(watchButton);
        add(clockToggle);
        add(timerButton);
        add(displayLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingDemo::new);
    }
}