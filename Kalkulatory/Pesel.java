package Kalkulatory;

import java.util.regex.Pattern;

public class Pesel {
    public boolean isPesel(String pesel) {

        return pesel.length() == 11 && Pattern.matches("[0-9]+",pesel);
    }
}
