package core.figuren;

import game.Field;

import java.util.ArrayList;

public class Knight extends Figur {


    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public ArrayList<Field> getPossibleMoves() {
        possibleMoves.clear();
        int[][] offsets = {
                {-2, 1},
                {-1, 2},
                {1, 2},
                {2, 1},
                {2, -1},
                {1, -2},
                {-1, -2},
                {-2, -1}
        };
        for (int[] o : offsets) {
            Field square = super.getPosition().getField(o[0], o[1]);
            if (square != null && (square.getFigur() == null || isOpponent(square.getFigur()))) {
                possibleMoves.add(square);
            }
        }
        return possibleMoves;
    }
}