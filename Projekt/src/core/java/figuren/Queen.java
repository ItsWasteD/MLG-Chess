package core.java.figuren;

import game.java.Field;

import java.util.ArrayList;

public class Queen extends Figur {


    public Queen(boolean isWhite) {
        super(isWhite);

        possibleMoves = new ArrayList<>();
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