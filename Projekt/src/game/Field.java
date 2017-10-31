package game;

import core.figuren.Figur;

public class Field {

    private String color;
    private Figur figur;

    public Field(Figur figur, String color) {
        this.figur = figur;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Figur getFigur() {
        return figur;
    }

    public void setFigur(Figur figur) {
        this.figur = figur;
    }
}
