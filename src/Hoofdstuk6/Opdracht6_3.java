package Hoofdstuk6;

import java.awt.*;
import java.applet.*;
import java.awt.Color;

public class Opdracht6_3 extends Applet {

        int a;
        int b;
        int c;
        int total;
        public void init()
        {
            a=Integer.MAX_VALUE;
            b=200000;

            c=2;
            total = a*b*c;
        }
        public void paint(Graphics g)
        {
            g.drawString("het antwoord is: "+total, 20, 50);
        }
    }