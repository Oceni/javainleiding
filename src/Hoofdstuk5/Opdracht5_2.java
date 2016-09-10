package Hoofdstuk5;

import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;

public class Opdracht5_2 extends Applet{
    private static final long serialVersionUID = 1L;
    int Jeroen1;
    int Jeroen2;
    int Hans1;
    int Hans2;
    int Valerie1;
    int Valerie2;

    public void init() {
        setBackground(Color.white);
        Jeroen1 = 50;
        Jeroen2 = 105;
        Hans1 = 70;
        Hans2 = 85;
        Valerie1 = 90;
        Valerie2 = 65;
    }

    public void paint(Graphics a) {
        // staaf 3
        a.setColor(Color.blue);
        a.fillRect(60, Jeroen1, 15, Jeroen2);

        // staaf 2
        a.setColor(Color.red);
        a.fillRect(90, Hans1, 15, Hans2);

        // staaf 1
        a.setColor(Color.black);
        a.fillRect(120, Valerie1, 15, Valerie2);

        // Names
        a.setColor(Color.blue);
        a.drawString("Jeroen", 20, 170);

        a.setColor(Color.red);
        a.drawString("Hans", 20, 190);

        a.setColor(Color.black);
        a.drawString("Valerie", 20, 210);

        // verticaal
        a.drawLine(50, 155, 50, 45);

        // horizontaal
        a.drawLine(50, 155, 145, 155);

        // Verdeling vd strepen
        a.drawLine(50, 90, 160, 90); // 40
        a.drawLine(50, 70, 160, 70); // 60
        a.drawLine(50, 50, 160, 50); // 80
        a.drawLine(50, 110, 160, 110); // 100

        //Verdeling vd cijfers
        a.drawString("40 KG", 10, 115);
        a.drawString("60 KG", 10, 95);
        a.drawString("80 KG", 10, 75);
        a.drawString("100 KG", 5, 55);
    }

}




