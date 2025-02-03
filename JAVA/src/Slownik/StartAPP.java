package Slownik;

import java.util.ArrayList;
import java.util.Arrays;

public class StartAPP {
    public static void main(String[] args) {
//        Slownik slownik = new Slownik();

        France f = new France("Słowo","Mot");
        f.addNewPLWord("Krzesło");
        f.addNewFRANWord("Chaise");

        System.out.println(f.slowaPL+" "+f.slowaFR);

    }
}
