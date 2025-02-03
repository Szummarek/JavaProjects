package CheckPesel;

import java.util.regex.Pattern;

public class SprawdzPesel {
    private int wynik;
    public int weryfikacjaPeselu(String pesel) {

        if (pesel.length() > 0 && pesel.length() < 11) {
            wynik = 2;
        } else if (pesel.isEmpty()) {
            wynik = 1;
        } else if (!Pattern.matches("[0-9]+",pesel)) {
            wynik = 3;
        } else if (pesel.length() == 11 && Pattern.matches("[0-9]+",pesel)) {
            wynik = 4;
        }
        return wynik;
    }
}
