import java.applet.Applet;
import java.awt.*;

public class Opdracht4_7 extends Applet {

    // Een methode die de inhoud van het scherm tekent.
    public void paint(Graphics g) {
        g.drawRoundRect(20, 20, 50, 50, 10, 10);
        g.fillOval(30, 30, 10, 10);
        g.fillOval(50, 30, 10, 10);
        g.fillOval(30, 50, 10, 10);
        g.fillOval(50, 50, 10, 10);
    }
}
