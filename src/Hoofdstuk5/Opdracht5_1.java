package Hoofdstuk5;

import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;

public class Opdracht5_1 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {

        opvulkleur = Color.magenta;
        lijnkleur = Color.blue;
        breedte = 200;
        hoogte = 100;

    }

    public void paint(Graphics g) {

        // teken rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        // teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        // teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        // teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        // teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);

    }

}
