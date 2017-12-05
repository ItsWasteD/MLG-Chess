package core.figuren.test;

import core.figuren.java.Pawn;
import core.figuren.java.Queen;
import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a JUnit test for the {@link Queen} class.
 *
 * @see org.junit.runners.JUnit4
 * @see Queen
 *
 * @author Yanis Weibel
 * @version 1.0
 */
public class QueenTest {

    /**
     * This setup method creates a new {@link Chessfield}.
     */
    @Before
    public void setUp() {
        new Chessfield();
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Queen}.
     */
    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(0, Chessfield.getSingleField(0, 3).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Queen}.
     */
    @Test
    public void testGetPossibleMovesStraigthLine() {
        Chessfield.getSingleField(1, 3).getFigur().kill();
        Assert.assertEquals(6, Chessfield.getSingleField(0, 3).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Queen} when moving diagonal.
     */
    @Test
    public void testGetPossibleMovesDiagonal() {
        Chessfield.getSingleField(1, 2).getFigur().kill();
        Chessfield.getSingleField(1, 4).getFigur().kill();
        Assert.assertEquals(7, Chessfield.getSingleField(0, 3).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link Queen} if an enemy is in the front.
     */
    @Test
    public void testGetPossibleMovesStraigthLineWithEnemys() {
        Chessfield.getSingleField(1, 3).getFigur().kill();
        Chessfield.getSingleField(4, 3).setFigur(new Pawn(true));
        Assert.assertEquals(4, Chessfield.getSingleField(0, 3).getFigur().getPossibleMoves().size());
    }

}