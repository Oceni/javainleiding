package Hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_4 extends Applet {

    int v, j, d, hoogte, lines;

    public void init() {
        v = 40;
        j = 80;
        d = 60;
        hoogte = 20;
        lines = 280;
    }

    public void paint(Graphics g) {
        g.drawLine(50, 20, 50, 200);
        g.drawLine(50, 220, 280, 220);
        g.drawLine(50, hoogte * 2, lines, hoogte * 2);
        g.drawLine(50, hoogte * 3, lines, hoogte * 3);
        g.drawLine(50, hoogte * 4, lines, hoogte * 4);
        g.drawLine(50, hoogte * 5, lines, hoogte * 5);
        g.drawLine(50, hoogte * 6, lines, hoogte * 6);
        g.drawLine(50, hoogte * 7, lines, hoogte * 7);
        g.drawLine(50, hoogte * 8, lines, hoogte * 8);
        g.drawLine(50, hoogte * 9, lines, hoogte * 9);
        g.drawLine(50, hoogte * 10, lines, hoogte * 10);

        g.drawString("0", 40, 220);
        g.drawString("" + hoogte, 35, 220 - hoogte);
        g.drawString("" + hoogte * 2, 35, 220 - hoogte * 2);
        g.drawString("" + hoogte * 3, 35, 220 - hoogte * 3);
        g.drawString("" + hoogte * 4, 35, 220 - hoogte * 4);
        g.drawString("" + hoogte * 5, 30, 220 - hoogte * 5);
        g.drawString("" + hoogte * 6, 30, 220 - hoogte * 6);
        g.drawString("" + hoogte * 7, 30, 220 - hoogte * 7);
        g.drawString("" + hoogte * 8, 30, 220 - hoogte * 8);
        g.drawString("" + hoogte * 9, 30, 220 - hoogte * 9);
        g.drawString("" + hoogte * 10, 30, 220 - hoogte * 10);

        g.setColor(Color.red);
        g.fillRect(50, 220 - v, hoogte, v);
        g.setColor(Color.black);
        g.fillRect(100, 220 - j, hoogte, j);
        g.setColor(Color.blue);
        g.fillRect(160, 220 - d, hoogte, d);

        g.setColor(Color.red);
        g.fillRect(50, 255, 20, 20);
        g.drawString("Valerie", 75, 270);

        g.setColor(Color.black);
        g.fillRect(50, 280, 20, 20);
        g.drawString("Jeroen", 75, 295);

        g.setColor(Color.blue);
        g.fillRect(50, 305, 20, 20);
        g.drawString("Hans", 75, 320);

    }
}
// Maak van deze gegevens een staafdiagram, waarbij elke kolom een eigen kleur
// heeft.
// De namen van de kinderen staan onder het staafdiagram en de verdeling van de
// schaal staat naast de diagram met daarbij om de 20 de verdeling.

// Valerie 40kg
// Jeroen: 100 kg
// Hans: 80 kg
