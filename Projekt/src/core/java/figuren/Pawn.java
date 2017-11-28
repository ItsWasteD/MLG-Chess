package core.java.figuren;

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
public class Pawn extends Figur {

    /**
     * This is the default constructor of the {@link Pawn}.
     *
     * @param isWhite a <tt>boolean</tt> to see if the {@link Figur} is white or not.
     *
     * @see Figur#isWhite
     */
    public Pawn(boolean isWhite) {
        super(isWhite);
        possibleMoves = new ArrayList<>();
    }

    /**
     * This method calculates the possible moves for the specific {@link Figur} in this case
     * the {@link Pawn}.
     *
     * @return a {@link java.util.List} of {@link Field}'s possible to move to.
     */
    @Override
    public ArrayList<Field> getPossibleMoves() {
        possibleMoves.clear();
        boolean isWhite = super.isWhite();
        int dx = isWhite ? -1 : 1;

        Field fieldAhead = super.getPosition().getNeightbour(dx, 0);
        if (fieldAhead.getFigur() == null) {
            possibleMoves.add(fieldAhead);
            if (super.getPosition().ROW == 6 && isWhite) {
                Field aheadsecond = super.getPosition().getNeightbour(dx - 1, 0);
                if (aheadsecond.getFigur() == null) {
                    possibleMoves.add(aheadsecond);
                }
            } else if (super.getPosition().ROW == 1 && !isWhite) {
                Field aheadsecond = super.getPosition().getNeightbour(dx + 1, 0);
                if (aheadsecond.getFigur() == null) {
                    possibleMoves.add(aheadsecond);
                }
            }
        }
        Field fieldAheadLeft = super.getPosition().getNeightbour(dx, -1);
        if (fieldAheadLeft != null && fieldAheadLeft.getFigur() != null && isOpponent(fieldAheadLeft.getFigur())) {
            possibleMoves.add(fieldAheadLeft);
        }
        Field fieldAheadRight = super.getPosition().getNeightbour(dx, 1);
        if (fieldAheadRight != null && fieldAheadRight.getFigur() != null && isOpponent(fieldAheadRight.getFigur())) {
            possibleMoves.add(fieldAheadRight);
        }
        return possibleMoves;
    }
}
