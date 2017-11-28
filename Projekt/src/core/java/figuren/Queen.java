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
public class Queen extends Figur {

    /**
     * This is the default constructor of the {@link Queen}.
     *
     * @param isWhite a <tt>boolean</tt> to see if the {@link Figur} is white or not.
     *
     * @see Figur#isWhite
     */
    public Queen(boolean isWhite) {
        super(isWhite);

        possibleMoves = new ArrayList<>();
    }

    /**
     * This method calculates the possible moves for the specific {@link Figur} in this case
     * the {@link Queen}.
     *
     * @return a {@link java.util.List} of {@link Field}'s possible to move to.
     */
    @Override
    public ArrayList<Field> getPossibleMoves() {
        possibleMoves.clear();
        Figur[] figures = {
                new Rook(isWhite()),
                new Bishop(isWhite())
        };
        for (Figur figur : figures) {
            figur.setPosition(getPosition());
            possibleMoves.addAll(figur.getPossibleMoves());
        }
        return possibleMoves;
    }
}
