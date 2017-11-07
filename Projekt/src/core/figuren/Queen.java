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
        for (Figur piece : figures) {
            piece.setPosition(getPosition());
            possibleMoves.addAll(piece.getPossibleMoves());
        }
        return possibleMoves;
    }
}
