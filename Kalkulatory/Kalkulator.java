package Kalkulatory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class Kalkulator extends JFrame{

    JLabel tytul;

    public void initComponents() {
        Container panel = this.getContentPane();

        tytul = new JLabel();
        tytul.setBounds(300, 30, 200, 60);
        tytul.setBackground(Color.white);
        tytul.setText("Kalkulatory");
        tytul.setHorizontalAlignment(JLabel.CENTER);
        tytul.setFont(new Font( "Arial", Font.PLAIN,18));
        tytul.setOpaque(true);
        panel.add(tytul);

        //część PESEL
        JCheckBox pesel = new JCheckBox("PESEL");
        pesel.setBounds(160, 120, 110, 50);
        pesel.setFont(new Font( "Arial", Font.PLAIN,18));
        pesel.setForeground(Color.white);
        pesel.setBackground(Color.black);
        panel.add(pesel);

        JTextField checkPesel = new JTextField();
        checkPesel.setBounds(130,210,110,30);
        checkPesel.setVisible(false);
        panel.add(checkPesel);

        JLabel peselText = new JLabel();
        peselText.setText("Podaj Pesel: ");
        peselText.setHorizontalAlignment(JLabel.CENTER);
        peselText.setFont(new Font( "Arial", Font.PLAIN,14));
        peselText.setBounds(25,210,110,30);
        peselText.setVisible(false);
        panel.add(peselText);

        JButton check = new JButton("Sprawdź PESEL");
        check.setBounds(30,260,200,30);
        check.setFont(new Font( "Arial", Font.PLAIN,16));
        check.setVisible(false);
        panel.add(check);

        JTextField checkError = new JTextField();
        checkError.setBounds(240,320,200,30);
        checkError.setForeground(Color.red);
        checkError.setVisible(false);
        panel.add(checkError);


        // część BMI
        JCheckBox bmi = new JCheckBox("BMI");
        bmi.setBounds(520, 120, 110, 50);
        bmi.setFont(new Font( "Arial", Font.PLAIN,18));
        bmi.setForeground(Color.white);
        bmi.setBackground(Color.black);
        panel.add(bmi);

        JTextField wzrost = new JTextField();
        wzrost.setBounds(600,200,80,30);
        wzrost.setVisible(false);
        panel.add(wzrost);

        JLabel cmText = new JLabel();
        cmText.setText("cm");
        cmText.setBounds(680,200,20,30);
        cmText.setFont(new Font( "Arial", Font.PLAIN,14));
        cmText.setVisible(false);
        panel.add(cmText);

        JLabel wzrostText = new JLabel();
        wzrostText.setText("Podaj Wzrost: ");
        wzrostText.setHorizontalAlignment(JLabel.CENTER);
        wzrostText.setFont(new Font( "Arial", Font.PLAIN,14));
        wzrostText.setBounds(500,200,110,30);
        wzrostText.setVisible(false);
        panel.add(wzrostText);

        JTextField waga = new JTextField();
        waga.setBounds(600,240,80,30);
        waga.setVisible(false);
        panel.add(waga);

        JLabel kgText = new JLabel();
        kgText.setText("kg");
        kgText.setBounds(680,240,20,30);
        kgText.setFont(new Font( "Arial", Font.PLAIN,14));
        kgText.setVisible(false);
        panel.add(kgText);

        JLabel wagaText = new JLabel();
        wagaText.setText("Podaj Wagę: ");
        wagaText.setHorizontalAlignment(JLabel.CENTER);
        wagaText.setFont(new Font( "Arial", Font.PLAIN,14));
        wagaText.setBounds(500,240,110,30);
        wagaText.setVisible(false);
        panel.add(wagaText);

        JButton checkBMI = new JButton("Sprawdź BMI");
        checkBMI.setBounds(520,280,200,30);
        checkBMI.setFont(new Font( "Arial", Font.PLAIN,16));
        checkBMI.setVisible(false);
        panel.add(checkBMI);

        JTextField resultBMI = new JTextField();
        resultBMI.setBounds(480,320,200,30);
        resultBMI.setVisible(false);
        panel.add(resultBMI);


        ActionListener peselListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pesel.isSelected()) {
                    checkPesel.setVisible(true);
                    peselText.setVisible(true);
                    check.setVisible(true);
                    checkError.setVisible(true);

                    bmi.setSelected(false);
                    wzrost.setVisible(false);
                    cmText.setVisible(false);
                    wzrostText.setVisible(false);
                    waga.setVisible(false);
                    kgText.setVisible(false);
                    wagaText.setVisible(false);
                    checkBMI.setVisible(false);
                    resultBMI.setVisible(false);
                } else {
                    checkPesel.setVisible(false);
                    peselText.setVisible(false);
                    check.setVisible(false);
                    checkError.setVisible(false);
                }
            }
        };
        pesel.addActionListener(peselListener);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pesel pesel = new Pesel();
                String myPesel = checkPesel.getText();
                if (pesel.isPesel(myPesel) == true) {
                    checkError.setText("Pesel jest poprawny");
                } else {
                    checkError.setText("Pesel jest błędny");
                }
            }
        });

        ActionListener bmiListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bmi.isSelected()) {
                    wzrost.setVisible(true);
                    cmText.setVisible(true);
                    wzrostText.setVisible(true);
                    waga.setVisible(true);
                    kgText.setVisible(true);
                    wagaText.setVisible(true);
                    checkBMI.setVisible(true);
                    resultBMI.setVisible(true);

                    pesel.setSelected(false);
                    checkPesel.setVisible(false);
                    peselText.setVisible(false);
                    check.setVisible(false);
                    checkError.setVisible(false);
                } else {
                    wzrost.setVisible(false);
                    cmText.setVisible(false);
                    wzrostText.setVisible(false);
                    waga.setVisible(false);
                    kgText.setVisible(false);
                    wagaText.setVisible(false);
                    checkBMI.setVisible(false);
                    resultBMI.setVisible(false);
                }
            }
        };
        bmi.addActionListener(bmiListener);

        checkBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BMI bmi = new BMI();
                String TextValueCM = wzrost.getText();
                String TextValueKG = waga.getText();
                float cmValue = Float.parseFloat(TextValueCM);
                float kgValue = Float.parseFloat(TextValueKG);
                float wynik = bmi.obliczBMI(cmValue,kgValue);
                if (wynik < 16) {
                    resultBMI.setText("wygłodzenie");
                    resultBMI.setForeground(Color.black);
                } else if (wynik > 16 && wynik < 16.99) {
                    resultBMI.setText("wychudzenie");
                    resultBMI.setForeground(Color.black);
                } else if (wynik > 17 && wynik < 18.99) {
                    resultBMI.setForeground(Color.blue);
                    resultBMI.setText("niedowaga");
                } else if (wynik > 18.5 && wynik < 24.99) {
                    resultBMI.setForeground(Color.green);
                    resultBMI.setText("wartość prawidłowa");
                } else if (wynik > 25 && wynik < 29.99) {
                    resultBMI.setForeground(Color.red);
                    resultBMI.setText("nadwaga");
                } else if (wynik > 30 && wynik < 34.99) {
                    resultBMI.setForeground(Color.black);
                    resultBMI.setText("I stopień otyłości");
                } else if (wynik > 35 && wynik < 39.99) {
                    resultBMI.setForeground(Color.black);
                    resultBMI.setText("II stopień otyłości");
                } else if (wynik > 40) {
                    resultBMI.setForeground(Color.black);
                    resultBMI.setText("otyłość skrajna");
                }
            }
        });

    }

    public Kalkulator() {

        this.setLocationRelativeTo(null);
        this.setTitle("Robert Suwarski");
        this.setSize(800,400);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(17,175,18));
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
    }

}
