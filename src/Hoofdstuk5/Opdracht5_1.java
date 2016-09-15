package Hoofdstuk5;

import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;

public class Opdracht5_1 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    public void init(){
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 100;
        hoogte = 50;}

    public void paint(Graphics g){
        g.drawLine(20, 10, 50, 10);
        g.drawString("lijn", 35, 35);
        g.drawRect(30, 40, breedte, hoogte);
        g.drawString("rechthoek", 40, 110);
        g.setColor(opvulkleur);
        g.fillArc(250, 40, breedte, hoogte, 0, 45);
        g.fillOval(140, 130, breedte, hoogte);
        g.fillRect(140, 40, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(140, 40, breedte, hoogte);
        g.drawString("met ovaal", 140, 110);
        g.drawOval(250, 40, breedte, hoogte);
        g.drawString("punt met ovaal", 250, 110);
        g.drawRoundRect(30, 130, breedte, hoogte, 40, 40);
        g.drawString("ronde randen", 40, 200);
        g.drawString("gevulde ovaal", 140, 200);
        g.drawOval(275, 130, 60, 60);
        g.drawString("cirkel", 290, 200);
    }
}
