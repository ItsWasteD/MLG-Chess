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
        if (this.ROW + row < 8 && this.ROW + row >= 0 && this.COLUMN + column < 8 && this.COLUMN + column >= 0) {
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
