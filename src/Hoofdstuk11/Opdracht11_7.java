package Hoofdstuk11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Opdracht11_7 extends Applet {


    public void init(){

    }
    public void paint(Graphics g){

        int i = 0;
        int x = 300;
        int y = 300;
        int width = 10;
        int height = 10;
        while (i < 51) {

            g.drawOval(x, y, width, height);
            width += 10;
            x -= 5;
            y -= 5;
            height += 10;
            i++;
        }

    }
}
