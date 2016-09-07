import java.applet.Applet;
import java.awt.*;


public class opdracht2_1 extends Applet {


    public void init() {
        setBackground(Color.yellow);
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawString("Xavier", 50, 60);
        g.setColor(Color.red);
        g.drawString("Landveld", 60, 70);

    }
}