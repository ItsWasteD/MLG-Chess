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
        // TODO
    }

    @Test
    public void moveBishop() throws Exception {
        // TODO
    }

    @Test
    public void moveQueen() throws Exception {
        // TODO
    }

    @Test
    public void moveKing() throws Exception {
        // TODO
    }

    @Test
    public void deleteFigur() throws Exception {
    }

}