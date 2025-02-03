/*
 *
 * Robert Suwarski, Michał Centkowski
 * 4PP
 *
 * */
package Wisielec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetValueProperties {

    String[] tabHasla;


            InputStream input;

    {
        try {
            input = new FileInputStream(".\\src\\Wisielec\\hasla.properties");

            Properties prop = new Properties();
            prop.load(input);

            tabHasla = new String[]{
                    prop.getProperty("slowo1"),
                    prop.getProperty("slowo2"),
                    prop.getProperty("slowo3"),
                    prop.getProperty("slowo4"),
                    prop.getProperty("slowo5"),
                    prop.getProperty("slowo6"),
                    prop.getProperty("slowo7"),
                    prop.getProperty("slowo8"),
                    prop.getProperty("slowo9"),
                    prop.getProperty("slowo10")
            };

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
