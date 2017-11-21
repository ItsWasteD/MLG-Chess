package core.test.figuren;

import core.java.figuren.Pawn;
import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KingTest {

    @Before
    public void setUp() {
        new Chessfield();
    }

    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(0, Chessfield.getSingleField(0, 4).getFigur().getPossibleMoves().size());
    }

    @Test
    public void testGetPossibleMovesDiagonal() {
        Chessfield.getSingleField(1,3).getFigur().kill();
        Chessfield.getSingleField(1,5).getFigur().kill();

        Assert.assertEquals(2, Chessfield.getSingleField(0, 4).getFigur().getPossibleMoves().size());
    }

    @Test
    public void testGetPossibleMovesStraigthLineWithEnemys() {
        Chessfield.getSingleField(1, 4).setFigur(new Pawn(true));

        Assert.assertEquals(1, Chessfield.getSingleField(0, 4).getFigur().getPossibleMoves().size());
    }
}