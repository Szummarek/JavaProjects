/*
*
* Robert Suwarski, Michał Centkowski
* 4PP
*
* */

package Wisielec;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gra {

    JMenuBar menuBar = new JMenuBar();
    JMenuItem exit;
    JMenuItem info;
    JMenuItem nowa;


    int lifes = 7;
    int iconCount = 1;
    String word;
    char[] charHolder;
    String randomHolder;

    public JPanel createContentPane() {
        JPanel panel = new JPanel();
        panel.setFont(new Font("Arial",Font.PLAIN,30));
        panel.setBackground(new Color(121, 128, 130));

        JMenu gra = new JMenu("GRA");
        menuBar.add(gra);

        nowa = new JMenuItem("Nowa Gra");
        gra.add(nowa);
        info = new JMenuItem("Info");
        gra.add(info);
        exit = new JMenuItem("Exit");
        gra.add(exit);

        JTextArea poleGry = new JTextArea();
        poleGry.setBounds(10,10,350,150);
        poleGry.setFont(new Font("Arial",Font.PLAIN,30));
        poleGry.setEditable(false);
        panel.add(poleGry);

        JLabel text = new JLabel("Podaj literę: ");
        text.setBounds(10,190,190,40);
        text.setFont(new Font("Arial",Font.PLAIN,30));
        panel.add(text);


        JTextArea textArea = new JTextArea();
        textArea.setBounds(200,190,40,40);
        textArea.setFont(new Font("Arial",Font.PLAIN,30));
        panel.add(textArea);

        JButton check = new JButton("Sprawdź");
        check.setBounds(250,190,100,40);
        check.setBackground(new Color(30, 30, 33));
        check.setForeground(new Color(216, 216, 235));
        panel.add(check);

        JLabel picture = new JLabel();
        picture.setBounds(380,10,180,220);
        panel.add(picture);


        nowa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                NewGame newGame = new NewGame();
                RandomWord randomWord = new RandomWord();

                randomHolder = randomWord.RandomWords();

                charHolder = newGame.ConvertWord(randomHolder);

                word = String.valueOf(charHolder);

                poleGry.setText(word);

            }
        });

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (lifes > 0) {

                    char x = textArea.getText().charAt(0);

                    if (randomHolder.contains(x+"")) {

                        for (int i = 0; i < randomHolder.length(); i++) {

                            if (randomHolder.charAt(i) == x){

                                charHolder[i] = x;

                                word = String.valueOf(charHolder);
                                poleGry.setText(word);

                            }

                        }

                    } else {

                        lifes--;
                        picture.setIcon(new ImageIcon(".\\src\\Wisielec\\images\\hangman"+iconCount+".png"));
                        iconCount++;

                    }

                    if (randomHolder.equals(String.valueOf(charHolder))) {

                        poleGry.setText("Wygrałeś! BRAWO");

                    }

                }

                if (lifes == 0) {

                    poleGry.setText("Przegrałeś!");

                }

                textArea.setText(null);

            }
        });



        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Robert Suwarski, Michał Centkowski",
                        "Wisielec INFO",
                        JOptionPane.INFORMATION_MESSAGE
                );

            }
        });

        return panel;
    }

    public Gra(){

        JFrame frame = new JFrame("Wisielec RS MC");
        frame.setContentPane(createContentPane());
        frame.setSize(600, 300);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setJMenuBar(menuBar);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

            }
        });

    }
}
