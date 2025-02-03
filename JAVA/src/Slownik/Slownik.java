package Slownik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Slownik {

    public JPanel createContentPane() {
        JPanel panel = new JPanel();

        JPanel upPanel = new JPanel(null);
        upPanel.setBounds(0,0,400,150);
        upPanel.setBackground(new Color(121,255,128));
        panel.add(upPanel);

        JRadioButton dodaj = new JRadioButton("DODAJ");
        dodaj.setBackground(new Color(152,202,141));
        dodaj.setFont(new Font("Arial",Font.BOLD,18));
        dodaj.setBounds(30,55,100,50);
        upPanel.add(dodaj);

        JRadioButton szukaj = new JRadioButton("SZUKAJ");
        szukaj.setBackground(new Color(152,202,141));
        szukaj.setFont(new Font("Arial",Font.BOLD,18));
        szukaj.setBounds(250,55,100,50);
        upPanel.add(szukaj);

        JPanel downPanel = new JPanel(null);
        downPanel.setBounds(0,150,400,500);
        downPanel.setBackground(new Color(165,255,246));
        panel.add(downPanel);

        JTextField wyrazPOL = new JTextField();
        wyrazPOL.setBounds(150,70,180,30);
        wyrazPOL.setVisible(false);
        downPanel.add(wyrazPOL);

        JTextField wyrazFRAN = new JTextField();
        wyrazFRAN.setBounds(150,150,180,30);
        wyrazFRAN.setVisible(false);
        downPanel.add(wyrazFRAN);

        //MIEJSCE NA FLAGI


        JButton dodajButton = new JButton("DODAJ");
        dodajButton.setBounds(140,370,100,40);
        dodajButton.setBackground(new Color(7,97,97));
        dodajButton.setForeground(Color.white);
        dodajButton.setVisible(false);
        downPanel.add(dodajButton);

        JButton szukajButton = new JButton("SZUKAJ");
        szukajButton.setBounds(140,370,100,40);
        szukajButton.setBackground(new Color(7,97,97));
        szukajButton.setForeground(Color.white);
        szukajButton.setVisible(false);
        downPanel.add(szukajButton);

        JTextArea wynik = new JTextArea();
        wynik.setBounds(5,120,375,250);
        wynik.setEditable(false);
        wynik.setVisible(false);
        downPanel.add(wynik);

        //EVENT LISTENER

        ActionListener RadioButtonDodaj = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dodaj.isSelected()) {
                    szukaj.setSelected(false);
                    wyrazPOL.setVisible(true);
                    wyrazFRAN.setVisible(true);
                    dodajButton.setVisible(true);
                    //flagi

                    szukajButton.setVisible(false);
                    wynik.setVisible(false);

                } else {
                    wyrazPOL.setVisible(false);
                    wyrazFRAN.setVisible(false);
                    dodajButton.setVisible(false);
                    //flagi

                }
            }
        };

        ActionListener RadioButtonSzukaj = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (szukaj.isSelected()) {
                    dodaj.setSelected(false);
                    szukajButton.setVisible(true);
                    wynik.setVisible(true);

                    wyrazPOL.setVisible(true);
                    wyrazFRAN.setVisible(false);
                    dodajButton.setVisible(false);
                    //flagi
                } else {
                    szukajButton.setVisible(false);
                    wynik.setVisible(false);
                    wyrazPOL.setVisible(false);
                }
            }
        };

        dodaj.addActionListener(RadioButtonDodaj);
        szukaj.addActionListener(RadioButtonSzukaj);

        ActionListener dodajButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Komunikaty komunikat = new Komunikaty(1);
            }
        };

        ActionListener szukajButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Komunikaty komunikat = new Komunikaty(1);
            }
        };

        dodajButton.addActionListener(dodajButtonListener);
        szukajButton.addActionListener(szukajButtonListener);

        return panel;
    }
    public Slownik() {
        super();
        JFrame frame = new JFrame("Słownik POL-FRANC (Robert Suwarski)");
        frame.setContentPane(createContentPane());
        ImageIcon icon = new ImageIcon("icon.jpg");
        frame.setIconImage(icon.getImage());
        frame.setSize(400, 650);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
