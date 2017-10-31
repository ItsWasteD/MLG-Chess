package game;

import core.figuren.Figur;

public class Feld {

    private String farbe;
    private int x;
    private int y;
    private Figur f;

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Figur getF() {
        return f;
    }

    public void setF(Figur f) {
        this.f = f;
    }
}
