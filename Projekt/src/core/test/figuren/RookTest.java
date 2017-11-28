package core.test.figuren;

import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a JUnit test for the {@link core.java.figuren.Bishop} class.
 *
 * @see org.junit.runners.JUnit4
 * @see core.java.figuren.Bishop
 *
 * @author Yanis Weibel
 * @version 1.0
 */
public class RookTest {

    /**
     * This setup method creates a new {@link Chessfield}.
     */
    @Before
    public void setUp() {
        new Chessfield();
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link core.java.figuren.Bishop}.
     */
    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(0, Chessfield.getSingleField(0, 0).getFigur().getPossibleMoves().size());
    }

    /**
     * This method tests, if the Figur#getPossibleMoves function returns the correct number
     * of moves for {@link core.java.figuren.Bishop} if an enemy is in the front.
     */
    @Test
    public void testGetPossibleMovesStraigthLine() {
        Chessfield.getSingleField(1, 0).setFigur(null);
        Assert.assertEquals(6, Chessfield.getSingleField(0, 0).getFigur().getPossibleMoves().size());
    }

}