package Weryfikacja;

import java.util.Scanner;

/**************************************


 * Imie i Nazwisko : Robert Suwarski

 * Klasa : 3pp

 * Nr z dziennika : 17


 ****************************************/


public class Weryfikacja
{
    public static void main(String[] args)
    {

        System.out.println("***********************");
        System.out.println("EMAIL");
        System.out.println("***********************");
        testEmail();
        System.out.println("***********************");
        System.out.println("SPRAWDZANIE HASEL");
        System.out.println("***********************");
        testPassword();

    }

    /********************************************************
     * nazwa funkcji: testEmail
     * parametry wejściowe: email - zmienna przechowuje email
     * wartość zwracana: metoda testEmail zwraca wartość true lub false w zależności, czy adres
       email zawiera @ oraz domena email jest w grupie: com, pl, gov
     * autor: Robert Suwarski 3PP
     * ********************************************************/
    public static void testEmail(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj email: ");

            String email = scanner.nextLine();

        if (email.contains(".com") || email.contains(".pl") || email.contains(".gov"))
        {

            if (email.contains("@"))
            {
                System.out.println("TRUE");
            }
            else
            {
                System.out.println("FALSE");
            }
        }
        else
        {
            System.out.println("FALSE");
        }

    }

    /********************************************************
     * nazwa funkcji: testPassword
     * parametry wejściowe: haslo, haslo2 - obie zmienne zawierają hasło
     * wartość zwracana: metoda testPassword zwraca wartość true lub false w zależności, czy podane
       2 hasła są identyczne - true w innych przypadkach -> false
     * autor: Robert Suwarski 3PP
     * ********************************************************/
    public static void testPassword()
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj hasło: ");

            String haslo = scanner.nextLine();

        System.out.println("Podaj hasło: ");

            String haslo2 = scanner.nextLine();

        System.out.println("Hasła: ");

            if (haslo.equals(haslo2))
            {
                System.out.println("TRUE");
            }
            else
            {
                System.out.println("FALSE");
            }
    }

}

