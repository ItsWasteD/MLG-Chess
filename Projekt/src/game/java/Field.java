package game.java;

import core.java.figuren.Figur;

/**
 * This class represents a {@link Field} it is used by the {@link Chessfield}.
 * It contain a function to get the neighbour of each {@link Field}.
 *
 * @see Chessfield
 *
 * @author David Roth
 * @version 1.0
 */
public class Field {

    public final int ROW;
    public final int COLUMN;
    private Figur figur;

    public Field(int column, int row) {
        ROW = row;
        COLUMN = column;
        setFigur(null);
    }

    /**
     * This method is used to get the neighbor of the {@link Field}.
     *
     * @param row a row of the {@link Chessfield}.
     * @param column a column of the {@link Chessfield}.
     * @return a {@link Field}.
     */
    public Field getNeightbour(int row, int column) {
        if (this.ROW + row < 8 && this.ROW + row >= 0 && this.COLUMN + column < 8 && this.COLUMN + column >= 0) {
            return Chessfield.getSingleField(this.ROW + row, this.COLUMN + column);
        }
        return null;
    }

    /***************************GETTER & SETTER***************************************/

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
