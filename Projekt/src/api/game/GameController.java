package api.game;

import game.Chessfield;
import game.Field;

public class GameController {

    public GameController() {



    }

    public boolean startGame() {
        Chessfield cf = new Chessfield();
        Field[][] chessfield = Chessfield.getChessfield();

        return true;
    }



}
