package Hoofdstuk11;

        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.applet.*;

public class Opdracht11_1 extends Applet {



    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawLine(y, 50, y, 300 );
            g.drawString("" + teller, y, 305 );
        }
    }
}