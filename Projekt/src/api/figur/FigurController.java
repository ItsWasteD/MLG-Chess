package api.figur;

import core.figuren.Figur;
import game.Field;

public class FigurController {

    public void movefigur(Figur figur, Field field) {
        figur.setPosition(field);
        field.setFigur(figur);
    }

    public void deleteFigur(Figur figur) {

    }
}
