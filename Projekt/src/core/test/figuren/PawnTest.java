package core.test.figuren;

import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PawnTest {

    @Before
    public void setUp() {
        Chessfield chessfield = new Chessfield();
    }

    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(2, Chessfield.getSingleField(1, 1).getFigur().getPossibleMoves().size());
    }
}