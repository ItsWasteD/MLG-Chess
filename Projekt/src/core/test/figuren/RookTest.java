package core.test.figuren;

import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RookTest {

    @Before
    public void setUp() {
        Chessfield chessfield = new Chessfield();
    }

    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(0, Chessfield.getSingleField(0, 0).getFigur().getPossibleMoves().size());
    }

}