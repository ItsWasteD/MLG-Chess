package core.java.figuren;

import game.java.Chessfield;
import game.java.Field;

import java.util.ArrayList;

public class Bishop extends Figur {


    public Bishop(boolean isWhite) {
        super(isWhite);

        possibleMoves = new ArrayList<>();
    }

    @Override
    public ArrayList<Field> getPossibleMoves() {
        int row = super.getPosition().ROW;
        int column = super.getPosition().COLUMN;
        possibleMoves.clear();
        //all possible moves in the down positive diagonal
        for (int j = column + 1, i = row + 1; j < Chessfield.SIZE && i < Chessfield.SIZE; j++, i++) {
            Field field = super.getPosition().getField(i, j);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        //all possible moves in the up positive diagonal
        for (int j = column - 1, i = row + 1; j > -1 && i < Chessfield.SIZE; j--, i++) {
            Field field = super.getPosition().getField(i, j);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        //all possible moves in the up negative diagonal
        for (int j = column - 1, i = row - 1; j > -1 && i > -1; j--, i--) {
            Field field = super.getPosition().getField(i, j);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        //all possible moves in the down negative diagonal
        for (int j = column + 1, i = row - 1; j < Chessfield.SIZE && i > -1; j++, i--) {
            Field field = super.getPosition().getField(i, j);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        return possibleMoves;

    }
}
