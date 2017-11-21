package game.java;

import core.java.figuren.Figur;

public class
Field {

    public final int ROW;
    public final int COLUMN;
    private Figur figur;

    public Field(int column, int row) {
        ROW = row;
        COLUMN = column;
        setFigur(null);
    }

    public Field getNeightbour(int row, int column) {
        return Chessfield.getSingleField(this.ROW + row, this.COLUMN + column);
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
}
