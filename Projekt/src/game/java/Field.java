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
        if (row < 8 && row >= 0 && column < 8 && column >= 0) {
            return Chessfield.getSingleField(this.ROW + row, this.COLUMN + column);
        }
        return null;
    }

    public Field getField(int y, int x) {
        return Chessfield.getSingleField(y, x);
    }

    public Figur getFigur() {
        return figur;
    }

    public void setFigur(Figur figur) {
        this.figur = figur;
        if (figur != null) {
            figur.setPosition(this);
        }
    }
}
