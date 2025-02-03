//Robert Suwarski 4PP
package Obrazki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stronka {

    JPanel leftPanel;

    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;

    JButton btnClear;

    JLabel obrazek;
    JTextArea trescObrazka;

    public JPanel createContentPane(){

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(221, 215, 250));

        Obrazek ob = new Obrazek();
        Tresc tr = new Tresc();

        leftPanel = new JPanel(null);
        leftPanel.setBounds(20,50,200,440);
        leftPanel.setBackground(new Color(178, 145, 255));
        leftPanel.setBorder(BorderFactory.createLineBorder(new Color(141, 79, 255)));
        panel.add(leftPanel);

        btn1 = new JButton("Bitwa pod Grunwaldem");
        btn1.setBounds(15,0,170,40);
        leftPanel.add(btn1);

        btn2 = new JButton("Bitwa pod Kircholmem");
        btn2.setBounds(15,50,170,40);
        leftPanel.add(btn2);

        btn3 = new JButton("Bitwa pod Wiedniem");
        btn3.setBounds(15,100,170,40);
        leftPanel.add(btn3);

        btn4 = new JButton("Borowik szlachetny");
        btn4.setBounds(15,150,170,40);
        leftPanel.add(btn4);

        btn5 = new JButton("Pieczarka");
        btn5.setBounds(15,200,170,40);
        leftPanel.add(btn5);

        btn6 = new JButton("Maślak");
        btn6.setBounds(15,250,170,40);
        leftPanel.add(btn6);

        btn7 = new JButton("Algieria");
        btn7.setBounds(15,300,170,40);
        leftPanel.add(btn7);

        btn8 = new JButton("Angola");
        btn8.setBounds(15,350,170,40);
        leftPanel.add(btn8);

        btn9 = new JButton("Botswana");
        btn9.setBounds(15,400,170,40);
        leftPanel.add(btn9);

        btnClear = new JButton("CLEAR");
        btnClear.setBounds(35,500,170,40);
        btnClear.setVisible(false);
        panel.add(btnClear);

        obrazek = new JLabel();
        obrazek.setBounds(300,50,500,200);
        obrazek.setBorder(BorderFactory.createLineBorder(Color.black));
        obrazek.setVisible(false);
        panel.add(obrazek);

        trescObrazka = new JTextArea();
        trescObrazka.setBounds(300,300,500,200);
        trescObrazka.setBorder(BorderFactory.createLineBorder(Color.black));
        trescObrazka.setVisible(false);
        trescObrazka.setLineWrap(true);
        panel.add(trescObrazka);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obrazek.setVisible(true);
                trescObrazka.setVisible(true);
                btnClear.setVisible(true);

                obrazek.setIcon(new ImageIcon(ob.tabObrazek[0]));
                trescObrazka.setText(tr.tabTresc[0]);

            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obrazek.setVisible(true);
                trescObrazka.setVisible(true);
                btnClear.setVisible(true);

                obrazek.setIcon(new ImageIcon(ob.tabObrazek[1]));
                trescObrazka.setText(tr.tabTresc[1]);

            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obrazek.setVisible(true);
                trescObrazka.setVisible(true);
                btnClear.setVisible(true);

                obrazek.setIcon(new ImageIcon(ob.tabObrazek[2]));
                trescObrazka.setText(tr.tabTresc[2]);

            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obrazek.setVisible(true);
                trescObrazka.setVisible(true);
                btnClear.setVisible(true);

                obrazek.setIcon(new ImageIcon(ob.tabObrazek[3]));
                trescObrazka.setText(tr.tabTresc[3]);

            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obrazek.setVisible(true);
                trescObrazka.setVisible(true);
                btnClear.setVisible(true);

                obrazek.setIcon(new ImageIcon(ob.tabObrazek[4]));
                trescObrazka.setText(tr.tabTresc[4]);

            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obrazek.setVisible(true);
                trescObrazka.setVisible(true);
                btnClear.setVisible(true);

                obrazek.setIcon(new ImageIcon(ob.tabObrazek[5]));
                trescObrazka.setText(tr.tabTresc[5]);

            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obrazek.setVisible(true);
                trescObrazka.setVisible(true);
                btnClear.setVisible(true);

                obrazek.setIcon(new ImageIcon(ob.tabObrazek[6]));
                trescObrazka.setText(tr.tabTresc[6]);

            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obrazek.setVisible(true);
                trescObrazka.setVisible(true);
                btnClear.setVisible(true);

                obrazek.setIcon(new ImageIcon(ob.tabObrazek[7]));
                trescObrazka.setText(tr.tabTresc[7]);

            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obrazek.setVisible(true);
                trescObrazka.setVisible(true);
                btnClear.setVisible(true);

                obrazek.setIcon(new ImageIcon(ob.tabObrazek[8]));
                trescObrazka.setText(tr.tabTresc[8]);

            }
        });



        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                obrazek.setVisible(false);
                trescObrazka.setVisible(false);
                btnClear.setVisible(false);

            }
        });

        return panel;
    }

    public Stronka(){

        JFrame frame = new JFrame("Obrazek - RS");
        frame.setContentPane(createContentPane());
        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

}
