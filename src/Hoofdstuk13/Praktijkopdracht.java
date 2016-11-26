package Hoofdstuk13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Praktijkopdracht extends Applet{


    public void paint(Graphics g){
        setSize(650,500);
        Boom(g);
        Boom2(g);

    }
    //eerste rij
    void Boom (Graphics g){
        int i = 1;
        int bladeren = 75;
        int xstam = 115;
        int ystam = 175;
        while(i < 6){


            g.setColor(Color.cyan);
            g.fillOval(bladeren, 75, 100, 100);
            g.setColor(Color.black);



            g.setColor(new Color(102, 51, 0));
            g.fillRect(xstam, ystam, 20, 100);
            bladeren+=105;
            xstam+= 105;

            i++;
        }


    }
    //tweede rij
    void Boom2(Graphics g){
        int i = 1;
        int bladeren = 75;
        int xstam = 115;
        int ystam = 133;
        while(i < 6){


            g.setColor(Color.cyan);
            g.fillOval(bladeren, 300, 100, 100);
            g.setColor(Color.black);



            g.setColor(new Color(102, 51, 0));
            g.fillRect(xstam, ystam*3, 20, 100);
            bladeren+=105;
            xstam+= 105;

            i++;
        }
    }
}