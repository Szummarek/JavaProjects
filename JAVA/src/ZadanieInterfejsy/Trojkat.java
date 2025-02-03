package ZadanieInterfejsy;

public class Trojkat implements ObiektGeometryczny{

    private double[] bokiFigury = {5,5,5};
    private boolean isTrojkatRownoboczny;
    private double poleFigury;
    private double obwodFigury;
    private double wysokoscFigury = 4;
    private String colorFigury = "red";

    public void isTrojkatRownoboczny() {
        if (bokiFigury[0] == bokiFigury[1] && bokiFigury[1] == bokiFigury[2]) {
            isTrojkatRownoboczny = true;
        } else {
            isTrojkatRownoboczny = false;
        }
    }

    @Override
    public void setPoleFigury() {

        poleFigury = (bokiFigury[0]*wysokoscFigury)/2;

    }

    @Override
    public double getPoleFigury() {
        return poleFigury;
    }

    @Override
    public void setObwodFigury() {
        obwodFigury = bokiFigury[0] + bokiFigury[1] + bokiFigury[2];
    }

    @Override
    public double getObwodFigury() {
        return obwodFigury;
    }

    @Override
    public String infoFigury() {
        if (isTrojkatRownoboczny == true) {
            return "To jest trójkąt równoboczny";
        } else {
            return "To jest trójkąt";
        }
    }

    @Override
    public void setfillFigury(String color) {
        colorFigury = color;
    }

    @Override
    public String getfillColor() {
        return colorFigury;
    }

}
