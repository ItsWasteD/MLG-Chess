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
    public void movefigur() throws Exception {
        Figur figur = Chessfield.getSingleField(1, 0).getFigur();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(0));
        Assert.assertEquals(Chessfield.getSingleField(3, 0).getFigur(), figur);

    }

    @Test
    public void deleteFigur() throws Exception {
    }

}