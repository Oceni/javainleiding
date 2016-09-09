package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g)

    {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(52, 190, 95, 150);
        int[] xPoints = { 100, 50, 150 };
        int[] yPoints = { 100, 200, 200 };
        g.drawPolygon(xPoints, yPoints, 3);
        g.drawRect(52, 100, 20, 90);
        g.drawRect(52, 300, 20, 40);
        g.drawRect(90, 210, 50, 40);
        g.drawRect(90, 297, 40, 40);
    }
}
