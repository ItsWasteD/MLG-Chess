package core.java.figuren;

import game.java.Chessfield;
import game.java.Field;

import java.util.ArrayList;

/**
 * This class is a subclass of {@link Figur} and contains functions for the chess game.
 *
 * @see #getPossibleMoves()
 *
 * @author Yanis Weibel
 * @version 1.0
 */
public class Rook extends Figur {

    /**
     * This is the default constructor of the {@link Rook}.
     *
     * @param isWhite a <tt>boolean</tt> to see if the {@link Figur} is white or not.
     *
     * @see Figur#isWhite
     */
    public Rook(boolean isWhite) {
        super(isWhite);
        possibleMoves = new ArrayList<>();
    }

    /**
     * This method calculates the possible moves for the specific {@link Figur} in this case
     * the {@link Rook}.
     *
     * @return a {@link java.util.List} of {@link Field}'s possible to move to.
     */
    @Override
    public ArrayList<Field> getPossibleMoves() {
        int row = super.getPosition().ROW;
        int column = super.getPosition().COLUMN;
        possibleMoves.clear();
        //all possible moves in the up
        for (int i = row + 1; i < Chessfield.SIZE; i++) {
            Field field = super.getPosition().getField(i, column);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else if (field.getFigur() != null) {
                break;
            }
        }
        //all possible moves in the down
        for (int i = row - 1; i > -1; i--) {
            Field field = super.getPosition().getField(i, column);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else if (field.getFigur() != null) {
                break;
            }
        }
        //all possible moves to the right
        for (int i = column + 1; i < Chessfield.SIZE; i++) {
            Field field = super.getPosition().getField(row, i);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else if (field.getFigur() != null) {
                break;
            }
        }
        //all possible moves to the left
        for (int i = column - 1; i > -1; i--) {
            Field field = super.getPosition().getField(row, i);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else if (field.getFigur() != null) {
                break;
            }
        }
        return possibleMoves;
    }
}
