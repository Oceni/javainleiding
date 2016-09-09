import java.applet.Applet;
import java.awt.*;

public class Opdracht4_5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(80, 50, 100, 150, 50, 400);

    }
}
