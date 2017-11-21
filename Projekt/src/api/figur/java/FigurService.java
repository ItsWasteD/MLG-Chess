package api.figur.java;

import core.java.figuren.Figur;
import game.java.Field;

public class FigurService {

    private final FigurController figurController;

    public FigurService(FigurController figurController) {
        this.figurController = figurController;
    }

    private void moveFigur(Figur figur, Field field) {

        figurController.movefigur(figur, field);
    }

    private void deleteFigur(Figur figur) {
        figur.kill();
    }

}
