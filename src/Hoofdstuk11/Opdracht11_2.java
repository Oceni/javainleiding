package Hoofdstuk11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Opdracht11_2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 10;

        for(teller = 10; teller < 20; teller++) {
            y += 30;
            g.drawString("" + teller, y, 305 );
        }
    }
}

