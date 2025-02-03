package Car;

import javax.swing.*;
import java.awt.*;

public class WindowCar {

    private static void MainGUI() {

        JFrame frame = new JFrame("DROGA SAMOCHODU");
        frame.getContentPane().setBackground(new Color(77,142,255));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(800,1000);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGUI();
            }
        });
    }

}
