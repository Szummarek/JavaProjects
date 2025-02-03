package Slownik;

import javax.swing.*;

public class Komunikaty {
    Komunikaty(int errorNumber) {
        if (errorNumber == 1) {
            JOptionPane.showMessageDialog(
                    null,
                    "Brak danych w polach!",
                    "Okno błędu",
                    JOptionPane.ERROR_MESSAGE
            );
        } else if (errorNumber == 2) {
            JOptionPane.showMessageDialog(
                    null,
                    "Brak danych w polach!",
                    "Okno błędu",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
