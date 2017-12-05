package core.figuren.java;

import game.java.Field;

import java.util.ArrayList;


/**
 * This class is an abstract base class for every Chessfigur.
 * It contain a method to get all possible moves of a {@link Figur}.
 *
 * @see #getPossibleMoves()
 *
 * @author Yanis Weibel
 * @version 1.0
 */
public abstract class Figur {

    private boolean isWhite;
    private boolean isDead;
    private Field position;
    private boolean opponent;
    public ArrayList<Field> possibleMoves;


    /**
     * This is the default constructor for the abstract class {@link Figur}.
     *
     * @param isWhite a <tt>boolean</tt> to see if the {@link Figur} is white or not.
     */
    public Figur(boolean isWhite) {
        this.isWhite = isWhite;
        this.isDead = false;
    }

    /**
     * This method calculates the possible moves for the specific {@link Figur}.
     *
     * @return a {@link java.util.List} of {@link Field}'s possible to move to.
     */
    public abstract ArrayList<Field> getPossibleMoves();

    public boolean isWhite() {
        return isWhite;
    }

    public boolean isDead() {
        return isDead;
    }

    /**
     * This method kills the Figur and removes it from the {@link game.java.Chessfield}.
     */
    public void kill() {
        isDead = true;
        position.setFigur(null);
    }

    public Field getPosition() {
        return position;
    }

    public void setPosition(Field position) {
        this.position = position;
    }

    public boolean isOpponent(Figur figur) {
        return figur.isWhite != this.isWhite;
    }
}
