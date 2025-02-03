package ZadanieFlagi;
//Suwarski Robert 3PP

import javax.swing.*;
import java.awt.*;
class panelDoRysowania2 extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(new Color(55,126,63));
        g.fillRect(0, 0, 1500, 300);
        g.setColor(Color.white);
        g.fillRect(0, 250, 1500, 50);
        g.setColor(new Color(180,10,45));
        g.fillRect(0, 300, 1500, 300);
        g.setColor(new Color(236,200,29));
        g.fillOval(700,400,100,100);
        g.setColor(new Color(236,200,29));
        g.fillOval(722,400,50,150);
        g.setColor(new Color(236,200,29));
        g.fillOval(722,350,50,150);
        g.setColor(new Color(236,200,29));
        g.fillOval(650,420,200,50);
        g.setColor(new Color(55,126,63));
        g.fillRect(0, 600, 1500, 300);
        g.setColor(Color.white);
        g.fillRect(0, 600, 1500, 50);
    }
}
public class Surinam {

    public static class Flaga extends JFrame{
        private panelDoRysowania2 draw = new panelDoRysowania2();

        public Flaga() {
            this.setTitle("Flaga Surinamu");
            this.setVisible(true);
            this.setBounds(200,100,1500,900);
            setLocationRelativeTo(null);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            this.getContentPane().add(draw);
        }
    }
}
