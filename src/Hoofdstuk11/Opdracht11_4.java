package Hoofdstuk11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Opdracht11_4 extends Applet {



    public void init() {


    }


    public void paint(Graphics g) {

        int x = 20;
        int y = 30;
        for(int i = 1; i < 11; i++) {

            g.drawString(i+" * 3 = "+ (i*3) , x, y);
            y += 20;

        }





    }
}