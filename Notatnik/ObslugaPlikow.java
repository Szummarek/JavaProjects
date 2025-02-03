/**
 -Przemek Sadowski, Oskar Bednarz
 -Kl4pp
 -09.09.2022
 */


package Notatnik;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ObslugaPlikow {
    public static void main (String[] args) throws IOException {

        File savefile = new File(".\\src\\Notatnik\\testowy.txt");
        FileWriter file = new FileWriter(savefile);

        System.out.println("Wpisz tekst:");

        Scanner tekst = new Scanner(System.in);

        String tekstDoPliku = tekst.nextLine();

        //String napis = "Ala ma kota i dwa psy.";
        String[] words = tekstDoPliku.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            file.write(words[i]+"\n");
        }
        file.close();

        File plik = new File(".\\src\\Notatnik\\testowy.txt");
        FileReader odczyt = null;

        try {
            odczyt = new FileReader(plik);

            int znak;
            while((znak = odczyt.read()) != -1){
                System.out.print((char)znak);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (odczyt != null) odczyt.close();
        }

    }
}
