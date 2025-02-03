package DomekWGorach;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplikacja{

    JLabel topPanel;
    JLabel title;
    JLabel imageLabel;
    JButton btnPolub;
    JButton btnUsun;
    JButton btnZapisz;
    JLabel textPolubienia;
    JLabel horizontalLine;
    JLabel textOpis;
    JLabel textOdwiedz;

    int licznikPolubien = 0;


    public JPanel createContentPane(){
        JPanel panel = new JPanel();

        topPanel = new JLabel();
        topPanel.setOpaque(true);
        topPanel.setBackground(new Color(25,118,211));
        topPanel.setBounds(0,0,400,30);
        panel.add(topPanel);

        title = new JLabel("Domek w górach");
        title.setBounds(0,60,400,35);
        title.setForeground(Color.GRAY);
        title.setFont(new Font("Arial",Font.PLAIN,30));
        panel.add(title);

        imageLabel = new JLabel();
        imageLabel.setIcon(new ImageIcon(".\\src\\DomekWGorach\\obraz.jpg"));
        imageLabel.setBounds(0,100,400,110);
        panel.add(imageLabel);

        btnPolub = new JButton("POLUB");
        btnPolub.setBounds(0,220,150,60);
        btnPolub.setBackground(new Color(0, 128, 128));
        btnPolub.setForeground(Color.WHITE);
        btnPolub.setFocusPainted(false);
        btnPolub.setBorderPainted(false);
        panel.add(btnPolub);

        btnUsun = new JButton("USUŃ");
        btnUsun.setBounds(150,220,150,60);
        btnUsun.setBackground(new Color(0, 128, 128));
        btnUsun.setForeground(Color.WHITE);
        btnUsun.setFocusPainted(false);
        btnUsun.setBorderPainted(false);
        panel.add(btnUsun);

        btnZapisz = new JButton("ZAPISZ");
        btnZapisz.setBounds(270,220,150,60);
        btnZapisz.setBackground(new Color(0, 128, 128));
        btnZapisz.setForeground(Color.WHITE);
        btnZapisz.setFocusPainted(false);
        btnZapisz.setBorderPainted(false);
        panel.add(btnZapisz);

        textPolubienia = new JLabel("0 polubień",SwingConstants.RIGHT);
        textPolubienia.setBounds(0,280,370,40);
        textPolubienia.setForeground(Color.GRAY);
        textPolubienia.setFont(new Font("Arial",Font.PLAIN,16));
        panel.add(textPolubienia);

        horizontalLine = new JLabel();
        horizontalLine.setOpaque(true);
        horizontalLine.setBounds(0,320,400,1);
        horizontalLine.setBackground(Color.gray);
        panel.add(horizontalLine);

        textOpis = new JLabel("Opis");
        textOpis.setBounds(0,320,100,40);
        textOpis.setFont(new Font("Arial",Font.BOLD,16));
        textOpis.setForeground(Color.GRAY);
        panel.add(textOpis);

        textOdwiedz = new JLabel();
        textOdwiedz.setText("<html><body>Odwiedź komfortowy domek<br>w Sudetach, blisko do szlaków<br>turystycznych</body></html>");
        textOdwiedz.setBounds(0,290,400,200);
        textOdwiedz.setFont(new Font("Arial",Font.PLAIN,16));
        textOdwiedz.setForeground(Color.GRAY);
        panel.add(textOdwiedz);


        btnPolub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                licznikPolubien++;
                textPolubienia.setText(licznikPolubien+" polubień");

            }
        });

        btnUsun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (licznikPolubien > 0) {

                    licznikPolubien--;
                    textPolubienia.setText(licznikPolubien+" polubień");

                }

            }
        });


        return panel;
    }

    public Aplikacja(){

        JFrame frame = new JFrame("Aplikacja Domek w górach");
        frame.setContentPane(createContentPane());
        frame.setSize(400, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }
}
