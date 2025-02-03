package Histogram;

/**************************************


 * Imie i Nazwisko : Robert Suwarski

 * Klasa : 3pp

 * Nr z dziennika : 17


 ****************************************/

public class Statystyki {

    private String mytext;

    private int ileliter;

    private int ileSpacji;

    private int iloscwyrazow;

    private int ilosckrop;
    private int iloscprzeci;
    private int iloscdwukrop;
    private int iloscsrednika;
    private int iloscmys;
    private int iloscapostr;
    private int ilosccudzys;

    @Override
    public String toString() {
        return
                "Ilość liter=" + ileliter + "\n" +
                "Ilość spacji=" + ileSpacji + "\n" +
                "Ilość wyrazów=" + iloscwyrazow + "\n" +
                "Ilość kropek =" + ilosckrop + "\n" +
                "Ilość przecinków =" + iloscprzeci + "\n" +
                "Ilość dwukropków =" + iloscdwukrop + "\n" +
                "Ilość średnika =" + iloscsrednika + "\n" +
                "Ilość myślników =" + iloscmys + "\n" +
                "Ilość apostrof =" + iloscapostr + "\n" +
                "Ilość cudzysłowia =" + ilosccudzys;

    }

    public void printStatystyki(String text) {
        mytext = text;
        int sizeText = mytext.length();

        for (int i = 0; i < sizeText; i++) {
            if (mytext.charAt(i) == ' ' && mytext.charAt(i+1) != ' ' || i == sizeText -1) {
                iloscwyrazow++;
            }

            if (mytext.charAt(i) > 64 && mytext.charAt(i) < 91) {
                ileliter++;
            }
            if (mytext.charAt(i) > 96 && mytext.charAt(i) < 123) {
                ileliter++;
            }
            if (mytext.charAt(i) == 32) {
                ileSpacji++;
            }
            if (mytext.charAt(i) == 46) {
                ilosckrop++;
            }
            if (mytext.charAt(i) == 44) {
                iloscprzeci++;
            }
            if (mytext.charAt(i) == 58) {
                iloscdwukrop++;
            }
            if (mytext.charAt(i) == 59) {
                iloscsrednika++;
            }
            if (mytext.charAt(i) == 45){
                iloscmys++;
            }
            if (mytext.charAt(i) == 39) {
                iloscapostr++;
            }
            if (mytext.charAt(i) == 34) {
                ilosccudzys++;
            }
        }
    }
}


