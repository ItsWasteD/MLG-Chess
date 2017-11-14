package game.java;

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
        return Chessfield.getSingleField(this.COLUMN + x, this.ROW + y);
    }

    public Field getField(int x, int y) {
        return Chessfield.getSingleField(x, y);
    }

    public Figur getFigur() {
        return figur;
    }

    public void setFigur(Figur figur) {
        this.figur = figur;
    }

    public int getROW() {
        return ROW;
    }

    public int getCOLUMN() {
        return COLUMN;
    }
}
