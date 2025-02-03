/*
 *
 * Robert Suwarski, Michał Centkowski
 * 4PP
 *
 * */
package Wisielec;


public class RandomWord {

    public String RandomWords() {

        GetValueProperties propValue = new GetValueProperties();

        int randomNumber = (int) ((Math.random() * (9 - 0)) + 0);

        String word = propValue.tabHasla[randomNumber];

        return word;
    }

}
