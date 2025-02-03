/**
-Przemek Sadowski, Oskar Bednarz
-Kl4pp
-06.09.2022
 */

package Notatnik;

import java.io.File;
import java.util.Scanner;

public class InfoPlik {

   private File Plik;

    public InfoPlik(File plik) {
        Plik = plik;
    }

    public File getPlik() {
        return Plik;
    }

    public void setPlik(File plik) {
        Plik = plik;
    }

    public void info(){



        if(!Plik.exists()){

            System.out.println("****************");
            System.out.println("*  BRAK PLIKU  *");
            System.out.println("*  "+Plik.getName()+"  *");
            System.out.println("****************");


        }else{

            System.out.println("----------------------------");
            System.out.println("|Nazwa Pliku: "+Plik.getName()+"        ");
            System.out.println("----------------------------");
            System.out.println("|Właściwości|Stan          ");
            System.out.println("----------------------------");
            System.out.println("|canExecute()|"+Plik.canExecute());
            System.out.println("|canRead()|"+Plik.canRead());
            System.out.println("|canWrite()|"+Plik.canWrite());
            System.out.println("|exists()|"+Plik.exists());
            System.out.println("|getFreeSpace()|"+Plik.getFreeSpace());
            System.out.println("|getName()|"+Plik.getName());
            System.out.println("|getParent()|"+Plik.getParent());
            System.out.println("|getParentFile()|"+Plik.getParentFile());
            System.out.println("|getPath()|"+Plik.getPath());
            System.out.println("|getTotalSpace()|"+Plik.getTotalSpace());
            System.out.println("|hashCode()|"+Plik.hashCode());
            System.out.println("|isDirectory()|"+Plik.isDirectory());

        }



    };

    public static void main(String[] args) {

        System.out.println("Podaj ścieżke pliku:");

        Scanner podajNazwePliku = new Scanner(System.in);

        File pliki = new File(podajNazwePliku.nextLine());

        InfoPlik plik1 = new InfoPlik(pliki);
        plik1.info();

    }
}

