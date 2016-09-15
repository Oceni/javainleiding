package Hoofdstuk4;


import java.awt.*;
import java.applet.*;
import java.awt.Graphics;


public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawLine(20, 10, 50, 10);
        g.drawString("lijn", 35, 35);
        g.drawRect(30, 40, 100, 50);
        g.drawString("Rechthoek", 40, 110);
        g.setColor(Color.magenta);
        g.fillArc(250, 40, 100, 50, 0, 45);
        g.fillOval(140, 130, 100, 50);
        g.fillRect(140, 40, 100, 50);
        g.setColor(Color.red);
        g.drawOval(140, 40, 100, 50);
        g.drawString("met ovaal", 140, 110);
        g.drawOval(250, 40, 100, 50);
        g.drawString("punt met ovaal", 250, 110);
        g.drawRoundRect(30, 130, 100, 50, 40, 40);
        g.drawString("ronde randen", 40, 200);
        g.drawString("gevulde ovaal", 140, 200);
        g.drawOval(275, 130, 60, 60);
        g.drawString("cirkel", 290, 200);


    }
}