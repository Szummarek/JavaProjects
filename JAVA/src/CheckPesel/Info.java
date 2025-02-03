package CheckPesel;

import javax.swing.*;

public class Info {
    public Info(int checkPesel) {
        if (checkPesel == 1) {
            JOptionPane.showMessageDialog(
                    null,
                    "Nie podałeś PESELU!",
                    "Komunikat",
                    JOptionPane.ERROR_MESSAGE
            );
        } else if (checkPesel == 2) {
            JOptionPane.showMessageDialog(
                    null,
                    "Za krótki PESEL",
                    "Komunikat",
                    JOptionPane.WARNING_MESSAGE
            );
        } else if (checkPesel == 3) {
            JOptionPane.showMessageDialog(
                    null,
                    "Błędny PESEL",
                    "Komunikat",
                    JOptionPane.ERROR_MESSAGE
            );
        } else if (checkPesel == 4) {
            JOptionPane.showMessageDialog(
                    null,
                    "PESEL jest poprawny",
                    "Komunikat",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
