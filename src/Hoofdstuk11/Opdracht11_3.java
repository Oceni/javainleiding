package Hoofdstuk11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Opdracht11_3 extends Applet {

    private int a;
    private int b;
    private int c;
    private int y;

    public void init(){
        setSize(300,400);
        a=0;
        b=1;
        c=0;
        y=20;



    }

    public void paint(Graphics g){

        for( int e=0; e<=7; e++ ) {

            a=b;
            b=c;
            c=a+b;


            g.drawString("" +c,20,y);
            y+=20;

        }
    }
}