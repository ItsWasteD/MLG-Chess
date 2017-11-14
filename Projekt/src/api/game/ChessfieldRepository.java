package api.game;

import game.Field;


public class ChessfieldRepository {

    private Field[][] chessfield;

    public Field[][] getChessfield() {
        return chessfield;
    }

    public void setChessfield(Field[][] chessfield) {
        this.chessfield = chessfield;
    }
}
