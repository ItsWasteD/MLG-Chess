package core.test.figuren;

import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RookTest {

    @Before
    public void setUp() {
        new Chessfield();
    }

    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(0, Chessfield.getSingleField(0, 0).getFigur().getPossibleMoves().size());
    }

    @Test
    public void testGetPossibleMovesStraigthLine() {
        Chessfield.getSingleField(1, 0).setFigur(null);
        Assert.assertEquals(6, Chessfield.getSingleField(0, 0).getFigur().getPossibleMoves().size());
    }

}