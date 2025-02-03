package MenadzerHasel;

import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import static java.awt.event.InputEvent.CTRL_DOWN_MASK;


public class Menu extends JFrame{
    JMenuBar menu;
    JMenu bazy;
    JMenu szukaj;
    JMenu info;
    JMenuItem test;
    JMenuItem nowy;
    JMenuItem usun;
    JMenuItem zamknij;
    JMenuItem wgLoginu;
    JMenuItem wgAdresu;
    JMenuItem help;
    public Menu() {

        menu = new JMenuBar();

        bazy = new JMenu("Bazy");
        szukaj = new JMenu("Szukaj");
        info = new JMenu("Info");

        test = new JMenuItem("Test");
            test.setAccelerator(KeyStroke.getKeyStroke('T',CTRL_DOWN_MASK));
            bazy.add(test);
        nowy = new JMenuItem("Nowy Wpis");
            nowy.setAccelerator(KeyStroke.getKeyStroke('N',CTRL_DOWN_MASK));
            bazy.add(nowy);
        usun = new JMenuItem("Usuń Wpis");
            usun.setAccelerator(KeyStroke.getKeyStroke('U',CTRL_DOWN_MASK));
            bazy.add(usun);
        zamknij = new JMenuItem("Zamknij");
            zamknij.setAccelerator(KeyStroke.getKeyStroke('Z',CTRL_DOWN_MASK));
            bazy.add(zamknij);

        wgLoginu = new JMenuItem("w/g Loginu");
            wgLoginu.setAccelerator(KeyStroke.getKeyStroke('L',CTRL_DOWN_MASK));
            szukaj.add(wgLoginu);
        wgAdresu = new JMenuItem("w/g Adresu");
            wgAdresu.setAccelerator(KeyStroke.getKeyStroke('A',CTRL_DOWN_MASK));
            szukaj.add(wgAdresu);

        help = new JMenuItem("Help");
            help.setAccelerator(KeyStroke.getKeyStroke('H',CTRL_DOWN_MASK));
            info.add(help);

        menu.add(bazy);
        menu.add(szukaj);
        menu.add(info);

    }

    public JMenuBar getMenu() {
        return menu;
    }
}
