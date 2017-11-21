package api.figur.java;

import core.java.figuren.Figur;
import game.java.Chessfield;
import game.java.Field;

public class FigurController {

    public void movefigur(Figur figur, Field field) {
        field.setFigur(null);
        figur.setPosition(null);
        Chessfield.getSingleField(field.ROW, field.COLUMN).setFigur(figur);
    }

    public void deleteFigur(Figur figur) {
        figur.kill();
        figur.getPosition().setFigur(null);
    }
}
