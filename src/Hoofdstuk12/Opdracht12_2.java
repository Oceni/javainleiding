package Hoofdstuk12;


import java.applet.Applet;
import java.awt.Button;

@SuppressWarnings("serial")
public class Opdracht12_2 extends Applet {

    Button[]knoppen = new Button[25];

    public void init() {
        setSize(400, 150);
        for (int i = 0; i < knoppen.length; i++) {
            knoppen[i] = new Button("knop #"+ (i+1));
            add(knoppen[i]);
        }
    }

}