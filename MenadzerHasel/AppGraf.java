package MenadzerHasel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppGraf {
    Menu menu = new Menu();

    JLabel loginNowy;
    JTextArea loginNowyText;
    JLabel hasloNowy;
    JTextArea hasloNowyText;
    JLabel urlNowy;
    JTextArea urlNowyText;
    JButton btnNowy;

    JLabel loginUsun;
    JTextArea loginUsunText;
    JLabel hasloUsun;
    JTextArea hasloUsunText;
    JButton btnUsunLogin;
    JButton btnUsunHaslo;

    JLabel loginSzukaj;
    JLabel urlSzukaj;
    JTextArea szukajTextLogin;
    JTextArea szukajTextAdres;
    JButton btnSzukajLogin;
    JButton btnSzukajURL;
    public JPanel createContentPane() {
        JPanel okno = new JPanel();


        //nowy plik
        JPanel panelNowyPlik = new JPanel();
        loginNowy = new JLabel("* login");
        loginNowy.setBounds(3,10,100,20);
       // loginNowy.setVisible(false);
        loginNowyText = new JTextArea();
        loginNowyText.setBounds(50,10,180,20);
        //loginNowyText.setVisible(false);
        hasloNowy = new JLabel("* haslo");
        hasloNowy.setBounds(3,40,100,20);
       // hasloNowy.setVisible(false);
        hasloNowyText = new JTextArea();
        hasloNowyText.setBounds(50,40,180,20);
       // hasloNowyText.setVisible(false);
        urlNowy = new JLabel("   URL");
        urlNowy.setBounds(3,70,100,20);
        //urlNowy.setVisible(false);
        urlNowyText = new JTextArea();
        urlNowyText.setBounds(50,70,180,20);
       // urlNowyText.setVisible(false);
        btnNowy = new JButton("DODAJ");
        btnNowy.setBounds(80,100,80,20);
       // btnNowy.setVisible(false);

        panelNowyPlik.add(loginNowy);
        panelNowyPlik.add(loginNowyText);
        panelNowyPlik.add(hasloNowy);
        panelNowyPlik.add(hasloNowyText);
        panelNowyPlik.add(urlNowy);
        panelNowyPlik.add(urlNowyText);
        panelNowyPlik.add(btnNowy);
        panelNowyPlik.setBounds(0,0,250,350);
        panelNowyPlik.setLayout(null);
        panelNowyPlik.setVisible(false);
        okno.add(panelNowyPlik);
        //

        //Usun wpis
        JPanel panelUsunWpisLogin = new JPanel();

        JPanel panelUsunWpisHaslo = new JPanel();
        loginUsun= new JLabel("login");
        loginUsun.setBounds(3,10,100,20);

        loginUsunText= new JTextArea();
        loginUsunText.setBounds(50,10,180,20);
        hasloUsun = new JLabel("haslo");
        hasloUsun.setBounds(3,0,100,20);

        hasloUsunText = new JTextArea();
        hasloUsunText.setBounds(50,0,180,20);
        btnUsunLogin = new JButton("OK");
        btnUsunLogin.setBounds(80,50,80,20);
        btnUsunHaslo = new JButton("OK");
        btnUsunHaslo.setBounds(80,50,80,20);


        panelUsunWpisLogin.setBounds(0,0,250,175);
        panelUsunWpisLogin.setLayout(null);
        panelUsunWpisLogin.add(loginUsun);
        panelUsunWpisLogin.add(loginUsunText);
        panelUsunWpisLogin.add(btnUsunLogin);
        panelUsunWpisLogin.setVisible(false);

        panelUsunWpisHaslo.setBounds(0,175,250,175);
        panelUsunWpisHaslo.setLayout(null);
        panelUsunWpisHaslo.add(hasloUsun);
        panelUsunWpisHaslo.add(hasloUsunText);
        panelUsunWpisHaslo.add(btnUsunHaslo);
        panelUsunWpisHaslo.setVisible(false);
        okno.add(panelUsunWpisLogin);
        okno.add(panelUsunWpisHaslo);
        //

        //Szukaj

        JPanel panelSzukajLogin = new JPanel();
        panelSzukajLogin.setBounds(0,0,250,175);
        panelSzukajLogin.setLayout(null);
        panelSzukajLogin.setVisible(false);
        loginSzukaj = new JLabel("Podaj login");
        loginSzukaj.setBounds(10,10,100,20);
        //loginSzukaj.setVisible(false);
        panelSzukajLogin.add(loginSzukaj);
        szukajTextLogin = new JTextArea();
        szukajTextLogin.setBounds(90,10,140,20);
       //szukajText.setVisible(false);
        panelSzukajLogin.add(szukajTextLogin);
        btnSzukajLogin = new JButton("OK");
        btnSzukajLogin.setBounds(10,40,60,20);
        //btnSzukaj.setVisible(false);
        panelSzukajLogin.add(btnSzukajLogin);
        okno.add(panelSzukajLogin);


        JPanel panelSzukajAdres = new JPanel();
        panelSzukajAdres.setBounds(0,0,250,175);
        panelSzukajAdres.setLayout(null);
        panelSzukajAdres.setVisible(false);
        urlSzukaj = new JLabel("Podaj URL");
        urlSzukaj.setBounds(10,10,100,20);
        // urlSzukaj.setVisible(false);
        panelSzukajAdres.add(urlSzukaj);
        szukajTextAdres = new JTextArea();
        szukajTextAdres.setBounds(90,10,140,20);
        //szukajText.setVisible(false);
        panelSzukajAdres.add(szukajTextAdres);
        btnSzukajURL = new JButton("OK");
        btnSzukajURL.setBounds(10,40,60,20);
        //btnSzukaj.setVisible(false);
        panelSzukajAdres.add(btnSzukajURL);
        okno.add(panelSzukajAdres);


        //



        //listenery
        menu.help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        null,
                        "TO JEST APLIKACJA DO PRZECHOWYWANIA HASŁA\n Michał Centkowski, Robert Suwarski",
                        "POMOC",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        menu.test.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SQL sql = new SQL();
                sql.TestPolaczenia();

            }
        });
        menu.nowy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelNowyPlik.setVisible(true);

                panelUsunWpisLogin.setVisible(false);
                panelUsunWpisHaslo.setVisible(false);
                panelSzukajAdres.setVisible(false);
                panelSzukajLogin.setVisible(false);
            }
        });
        btnNowy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!loginNowyText.getText().isEmpty() && !hasloNowyText.getText().isEmpty()) {

                    SQL sql = new SQL();
                    sql.NowyWpis(loginNowyText.getText(), hasloNowyText.getText(), urlNowyText.getText());

                    JOptionPane.showMessageDialog(null,
                            "Pomyślnie dodano dane",
                            "Informacja Nowy Wpis",
                            JOptionPane.INFORMATION_MESSAGE);

                } else {

                    JOptionPane.showMessageDialog(null,
                            "Podaj wymagane dane!",
                            "Nowy Wpis Error Information",
                            JOptionPane.INFORMATION_MESSAGE);

                }

            }
        });


        menu.usun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelUsunWpisLogin.setVisible(true);
                panelUsunWpisHaslo.setVisible(true);

                panelSzukajAdres.setVisible(false);
                panelSzukajLogin.setVisible(false);
                panelNowyPlik.setVisible(false);

            }
        });

        btnUsunLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SQL sql = new SQL();
                sql.UsunWpisLogin(loginUsunText.getText());

                JOptionPane.showMessageDialog(null,
                        "Poprawnie usunięto rekord",
                        "Usuń Wpis Login Information",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        });

        btnUsunHaslo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SQL sql = new SQL();
                sql.UsunWpisPassword(hasloUsunText.getText());

                JOptionPane.showMessageDialog(null,
                        "Poprawnie usunięto rekord",
                        "Usuń Wpis hasło Information",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        });

        menu.wgAdresu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelSzukajAdres.setVisible(true);

                panelNowyPlik.setVisible(false);
                panelUsunWpisLogin.setVisible(false);
                panelUsunWpisHaslo.setVisible(false);
                panelSzukajLogin.setVisible(false);

            }
        });


        menu.wgLoginu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelSzukajLogin.setVisible(true);

                panelSzukajAdres.setVisible(false);
                panelNowyPlik.setVisible(false);
                panelUsunWpisLogin.setVisible(false);
                panelUsunWpisHaslo.setVisible(false);

            }
        });

        btnSzukajURL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SQL sql = new SQL();
                sql.SzukajAdres(szukajTextAdres.getText());

            }
        });

        btnSzukajLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SQL sql = new SQL();
                sql.SzukajLogin(szukajTextLogin.getText());

            }
        });


        //

        return okno;
    }
    public AppGraf() {

        JFrame frame = new JFrame("Menadżer Haseł");
        frame.setContentPane(createContentPane());
        frame.setSize(250, 350);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setJMenuBar(menu.getMenu());

        menu.zamknij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

            }
        });

    }
}
