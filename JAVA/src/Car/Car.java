package Car;

public abstract class Car {

    private int calaDroga;
    private int pojemnoscBakuPaliwa;
    private int pozostalePaliwo;
    private int spalanie;


    /********************************************************
     * nazwa funkcji: Car
     * parametry wejściowe: spalanie, pojemność baku
     * wartość zwracana: contructor dla zmiennych spalanie i pojemnoscBakuPaliwa
     * autor: Robert Suwarski
     * ********************************************************/
    public Car(int spalanie, int pojemnoscBakuPaliwa) {
        this.spalanie = spalanie;
        this.pojemnoscBakuPaliwa = pojemnoscBakuPaliwa;
    }


    /********************************************************
     * nazwa funkcji: JedzKM
     * parametry wejściowe: podanaDroga - zmienna przechowuje podaną drogę
     * wartość zwracana: dodaje do całej drogi, drogę podaną przez użytkownika
     * autor: Robert Suwarski
     * ********************************************************/
    public void JedzKM(double podanaDroga) {

        calaDroga += podanaDroga;
        pozostalePaliwo = (int) (pozostalePaliwo/(podanaDroga*spalanie));


    }


    /********************************************************
     * nazwa funkcji: Tankuj
     * parametry wejściowe: ilePaliwa - zmienna przechowuje ile paliwa tankujemy
     * wartość zwracana: dodaje paliwo do zmiennej pozostalePaliwo
     * autor: Robert Suwarski
     * ********************************************************/
    public void Tankuj(int ilePaliwa) {

        if (pojemnoscBakuPaliwa < pozostalePaliwo+ilePaliwa) {

            pozostalePaliwo += (pozostalePaliwo-ilePaliwa);

        } else {

            pozostalePaliwo += ilePaliwa;

        }

    }


    /********************************************************
     * nazwa funkcji: getCalaDroga
     * parametry wejściowe: -
     * wartość zwracana: zwraca przejechaną drogę
     * autor: Robert Suwarski
     * ********************************************************/
    public float getCalaDroga() {
        return calaDroga;
    }


    /********************************************************
     * nazwa funkcji: getPozostalePaliwo
     * parametry wejściowe: -
     * wartość zwracana: zwraca pozostalePaliwo w samochodzie
     * autor: Robert Suwarski
     * ********************************************************/
    public int getPozostalePaliwo() {
        return pozostalePaliwo;
    }
}
