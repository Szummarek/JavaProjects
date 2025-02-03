package WystawienieOcen;

import javax.swing.*;

public class Komunikat {

    private String sredniaOcen;
    private double convertSrednia;

    public Komunikat() {
        sredniaOcen = JOptionPane.showInputDialog(
                null,
                "Podaj swoją średnią ocen",
                "Wpisywanie danych",
                JOptionPane.QUESTION_MESSAGE
        );

        convertSrednia = Double.parseDouble(sredniaOcen);

        if (convertSrednia > 0 && convertSrednia < 2) {
            JOptionPane.showMessageDialog(
                    null,
                    "Powtarzasz klasę!",
                    "Komunikat",
                    JOptionPane.ERROR_MESSAGE
            );
        } else if (convertSrednia >= 2 && convertSrednia < 3) {
            JOptionPane.showMessageDialog(
                    null,
                    "Udało się !",
                    "Komunikat",
                    JOptionPane.WARNING_MESSAGE
            );
        } else if (convertSrednia >= 3 && convertSrednia < 4) {
            JOptionPane.showMessageDialog(
                    null,
                    "Można było lepiej",
                    "Komunikat",
                    JOptionPane.QUESTION_MESSAGE
            );
        } else if (convertSrednia >= 4 && convertSrednia <= 5) {
            JOptionPane.showMessageDialog(
                    null,
                    "Jest OK!",
                    "Komunikat",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }


}
