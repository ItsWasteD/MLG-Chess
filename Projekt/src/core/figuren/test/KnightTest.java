package core.figuren.test;

import core.figuren.java.Knight;
import core.figuren.java.Pawn;
import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a JUnit test for the {@link Knight} class.
 *
 * @see org.junit.runners.JUnit4
 * @see Knight
 *
 * @author Yanis Weibel
 * @version 1.0
 */
public class KnightTest {

    /**
     * This setup method creates a new {@link Chessfield}.
     */
    @Before
    public void setUp() {
        new Chessfield();
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Knight}.
     */
    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(2, Chessfield.getSingleField(0, 1).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Knight} when moving diagonal.
     */
    @Test
    public void testGetPossibleMovesWithOpponent() {
        Chessfield.getSingleField(2, 2).setFigur(new Pawn(true));
        Assert.assertEquals(2, Chessfield.getSingleField(0, 1).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Knight} if an enemy is in the front.
     */
    @Test
    public void testGetPossibleMovesWithManyOpponent() {
        Chessfield.getSingleField(2, 2).setFigur(new Pawn(true));
        Chessfield.getSingleField(0, 2).setFigur(new Pawn(true));
        Assert.assertEquals(2, Chessfield.getSingleField(0, 1).getFigur().getPossibleMoves().size());
    }
}