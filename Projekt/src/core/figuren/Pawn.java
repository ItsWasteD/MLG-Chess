package core.figuren;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pawn extends Figur {

    private final List<int[][]> moves = new ArrayList<>();
    private List<int[][]> possibleMoves;

    public Pawn(String color) {
                moves.add(2, 0);
                moves.add({-2}{0});
                moves.add({1, 1});
                moves.add({1, 0});
                moves.add({1, -1});
                moves.add({-1, 1});
                moves.add({-1, 0});
                moves.add({-1, -1});
        super(color);
    }

    @Override
    public ArrayList<int[][]> getPossibleMoves() {
        if (isOnStartPosition() && color == black) {
            possibleMoves
        }
        return null;
    }

}
