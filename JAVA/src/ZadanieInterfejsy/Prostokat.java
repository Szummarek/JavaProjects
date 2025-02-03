package ZadanieInterfejsy;

public class Prostokat implements ObiektGeometryczny{

    private double[] bokiFigury = {5,10,5,10};
    private boolean isKwadrat;
    private double poleFigury;
    private double obwodFigury;
    private String colorFigury = "red";

    public void isKwadrat() {
        if (bokiFigury[0] == bokiFigury[1] && bokiFigury[1] == bokiFigury[2] && bokiFigury[2] == bokiFigury[3]) {
            isKwadrat = true;
        } else {
            isKwadrat = false;
        }
    }

    @Override
    public void setPoleFigury() {
        poleFigury = bokiFigury[0] * bokiFigury[1];
    }

    @Override
    public double getPoleFigury() {
        return poleFigury;
    }

    @Override
    public void setObwodFigury() {
        obwodFigury = bokiFigury[0] + bokiFigury[1] + bokiFigury[2] + bokiFigury[3];
    }

    @Override
    public double getObwodFigury() {
        return obwodFigury;
    }

    @Override
    public String infoFigury() {
        if (isKwadrat == true) {
            return "To jest kwadrat";
        } else {
            return "To jest prostokąt";
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
