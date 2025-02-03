package ZadanieFlagi;
//Suwarski Robert 3PP
import javax.swing.*;
import java.awt.*;
class panelDoRysowania extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(new Color(0,43,127));
        g.fillRect(0, 0, 500, 900);
        g.setColor(new Color(252,209,22));
        g.fillRect(500, 0, 500, 900);
        g.setColor(new Color(206,17,38));
        g.fillRect(1000, 0, 500, 900);
    }
}
public class Rumunia {

    public static class Flaga extends JFrame{
        private panelDoRysowania draw = new panelDoRysowania();

        public Flaga() {
            this.setTitle("Flaga Rumunii");
            this.setVisible(true);
            this.setBounds(200,100,1500,900);
            setLocationRelativeTo(null);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            this.getContentPane().add(draw);
        }
    }
}
