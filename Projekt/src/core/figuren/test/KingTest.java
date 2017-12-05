package core.figuren.test;

import core.figuren.java.King;
import core.figuren.java.Pawn;
import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a JUnit test for the {@link King} class.
 *
 * @see org.junit.runners.JUnit4
 * @see King
 *
 * @author Yanis Weibel
 * @version 1.0
 */
public class KingTest {

    /**
     * This setup method creates a new {@link Chessfield}.
     */
    @Before
    public void setUp() {
        new Chessfield();
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link King}.
     */
    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(0, Chessfield.getSingleField(0, 4).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link King} when moving diagonal.
     */
    @Test
    public void testGetPossibleMovesDiagonal() {
        Chessfield.getSingleField(1,3).getFigur().kill();
        Chessfield.getSingleField(1,5).getFigur().kill();

        Assert.assertEquals(2, Chessfield.getSingleField(0, 4).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link King} if an enemy is in the front.
     */
    @Test
    public void testGetPossibleMovesStraigthLineWithEnemys() {
        Chessfield.getSingleField(1, 4).setFigur(new Pawn(true));

        Assert.assertEquals(1, Chessfield.getSingleField(0, 4).getFigur().getPossibleMoves().size());
    }
}