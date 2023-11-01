import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        setTitle("Hello App");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawString("Hello Friends", 50, 50);
        g.setColor(Color.RED);
        g.drawLine(30, 20, 200, 300);
        g.setColor(Color.BLACK);
        g.drawRect(10, 20, 30, 40);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}
