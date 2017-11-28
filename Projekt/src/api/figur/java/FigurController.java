package api.figur.java;

import core.java.figuren.Figur;
import game.java.Chessfield;
import game.java.Field;

/**
 * This class controls everything of the {@link Figur}. It contains a method to
 * move the Figur to a different field({@link #movefigur(Figur, Field)}) and a
 * method to delete a {@link Figur}
 *
 * @see #movefigur(Figur, Field)
 * @see #deleteFigur(Figur)
 * @see Figur
 * @see Chessfield
 *
 * @author Yanis Weibel
 * @version 1.0
 */

public class FigurController {

    /**
     * This method moves a figur to a different field.
     *
     * @param figur a {@link Figur} to be moved.
     * @param field new {@link Field} for the figur.
     *
     * @see Chessfield
     */
    public void movefigur(Figur figur, Field field) {
        Chessfield.getSingleField(field.ROW, field.COLUMN).setFigur(figur);
    }

    /**
     * This method deletes a {@link Figur}. It removes it from the field
     * and kill's it.
     *
     * @param figur a {@link Figur} to be deleted.
     */
    public void deleteFigur(Figur figur) {
        figur.kill();
        figur.getPosition().setFigur(null);
    }
}
