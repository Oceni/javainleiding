package Hoofdstuk6;

import java.awt.*;
import java.applet.*;
import java.awt.Color;


public class  Opdracht6_1 extends Applet {
    double a;
    double b;
    double uitkomst;




    public void init(){
        a = 113;
        b = 4;
        uitkomst = a/b;



    }

    public void paint(Graphics g){
        g.drawString("Jan heeft " + uitkomst,20,20);
        g.drawString("Ali heeft " + uitkomst,20,40);
        g.drawString("Jeanette heeft " + uitkomst,20,60);
        g.drawString("Peter heeft " + uitkomst,20,80);

    }
}
