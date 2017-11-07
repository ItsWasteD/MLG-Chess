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
            Field field = super.getPosition().getField(o[0], o[1]);
            if (field != null && (field.getFigur() == null || isOpponent(field.getFigur()))) {
                possibleMoves.add(field);
            }
        }
        return possibleMoves;
    }
}