package game.test;


import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a JUnit test for the {@link game.java.Field} class.
 *
 * @see org.junit.runners.JUnit4
 * @see game.java.Field
 *
 * @author Yanis Weibel
 * @version 1.0
 */
public class FieldTest {

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
     * This method checks if the #getChessfield() function returns <tt>null</tt>.
     *
     * @see Chessfield#getChessfield()
     */
    @Test
    public void getNeightbour_NOTNULL() {
        Assert.assertNotNull(Chessfield.getChessfield());
    }

}