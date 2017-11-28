package api.figur.java;

import core.java.figuren.Figur;
import game.java.Chessfield;
import game.java.Field;

public class FigurController {

    public void movefigur(Figur figur, Field field) {
        Chessfield.getSingleField(field.ROW, field.COLUMN).setFigur(figur);
    }
}
