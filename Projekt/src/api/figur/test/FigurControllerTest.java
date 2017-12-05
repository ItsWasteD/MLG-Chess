package api.figur.test;

import api.figur.java.FigurController;
import core.figuren.java.*;
import game.java.Chessfield;
import game.java.Field;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a JUnit test for the {@link FigurController} class.
 *
 * @see org.junit.runners.JUnit4
 *
 * @author Yanis Weibel
 * @version 1.0
 */

public class FigurControllerTest {

    private FigurController figurController;
    private List<Field> possibleMoves;

    /**
     * This method creates a new instance of the {@link api.figur.java.FigurController},
     * a new {@link ArrayList} of {@link Field}'s and a {@link Chessfield}.
     */
    @Before
    public void setUp() {
        figurController = new FigurController();
        possibleMoves = new ArrayList<>();
        new Chessfield();
    }

    /**
     * This test method checks if the {@link Pawn} moves correctly.
     */
    @Test
    public void movePawn() {
        Figur figur = Chessfield.getSingleField(1, 0).getFigur();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(1));
        Assert.assertEquals(figur, Chessfield.getSingleField(3, 0).getFigur());
    }

    /**
     * This test method checks if the {@link Rook} moves correctly.
     */
    @Test
    public void moveRook() {
        Figur figur = Chessfield.getSingleField(0, 0).getFigur();
        Chessfield.getSingleField(1, 0).getFigur().kill();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(2));
        Assert.assertEquals(figur, Chessfield.getSingleField(3, 0).getFigur());
    }

    /**
     * This test method checks if the {@link Knight} moves correctly.
     */
    @Test
    public void moveKnight() {
        Figur figur = Chessfield.getSingleField(0, 1).getFigur();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(1));
        Assert.assertEquals(figur, Chessfield.getSingleField(2, 0).getFigur());
    }

    /**
     * This test method checks if the {@link Bishop} moves correctly.
     */
    @Test
    public void moveBishop() {
        Figur figur = Chessfield.getSingleField(0, 2).getFigur();
        Chessfield.getSingleField(1, 1).getFigur().kill();
        Chessfield.getSingleField(1, 3).getFigur().kill();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(5));
        Assert.assertEquals(figur, Chessfield.getSingleField(1, 1).getFigur());
    }

    /**
     * This test method checks if the {@link Queen} moves correctly.
     */
    @Test
    public void moveQueen() {
        Figur figur = Chessfield.getSingleField(0, 3).getFigur();
        Chessfield.getSingleField(1, 2).getFigur().kill();
        Chessfield.getSingleField(1, 3).getFigur().kill();
        Chessfield.getSingleField(1, 4).getFigur().kill();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(5));
        Assert.assertEquals(figur, Chessfield.getSingleField(6, 3).getFigur());
    }

    /**
     * This test method checks if the {@link King} moves correctly.
     */
    @Test
    public void moveKing() {
        Figur figur = Chessfield.getSingleField(0, 4).getFigur();
        Chessfield.getSingleField(1, 3).getFigur().kill();
        Chessfield.getSingleField(1, 4).getFigur().kill();
        Chessfield.getSingleField(1, 5).getFigur().kill();
        possibleMoves = figur.getPossibleMoves();
        figurController.movefigur(figur, possibleMoves.get(0));
        Assert.assertEquals(figur, Chessfield.getSingleField(1, 4).getFigur());
    }
}