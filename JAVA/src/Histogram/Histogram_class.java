package Histogram;

public class Histogram_class {
    private String mytext;
    private int[] ileliter;
    public String printHistogram(char znak) {
        int sizeText = mytext.length();

        for (int i = 0; i < sizeText; i++) {
            if (mytext.charAt(i) > 64 && mytext.charAt(i) < 91) {
                ileliter[mytext.charAt(i) - 65]++;
            }
            if (mytext.charAt(i) > 96 && mytext.charAt(i) < 123) {
                ileliter[mytext.charAt(i) - 97]++;
            }
        }
        String his="";
        for (int i = 25; i > -1; i--) {
            his+= " " + (char)(i+65) +": ";
            for (int j = 0; j < ileliter[i]; j++) his += znak;
            his +="\n";
        }
        return his;
    }
    public Histogram_class(String mytext){
        ileliter = new int[26];
        this.mytext = mytext;
    };
}
