/*
 *
 * Robert Suwarski, Michał Centkowski
 * 4PP
 *
 * */
package Wisielec;

public class NewGame {

    public char[] ConvertWord(String word) {

        char[] convert = new char[word.length()];
        int i = 0;
        while (i < word.length()) {
            convert[i] = '_';
            if (word.charAt(i) == ' '){
                convert[i] = ' ';
            }
            i++;
        }

        return convert;

    }

}
