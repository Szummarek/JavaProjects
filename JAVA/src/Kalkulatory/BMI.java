package Kalkulatory;

public class BMI {
    public float obliczBMI(float wzrost, float waga) {

        float wynik;
        wynik = (float) (waga / Math.pow(wzrost / 100, 2));
        System.out.println(wynik);


        return wynik;

    }
}
