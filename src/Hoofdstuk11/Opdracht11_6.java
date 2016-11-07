package Hoofdstuk11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Opdracht11_6 extends Applet {


    public void init(){

    }
    public void paint(Graphics g){

        int straal = 50, breedte = 320, hoogte = 240;

        do {
            int x = breedte / 2 - straal, y1 = hoogte / 2 - straal;
            g.drawOval(x, y1, 2 * straal, 2 * straal);
            straal -= 11;
            y1 += 11;
        } while (straal > 5);

    }
}
