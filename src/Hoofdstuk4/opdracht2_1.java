package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;


public class opdracht2_1 extends Applet {


    public void init() {
        setBackground(Color.blue);
    }
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.drawString("Xavier", 50, 60);
        g.setColor(Color.red);
        g.drawString("Landveld", 60, 70);

    }
}