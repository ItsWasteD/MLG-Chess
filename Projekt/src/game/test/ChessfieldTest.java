package game.test;

import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a JUnit test for the {@link game.java.Chessfield} class.
 *
 * @see org.junit.runners.JUnit4
 * @see game.java.Chessfield
 *
 * @author Yanis Weibel
 * @version 1.0
 */
public class ChessfieldTest {

    /**
     * Creates a new {@link Chessfield}.
     *
     * @see Chessfield
     */
    @Before
    public void setUp() {
        Chessfield chessfield = new Chessfield();
    }

    /**
     *  This method checks if the #getChessfield() method works.
     *
     *  @see Chessfield#getChessfield()
     */
    @Test
    public void getSingleField() {
        Assert.assertEquals(Chessfield.getChessfield()[0][0], Chessfield.getSingleField(0, 0));
    }

}