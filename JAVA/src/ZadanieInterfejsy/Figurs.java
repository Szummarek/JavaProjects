package ZadanieInterfejsy;

public class Figurs {

    public static void main(String[] args) {
        Trojkat trojkat = new Trojkat();
        trojkat.setPoleFigury();
        trojkat.setObwodFigury();
        trojkat.setfillFigury("blue");
        trojkat.isTrojkatRownoboczny();

        System.out.println("Figura: " + trojkat.infoFigury());
        System.out.println("Pole trójkąta: "+trojkat.getPoleFigury());
        System.out.println("Obwód trójkąta: "+trojkat.getObwodFigury());
        System.out.println("Kolor: "+trojkat.getfillColor());


        System.out.println("============================");


        Prostokat prostokat = new Prostokat();
        prostokat.setPoleFigury();
        prostokat.setObwodFigury();
        prostokat.setfillFigury("yellow");
        prostokat.isKwadrat();

        System.out.println("Figura: " + prostokat.infoFigury());
        System.out.println("Pole prostokąta: "+prostokat.getPoleFigury());
        System.out.println("Obwód prostokąta: "+prostokat.getObwodFigury());
        System.out.println("Kolor: "+prostokat.getfillColor());
    }

}
