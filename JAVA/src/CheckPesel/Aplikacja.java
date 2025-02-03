package CheckPesel;

import Kalkulatory.Pesel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplikacja extends JFrame {
    JLabel tytul;

    public void initComponents() {
        Container panel = this.getContentPane();

        tytul = new JLabel();
        tytul.setBounds(140, 30, 200, 60);
        tytul.setBackground(Color.white);
        tytul.setText("Sprawdź PESEL");
        tytul.setHorizontalAlignment(JLabel.CENTER);
        tytul.setFont(new Font("Arial", Font.PLAIN, 18));
        tytul.setForeground(Color.white);
        tytul.setBackground(new Color(14, 158, 115));
        tytul.setOpaque(true);
        panel.add(tytul);

        JTextField peselField = new JTextField();
        peselField.setBounds(130,100,220,50);
        peselField.setVisible(true);
        panel.add(peselField);

        JButton check = new JButton("Sprawdź PESEL");
        check.setBounds(140,160,200,50);
        check.setFont(new Font( "Arial", Font.PLAIN,16));
        check.setVisible(true);
        panel.add(check);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SprawdzPesel pesel = new SprawdzPesel();
                int InfoPesel = pesel.weryfikacjaPeselu(peselField.getText());
                Info info = new Info(InfoPesel);
            }
        });
    }
    public Aplikacja() {
        this.setLocationRelativeTo(null);
        this.setTitle("Robert Suwarski");
        this.setSize(500,300);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(160, 242, 218));
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
    }
}
