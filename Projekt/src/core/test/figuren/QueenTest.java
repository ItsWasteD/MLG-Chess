package core.test.figuren;

import core.java.figuren.Pawn;
import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueenTest {

    @Before
    public void setUp() {
        new Chessfield();
    }

    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(0, Chessfield.getSingleField(0, 3).getFigur().getPossibleMoves().size());
    }

    @Test
    public void testGetPossibleMovesStraigthLine() {
        Chessfield.getSingleField(1, 3).setFigur(null);
        Assert.assertEquals(6, Chessfield.getSingleField(0, 3).getFigur().getPossibleMoves().size());
    }

    @Test
    public void testGetPossibleMovesDiagonal() {
        Chessfield.getSingleField(1, 2).getFigur().kill();
        Chessfield.getSingleField(1, 4).getFigur().kill();
        Assert.assertEquals(7, Chessfield.getSingleField(0, 3).getFigur().getPossibleMoves().size());
    }

    @Test
    public void testGetPossibleMovesStraigthLineWithEnemys() {
        Chessfield.getSingleField(1, 3).getFigur().kill();
        Chessfield.getSingleField(4, 3).setFigur(new Pawn(true));
        Assert.assertEquals(4, Chessfield.getSingleField(0, 3).getFigur().getPossibleMoves().size());
    }

}