package albero.di.natale.e.snowman;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class AlberoDiNataleESnowman extends Canvas{

    public void paint(Graphics g)  {

        g.setColor(Color.WHITE);
        g.drawString(" SABA70 4TI", 130, 30);
        g.setColor(Color.gray);
        g.fillRect(155, 260, 50, 60);
        setBackground(Color.black);
        g.setColor(Color.green);
        g.fillArc(80, -100, 200, 300, -130, 80);
        g.fillArc(80, -60, 200, 300, -130, 80);
        g.fillArc(80, -20, 200, 300, -130, 80);
        g.setColor(Color.PINK);
        g.fillOval(150, 150, 20, 20);
        g.setColor(Color.ORANGE);
        g.fillOval(160, 100, 20, 20);
        g.setColor(Color.magenta);
        g.fillOval(190, 140, 20, 20);
        g.setColor(Color.red);
        g.fillOval(180, 190, 20, 20);
        g.setColor(Color.CYAN);
        g.fillOval(150, 200, 20, 20);
        //----------------------------------------------------------------------
//        g.setColor(Color.red);
//        g.fillArc(325, 150, 30, 100, -130, 80);
//        g.setColor(Color.white);
//        g.fillOval(322, 235, 35, 35);
//        g.fillOval(313, 265, 50, 50);
//        g.setColor(Color.black);
//        g.fillOval(331, 247, 5, 5);
//        g.fillOval(341, 247, 5, 5);

    }

    public static void main(String[] args) {
        AlberoDiNataleESnowman gra = new AlberoDiNataleESnowman();
        JFrame f = new JFrame();
        f.add(gra);
        f.setSize(400, 400);
        f.setVisible(true);
    }

}
