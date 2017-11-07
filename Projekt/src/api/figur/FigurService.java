package api.figur;

import core.figuren.Figur;

public class FigurService {

    private final FigurController figurController;

    public FigurService(FigurController figurController) {
        this.figurController = figurController;
    }

    private void moveFigur(Figur figur, int x, int y) {
        figurController.movefigur(figur, x, y);
    }

    private void deleteFigur(Figur figur) {


    }


}
