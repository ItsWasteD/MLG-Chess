package core.test.figuren;

import core.java.figuren.Pawn;
import game.java.Chessfield;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PawnTest {

    @Before
    public void setUp() {
        new Chessfield();
    }

    @Test
    public void testGetPossibleMoves() {
        Assert.assertEquals(2, Chessfield.getSingleField(1, 1).getFigur().getPossibleMoves().size());
    }

    @Test
    public void testGetPossibleMovesWithOpponent() {
        Chessfield.getSingleField(2, 2).setFigur(new Pawn(true));
        Assert.assertEquals(3, Chessfield.getSingleField(1, 1).getFigur().getPossibleMoves().size());
    }

    @Test
    public void testGetPossibleMovesWithManyOpponent() {
        Chessfield.getSingleField(2, 2).setFigur(new Pawn(true));
        Chessfield.getSingleField(2, 1).setFigur(new Pawn(true));
        Chessfield.getSingleField(2, 0).setFigur(new Pawn(true));
        Assert.assertEquals(2, Chessfield.getSingleField(1, 1).getFigur().getPossibleMoves().size());
    }

    @Test
    public void testGetPossibleMovesWithOpponentAhead() {
        Chessfield.getSingleField(2, 1).setFigur(new Pawn(true));
        Assert.assertEquals(0, Chessfield.getSingleField(1, 1).getFigur().getPossibleMoves().size());
    }
}