/*
* Robert Suwarski 4PP
* Aplikacja TO DO LIST
* */
package ToDoList;

import javax.swing.*;
import javax.swing.text.html.ListView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ToDoList {


    JLabel titleText;
    JButton newTask;
    JTextField textTask;
    GridLayout layout;
    JCheckBox checkBox;


    public JPanel createContentPane() {

        JPanel panel = new JPanel();


        titleText = new JLabel("To Do List");
        titleText.setBounds(5,5,360,60);
        titleText.setFont(new Font("Sans-serif",Font.BOLD,28));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        panel.add(titleText);

        newTask = new JButton("Dodaj zadanie");
        newTask.setBounds(90,505,200,40);
        newTask.setFocusPainted(false);
        newTask.setFont(new Font("Sans-serif",Font.PLAIN,18));
        panel.add(newTask);

        JPanel listPanel = new JPanel();
        listPanel.setBackground(new Color(195, 247, 209));
        listPanel.setBounds(0,70,390,370);
        panel.add(listPanel);

        textTask = new JTextField();
        textTask.setBounds(0,450,380,40);
        textTask.setFont(new Font("Sans-serif",Font.PLAIN,18));
        panel.add(textTask);

        layout = new GridLayout(6,1);
        layout.setHgap(5);
        listPanel.setLayout(layout);


        newTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textTask.getText().equals("")) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Puste pole do wprowadzania"+"\n"+"Wpisz swoje zadanie",
                            "To Do List Error",
                            JOptionPane.ERROR_MESSAGE
                    );

                } else {

                    String task = textTask.getText();
                    checkBox = new JCheckBox(task);
                    checkBox.setBackground(new Color(211, 198, 247));
                    checkBox.setFont(new Font("Sans-serif",Font.PLAIN,12));
                    listPanel.add(checkBox);

                    textTask.setText("");

                }

                listPanel.revalidate();
                listPanel.repaint();

            }
        });




        return panel;
    }

    public ToDoList(){

        JFrame frame = new JFrame("Aplikacja - To Do List");
        frame.setContentPane(createContentPane());
        frame.setSize(400, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

}
