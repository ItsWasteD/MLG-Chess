package api.game;

import game.java.Chessfield;
import game.java.Field;

public class GameController {

    public GameController() {



    }

    public boolean startGame() {
        Chessfield cf = new Chessfield();
        Field[][] chessfield = Chessfield.getChessfield();

        return true;
    }



}
