package core.figuren;

import game.Chessfield;
import game.Field;

import java.util.ArrayList;

public class Rook extends Figur {


    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public ArrayList<Field> getPossibleMoves() {
        int row = super.getPosition().ROW;
        int column = super.getPosition().COLUMN;
        possibleMoves.clear();
        //all possible moves in the up
        for (int i = row + 1; i < Chessfield.SIZE; i++) {
            Field square = super.getPosition().getField(i, column);
            if (square.getFigur() == null) {
                possibleMoves.add(square);
            } else if (isOpponent(square.getFigur())) {
                possibleMoves.add(square);
                break;
            } else {
                break;
            }
        }
        //all possible moves in the down
        for (int i = row - 1; i > -1; i--) {
            Field square = super.getPosition().getField(i, column);
            if (square.getFigur() == null) {
                possibleMoves.add(square);
            } else if (isOpponent(square.getFigur())) {
                possibleMoves.add(square);
                break;
            } else {
                break;
            }
        }
        //all possible moves to the right
        for (int i = column + 1; i < Chessfield.SIZE; i++) {
            Field square = super.getPosition().getField(row, i);
            if (square.getFigur() == null) {
                possibleMoves.add(square);
            } else if (isOpponent(square.getFigur())) {
                possibleMoves.add(square);
                break;
            } else {
                break;
            }
        }
        //all possible moves to the left
        for (int i = column - 1; i > -1; i--) {
            Field square = super.getPosition().getField(row, i);
            if (square.getFigur() == null) {
                possibleMoves.add(square);
            } else if (isOpponent(square.getFigur())) {
                possibleMoves.add(square);
                break;
            } else {
                break;
            }
        }
        return possibleMoves;
    }
}
