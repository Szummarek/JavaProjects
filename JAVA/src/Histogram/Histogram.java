package Histogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Histogram {

    public JPanel createContentPane(){
        JPanel panel = new JPanel();
        Font czcionak = new Font("Tahoma",0,14);

        JPanel leftpanel = new JPanel(null);
        leftpanel.setBounds(0,0,440,600);
        leftpanel.setBackground(new Color(209, 54, 84));

        JLabel etykieta = new JLabel("Podaj tekst do histogramu");
        etykieta.setBounds(0,0,440,40);
        etykieta.setFont(czcionak);
        etykieta.setOpaque(true);
        etykieta.setBackground(Color.black);
        etykieta.setForeground(Color.white);

        leftpanel.add(etykieta);

        JTextArea text = new JTextArea();
        text.setBounds(20,50,400,440);
        text.setFont(czcionak);
        text.setLineWrap(true);

        leftpanel.add(text);

        JLabel symbolLable = new JLabel("Podaj symbol Histogramu");
        symbolLable.setBounds(20,510,190,30);
        symbolLable.setOpaque(true);
        symbolLable.setFont(czcionak);
        symbolLable.setBackground(Color.white);
        symbolLable.setForeground(Color.black);

        leftpanel.add(symbolLable);

        JTextField symbol = new JTextField();
        symbol.setBounds(230,510,120,30);
        symbol.setFont(czcionak);

        leftpanel.add(symbol);

        panel.add(leftpanel);

        JPanel rightpanel = new JPanel(null);
        rightpanel.setBounds(450,0,440,600);
        rightpanel.setBackground(new Color(184,3,255));

        JLabel etykieta1 = new JLabel();
        etykieta1.setBounds(0,0,440,40);
        etykieta1.setFont(czcionak);
        etykieta1.setOpaque(true);
        etykieta1.setBackground(Color.black);
        etykieta1.setForeground(Color.white);

        rightpanel.add(etykieta1);

        JTextArea wykres = new JTextArea();
        wykres.setBounds(20,50,400,440);
        wykres.setFont(czcionak);
        wykres.setLineWrap(true);
        wykres.setEditable(false);
        wykres.setVisible(false);

        rightpanel.add(wykres);

        JButton printhistogram = new JButton("Print Histogram");
        printhistogram.setBounds(20,510,130,30);

        rightpanel.add(printhistogram);

        JButton cleanAll = new JButton("Clear All");
        cleanAll.setBounds(160,510,130,30);

        rightpanel.add(cleanAll);

        JButton Statystyka = new JButton("Statystyka");
        Statystyka.setBounds(300,510,130,30);

        rightpanel.add(Statystyka);

        //sluchacz
        cleanAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etykieta1.setText("");
                text.setText("");
                symbol.setText("");
                wykres.setText("");
                wykres.setVisible(false);
            }
        });

        printhistogram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wykres.setVisible(true);
                etykieta1.setText("Histogram tekstu");
                Histogram_class his = new Histogram_class(text.getText());
                int sizeSymbol = symbol.getText().length();
                if (sizeSymbol == 0){
                    wykres.setText(his.printHistogram('$'));
                } else {
                    wykres.setText(his.printHistogram(symbol.getText().charAt(0)));
                }
            }
        });

        Statystyka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wykres.setVisible(true);
                etykieta1.setText("Statystyki tekstu");
                Statystyki statystyki = new Statystyki();
                statystyki.printStatystyki(text.getText());
                wykres.setText(statystyki.toString());

            }
        });
        panel.add(rightpanel);

        JPanel boks = new JPanel(null);
        boks.setBounds(440,0,10,600);
        boks.setBackground(new Color(0,0,0));

        panel.add(boks);

        return panel;
    };

    public Histogram(){
        super();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Histogram");
        frame.setContentPane(createContentPane());
        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
