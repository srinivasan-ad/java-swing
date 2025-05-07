import javax.swing.*;
import java.awt.*;
public class CreatePainting {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Drawing");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.add(new JPanel(){
        protected void paintComponent(Graphics g)
        {
           super.paintComponent(g);
          //Rectangle
           g.setColor(Color.BLUE);
           g.fillRect(50, 50, 100, 60);

           //Circle
           g.setColor(Color.RED);
           g.fillOval(200, 42, 80 , 80);
        }
       });
       frame.setVisible(true);
    }
}
