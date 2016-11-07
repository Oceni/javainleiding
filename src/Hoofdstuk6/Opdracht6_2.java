package Hoofdstuk6;
import java.awt.*;
import java.applet.*;
import java.awt.Color;

    public class Opdracht6_2 extends Applet {



        int minuut,uur,dag,jaar,uitkomst;


        public void init(){
            setSize(500,500);

            minuut= 60;
            uur = minuut * 60;
            dag = uur*24;
            jaar = dag * 365;





        }

        public void paint(Graphics g){
            g.drawString("Aantal seconden per minuut=  " + minuut+" seconde", 60, 80);
            g.drawString("Aantal minuten per uur " + uur, 60, 100);
            g.drawString("Aantal uren per dag " + dag, 60, 120);
            g.drawString("Aantalen dagen per jaar " + jaar, 60, 140);

        }}