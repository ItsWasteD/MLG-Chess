package core.figuren;

import game.Chessfield;
import game.Field;

import java.util.ArrayList;

public class Bishop extends Figur {


    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public ArrayList<Field> getPossibleMoves() {
            int row = super.getPosition().ROW;
            int column = super.getPosition().COLUMN;
            possibleMoves.clear();
            //all possible moves in the down positive diagonal
            for (int j = column + 1, i = row + 1; j < Chessfield.SIZE && i < Chessfield.SIZE; j++, i++) {
                Field square = super.getPosition().getField(i, j);
                if (square.getFigur() == null) {
                    possibleMoves.add(square);
                } else if (isOpponent(square.getFigur())) {
                    possibleMoves.add(square);
                    break;
                } else {
                    break;
                }
            }
            //all possible moves in the up positive diagonal
            for (int j = column - 1, i = row + 1; j > -1 && i < Chessfield.SIZE; j--, i++) {
                Field square = super.getPosition().getField(i, j);
                if (square.getFigur() == null) {
                    possibleMoves.add(square);
                } else if (isOpponent(square.getFigur())) {
                    possibleMoves.add(square);
                    break;
                } else {
                    break;
                }
            }
            //all possible moves in the up negative diagonal
            for (int j = column - 1, i = row - 1; j > -1 && i > -1; j--, i--) {
                Field square = super.getPosition().getField(i, j);
                if (square.getFigur() == null) {
                    possibleMoves.add(square);
                } else if (isOpponent(square.getFigur())) {
                    possibleMoves.add(square);
                    break;
                } else {
                    break;
                }
            }
            //all possible moves in the down negative diagonal
            for (int j = column + 1, i = row - 1; j < Chessfield.SIZE && i > -1; j++, i--) {
                Field square = super.getPosition().getField(i, j);
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
