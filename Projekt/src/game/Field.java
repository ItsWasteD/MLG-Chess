package game;

import core.figuren.Figur;

public class Field {

    public final int ROW;
    public final int COLUMN;
    private Figur figur;

    public Field(int row, int column) {
        ROW = row;
        COLUMN = column;
    }

    public Field getNeightbour(int x, int y) {

        return null;
    }

    public Figur getFigur() {
        return figur;
    }

    public void setFigur(Figur figur) {
        this.figur = figur;
    }
}
