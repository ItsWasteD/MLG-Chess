package api.figur.test;

import api.figur.java.FigurController;
import core.java.figuren.Figur;
import game.java.Chessfield;
import game.java.Field;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FigurControllerTest {
    private FigurController figurController;
    private List<Field> possibleMoves;

    @Before
    public void setUp() {
        figurController = new FigurController();
        possibleMoves = new ArrayList<>();
        new Chessfield();
    }

    @Test
    public void movePawn() throws Exception {
        Figur figur = Chessfield.getSingleField(1, 0).getFigur();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(1));
        Assert.assertEquals(figur, Chessfield.getSingleField(3, 0).getFigur());
    }

    @Test
    public void moveRook() throws Exception {
        Figur figur = Chessfield.getSingleField(0, 0).getFigur();
        Chessfield.getSingleField(1, 0).getFigur().kill();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(2));
        Assert.assertEquals(figur, Chessfield.getSingleField(3, 0).getFigur());
    }

    @Test
    public void moveKnight() throws Exception {
        Figur figur = Chessfield.getSingleField(0, 1).getFigur();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(1));
        Assert.assertEquals(figur, Chessfield.getSingleField(2, 0).getFigur());
    }

    @Test
    public void moveBishop() throws Exception {
        Figur figur = Chessfield.getSingleField(0, 2).getFigur();
        Chessfield.getSingleField(1, 1).getFigur().kill();
        Chessfield.getSingleField(1, 3).getFigur().kill();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(5));
        Assert.assertEquals(figur, Chessfield.getSingleField(1, 1).getFigur());
    }

    @Test
    public void moveQueen() throws Exception {
        Figur figur = Chessfield.getSingleField(0, 3).getFigur();
        Chessfield.getSingleField(1, 2).getFigur().kill();
        Chessfield.getSingleField(1, 3).getFigur().kill();
        Chessfield.getSingleField(1, 4).getFigur().kill();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(5));
        Assert.assertEquals(figur, Chessfield.getSingleField(6, 3).getFigur());
    }

    @Test
    public void moveKing() throws Exception {
        Figur figur = Chessfield.getSingleField(0, 4).getFigur();
        Chessfield.getSingleField(1, 3).getFigur().kill();
        Chessfield.getSingleField(1, 4).getFigur().kill();
        Chessfield.getSingleField(1, 5).getFigur().kill();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(0));
        Assert.assertEquals(figur, Chessfield.getSingleField(1, 4).getFigur());
    }
}