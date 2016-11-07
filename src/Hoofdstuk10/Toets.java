package Hoofdstuk10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Toets extends Applet {
    int minuut, uur, dag, uitkomst;

    TextField tekstveld;
    Button knop;
    long hoogsteGetal;


    public void init(){
        tekstveld= new TextField("",10);
        add(tekstveld);

        knop = new Button("voer in");
        add(knop);

        hoogsteGetal=0;

        KnopListener kl= new KnopListener();
        knop.addActionListener(kl);
    }


    public void paint(Graphics g){

        int x=50;

        g.drawString("hoogsteGetal:"+ hoogsteGetal, 50, 60);
        g.drawString("Aantal seconden per minuut=  " + minuut+" seconde", 60, 80);
        g.drawString("Aantal minuten per uur " + uur, 60, 100);
        g.drawString("Aantal uren per dag " + dag, 60, 120);

    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            String s=tekstveld.getText();
            long l = Long.parseLong(s);
            if(l>hoogsteGetal);{
                hoogsteGetal=l;
            }

            repaint();


            // event handeler inwendig
        }
    }
}



   // 0>23 geen


/*Om voor een “Goed” in aanmerking te komen:Alle hierboven beschreven functionaliteiten werken correct
 Het aantal regels code exclusief witregels en commentaar is maximaal 85 De positionering van de strings op het scherm kun je gemakkelijk aanpassen door maximaal twee variabelen in je code te wijzigen
 Je code is netjes  en springt correct in Je gebruikt op correcte wijze hoofd- en kleine letters
Je variabelen hebben betekenisvolle namen zodat meteen duidelijk is waar ze voor staan
Alle gele waarschuwingen van IntelliJ heb je opgelost. Als dit het geval is verschijnt  rechtsboven in je code-editor een groen vinkje.
*/