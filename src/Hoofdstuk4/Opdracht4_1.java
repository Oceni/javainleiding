package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_1 extends Applet {


    int[] x = { 100, 50, 150 };
    int[] y = { 100, 200, 200 };

    public void init() {

    }

    public void paint(Graphics g) {

        g.drawPolygon(x, y, 3);

    }

}
