package core.figuren;

import game.Field;

import java.util.ArrayList;

public class Queen extends Figur {


    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public ArrayList<Field> getPossibleMoves() {
        possibleMoves.clear();
        Figur[] figures = {
                new Rook(isWhite()),
                new Bishop(isWhite())
        };
        for (Figur figur : figures) {
            figur.setPosition(getPosition());
            possibleMoves.addAll(figur.getPossibleMoves());
        }
        return possibleMoves;
    }
}
