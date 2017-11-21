package core.java.figuren;

import game.java.Chessfield;
import game.java.Field;

import java.util.ArrayList;

public class Rook extends Figur {


    public Rook(boolean isWhite) {
        super(isWhite);
        possibleMoves = new ArrayList<>();
    }

    @Override
    public ArrayList<Field> getPossibleMoves() {
        int row = super.getPosition().ROW;
        int column = super.getPosition().COLUMN;
        possibleMoves.clear();
        //all possible moves in the up
        for (int i = row + 1; i < Chessfield.SIZE; i++) {
            Field field = super.getPosition().getField(i, column);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        //all possible moves in the down
        for (int i = row - 1; i > -1; i--) {
            Field field = super.getPosition().getField(i, column);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        //all possible moves to the right
        for (int i = column + 1; i < Chessfield.SIZE; i++) {
            Field field = super.getPosition().getField(row, i);
            if (field.getFigur() == null) {
                possibleMoves.add(field);
            } else if (isOpponent(field.getFigur())) {
                possibleMoves.add(field);
                break;
            } else {
                break;
            }
        }
        //all possible moves to the left
        for (int i = column - 1; i > -1; i--) {
            Field field = super.getPosition().getField(row, i);
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
