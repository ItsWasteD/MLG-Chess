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
public class Knight extends Figur {

    /**
     * This is the default constructor of the {@link Knight}.
     *
     * @param isWhite a <tt>boolean</tt> to see if the {@link Figur} is white or not.
     *
     * @see Figur#isWhite
     */
    public Knight(boolean isWhite) {
        super(isWhite);

        possibleMoves = new ArrayList<>();
    }

    /**
     * This method calculates the possible moves for the specific {@link Figur} in this case
     * the {@link Knight}.
     *
     * @return a {@link java.util.List} of {@link Field}'s possible to move to.
     */
    @Override
    public ArrayList<Field> getPossibleMoves() {
        possibleMoves.clear();
        int[][] offsets = {
                {-2, 1},
                {-1, 2},
                {1, 2},
                {2, 1},
                {2, -1},
                {1, -2},
                {-1, -2},
                {-2, -1}
        };
        for (int[] o : offsets) {
            Field field = super.getPosition().getNeightbour(o[0], o[1]);
            if (field != null && (field.getFigur() == null || isOpponent(field.getFigur()))) {
                possibleMoves.add(field);
            }
        }
        return possibleMoves;
    }
}