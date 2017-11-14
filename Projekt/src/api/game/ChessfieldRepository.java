package api.game;

import game.java.Field;


public class ChessfieldRepository {

    private Field[][] chessfield;

    public Field[][] getChessfield() {
        return chessfield;
    }

    public void setChessfield(Field[][] chessfield) {
        this.chessfield = chessfield;
    }
}
