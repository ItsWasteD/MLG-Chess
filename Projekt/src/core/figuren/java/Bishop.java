package core.figuren.java;

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
public class Bishop extends Figur {

    /**
     * This is the default constructor of the {@link Bishop}.
     *
     * @param isWhite a <tt>boolean</tt> to see if the {@link Figur} is white or not.
     *
     * @see Figur#isWhite
     */
    public Bishop(boolean isWhite) {
        super(isWhite);

        possibleMoves = new ArrayList<>();
    }

    /**
     * This method calculates the possible moves for the specific {@link Figur} in this case
     * the {@link Bishop}.
     *
     * @return a {@link java.util.List} of {@link Field}'s possible to move to.
     */
    @Override
    public ArrayList<Field> getPossibleMoves() {
        int row = super.getPosition().ROW;
        int column = super.getPosition().COLUMN;
        possibleMoves.clear();
        //all possible moves in the down positive diagonal
        for (int j = column + 1, i = row + 1; j < Chessfield.SIZE && i < Chessfield.SIZE; j++, i++) {
            Field field = super.getPosition().getField(i, j);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        //all possible moves in the up positive diagonal
        for (int j = column - 1, i = row + 1; j > -1 && i < Chessfield.SIZE; j--, i++) {
            Field field = super.getPosition().getField(i, j);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        //all possible moves in the up negative diagonal
        for (int j = column - 1, i = row - 1; j > -1 && i > -1; j--, i--) {
            Field field = super.getPosition().getField(i, j);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        //all possible moves in the down negative diagonal
        for (int j = column + 1, i = row - 1; j < Chessfield.SIZE && i > -1; j++, i--) {
            Field field = super.getPosition().getField(i, j);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        return possibleMoves;

    }
}
