package api.figur;

import core.java.figuren.Figur;
import game.java.Field;

public class FigurController {

    public void movefigur(Figur figur, Field field) {
        figur.setPosition(field);
        field.setFigur(figur);
    }

    public void deleteFigur(Figur figur) {
        figur.kill();
        figur.getPosition().setFigur(null);
    }
}
