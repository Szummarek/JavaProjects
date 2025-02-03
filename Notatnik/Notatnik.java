/**
-Przemek Sadowski, Oskar Bednarz
-Kl4pp
-09.09.2022
 */

package Notatnik;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notatnik{

    JMenuBar pasekMenu;
    JMenu plik;
    JMenu edycja;

    JMenu format;

    JMenu widok;
    JMenu pomoc;
    JMenuItem nowy;

    JMenuItem noweOkno;

    JMenuItem otworz;

    JMenuItem zapisz;

    JMenuItem zapiszJako;

    JMenuItem ustawieniaStrony;

    JMenuItem drukuj;

    JMenuItem koniec;

    JMenuItem cofnij;

    JMenuItem wytnij;

    JMenuItem kopiuj;

    JMenuItem wklej;

    JMenuItem usun;

    JMenuItem szukaj;

    JMenuItem znajdz;

    JMenuItem znajdzNastepny;

    JMenuItem znajdzPoprzednie;

    JMenuItem zamien;

    JMenuItem przejdz;

    JMenuItem zaznacz;

    JMenuItem godzinaData;

    JMenuItem zawijanie;

    JMenuItem czcionka;

    JMenu powiekszenie;

    JMenuItem powieksz;

    JMenuItem pomniejsz;

    JMenuItem przywroc;

    JCheckBoxMenuItem pasekStanu;

    JMenuItem wyswietl;

    JMenuItem info;

    JMenuItem help;

    JTextArea poleTekstowe;


    public JPanel createContentPane(){
        JPanel mojpanel = new JPanel();
        mojpanel.setBackground(Color.CYAN);



        poleTekstowe = new JTextArea();
        poleTekstowe.setFont(new Font("TimesNewRoman",Font.PLAIN,10));
        poleTekstowe.setBounds(5,5,770,570);
        mojpanel.add(poleTekstowe);




        pasekMenu = new JMenuBar();

        plik = new JMenu("Plik");
        edycja = new JMenu("Edycja");
        format = new JMenu("Format");
        widok = new JMenu("Widok");
        pomoc = new JMenu("Pomoc");

        nowy = new JMenuItem("Nowy");
        plik.add(nowy);

        noweOkno = new JMenuItem("Nowe Okno");
        plik.add(noweOkno);

        otworz = new JMenuItem("Otwórz...");
        plik.add(otworz);

        zapisz = new JMenuItem("Zapisz");
        plik.add(zapisz);

        zapiszJako = new JMenuItem("Zapisz Jako...");
        plik.add(zapiszJako);

        ustawieniaStrony = new JMenuItem("Ustawienia Strony");
        plik.add(ustawieniaStrony);

        drukuj = new JMenuItem("Drukuj...");
        plik.add(drukuj);

        koniec = new JMenuItem("Zakończ");
        plik.add(koniec);

        cofnij = new JMenuItem("Cofnij");
        edycja.add(cofnij);

        wytnij = new JMenuItem("Wytnij");
        edycja.add(wytnij);

        kopiuj = new JMenuItem("Kopiuj");
        edycja.add(kopiuj);

        wklej = new JMenuItem("Wklej");
        edycja.add(wklej);

        usun = new JMenuItem("Usuń");
        edycja.add(usun);

        szukaj = new JMenuItem("Wyszukaj za pomocą usługi Bing...");
        edycja.add(szukaj);

        znajdz = new JMenuItem("Znajdź...");
        edycja.add(znajdz);

        znajdzNastepny = new JMenuItem("Znajdź następny");
        edycja.add(znajdzNastepny);

        znajdzPoprzednie = new JMenuItem("Znajdź poprzednie");
        edycja.add(znajdzPoprzednie);

        zamien = new JMenuItem("Zamień");
        edycja.add(zamien);

        przejdz = new JMenuItem("Przejdź do...");
        edycja.add(wytnij);

        zaznacz = new JMenuItem("Zaznacz wszystko");
        edycja.add(zaznacz);

        godzinaData = new JMenuItem("Godzina/Data");
        edycja.add(godzinaData);

        zawijanie = new JMenuItem("Zawijanie wierszy");
        format.add(zawijanie);

        czcionka = new JMenuItem("Czcionka...");
        format.add(czcionka);

        powiekszenie = new JMenu("Powieksznie");
        widok.add(powiekszenie);

        powieksz = new JMenuItem("Powiększ");
        powiekszenie.add(powieksz);

        pomniejsz = new JMenuItem("Pomniejsz");
        powiekszenie.add(pomniejsz);

        przywroc = new JMenuItem("Przywróć powiększenie domyślne");
        powiekszenie.add(przywroc);

        pasekStanu = new JCheckBoxMenuItem("Pasek Stanu");
        widok.add(pasekStanu);

        wyswietl = new JMenuItem("Wyświetl pomoc");
        pomoc.add(wyswietl);

        info = new JMenuItem("Info Plik");
        pomoc.add(info);

        zapiszJako.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser j = new JFileChooser();

                j.setDialogTitle("Zapisz jako:");
                j.showSaveDialog(null);
                File file = j.getSelectedFile();

                try {
                    FileWriter fw = new FileWriter(file);

                    String textArea = poleTekstowe.getText();
                    String[] words = textArea.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        fw.write(words[i]+" ");
                    }
                    fw.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        otworz.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 JFileChooser j = new JFileChooser();
                 j.showOpenDialog(null);
                 File plik = j.getSelectedFile();
                 FileReader odczyt = null;

                 try {
                     odczyt = new FileReader(plik);

                     int znak;
                     while((znak = odczyt.read()) != -1){
                         poleTekstowe.append(String.valueOf((char)znak));
                     }

                 } catch (IOException ex) {
                     ex.printStackTrace();
                 } finally {
                     if (odczyt != null) {
                         try {
                             odczyt.close();
                         } catch (IOException ex) {
                             ex.printStackTrace();
                         }
                     }
                 }

             }
        });

                info.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        InfoPlik infoPlik1 = new InfoPlik(new File("testowy.txt"));


                        infoPlik1.info();

                    }
                });

        help = new JMenuItem("Notatnik - Informacje");
        pomoc.add(help);

        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Przemek Sadowski, Oskar Bednarz"+"\n"+"wersja 1.0",
                        "Notatnik-Informacje",
                        JOptionPane.INFORMATION_MESSAGE
                );

            }
        });

        pasekMenu.add(plik);
        pasekMenu.add(edycja);
        pasekMenu.add(format);
        pasekMenu.add(widok);
        pasekMenu.add(pomoc);

        return mojpanel;
    }

    public Notatnik(){

        JFrame frame = new JFrame("Notatnik PS OB");
        frame.setContentPane(createContentPane());
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ikona.png")));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setJMenuBar(pasekMenu);

    }

}
