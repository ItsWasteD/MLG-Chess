package core.figuren.test;

import core.figuren.java.Pawn;
import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a JUnit test for the {@link Pawn} class.
 *
 * @see org.junit.runners.JUnit4
 * @see Pawn
 *
 * @author Yanis Weibel
 * @version 1.0
 */
public class PawnTest {

    /**
     * This setup method creates a new {@link Chessfield}.
     */
    @Before
    public void setUp() {
        new Chessfield();
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Pawn}.
     */
    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(2, Chessfield.getSingleField(1, 1).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Pawn} with opponent in front.
     */
    @Test
    public void testGetPossibleMovesWithOpponent() {
        Chessfield.getSingleField(2, 2).setFigur(new Pawn(true));
        Assert.assertEquals(3, Chessfield.getSingleField(1, 1).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Pawn} if many opponents are in the front.
     */
    @Test
    public void testGetPossibleMovesWithManyOpponent() {
        Chessfield.getSingleField(2, 2).setFigur(new Pawn(true));
        Chessfield.getSingleField(2, 1).setFigur(new Pawn(true));
        Chessfield.getSingleField(2, 0).setFigur(new Pawn(true));
        Assert.assertEquals(2, Chessfield.getSingleField(1, 1).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Pawn} if an enemy is in the front.
     */
    @Test
    public void testGetPossibleMovesWithOpponentAhead() {
        Chessfield.getSingleField(2, 1).setFigur(new Pawn(true));
        Assert.assertEquals(0, Chessfield.getSingleField(1, 1).getFigur().getPossibleMoves().size());
    }
}