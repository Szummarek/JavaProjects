package Slownik;

import java.util.ArrayList;

public class France {

    ArrayList<String> slowaPL = new ArrayList<String>();
    ArrayList<String> slowaFR = new ArrayList<String>();

    boolean czyWstawiono = false;

    France(String wyrazPOL, String wyrazFRAN) {

        if (czyWstawiono == false) {

            slowaPL.add("Kot");
            slowaFR.add("Chat");

            slowaPL.add("Pies");
            slowaFR.add("Chien");

            slowaPL.add("Krowa");
            slowaFR.add("Vache");

            slowaPL.add("Kanapka");
            slowaFR.add("Sandwich");

            slowaPL.add("Samochód");
            slowaFR.add("Voiture");

        }

        czyWstawiono = true;

        addNewPLWord(wyrazPOL);
        addNewFRANWord(wyrazFRAN);

    }

    public void addNewPLWord(String wyrazPOL) {

        if (checkPLword(wyrazPOL) != 2) {

            slowaPL.add(wyrazPOL);

        }

    }

    public void addNewFRANWord(String wyrazFR) {

        if (checkFRANword(wyrazFR) != 2) {

            slowaFR.add(wyrazFR);

        }

    }

    public int checkPLword(String wyrazPOL) {

        for (int i=0;i<slowaPL.size();i++) {
            if (wyrazPOL == slowaPL.get(i)) {
                return 2;
            }
        }
        return 0;

    }

    public int checkFRANword(String wyrazFRAN) {

        for (int i=0;i<slowaFR.size();i++) {
            if (wyrazFRAN == slowaFR.get(i)) {
                return 2;
            }
        }
        return 0;

    }

}
