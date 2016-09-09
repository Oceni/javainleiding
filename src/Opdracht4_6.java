import java.applet.Applet;
import java.awt.*;

public class Opdracht4_6 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {

        g.fillRect(27, 50, 70, 170);
        g.setColor(Color.red);
        g.fillOval(40, 60, 40, 40);

        g.setColor(Color.orange);
        g.fillOval(40, 105, 40, 40);

        g.setColor(Color.green);
        g.fillOval(40, 150, 40, 40);

    }
}
