package core.figuren;

import game.Field;

import java.util.ArrayList;


public class Pawn extends Figur {

    private ArrayList<Field> possibleMoves;

    public Pawn(boolean color, ArrayList<Field> possibleMoves) {
        super(color);
        this.possibleMoves = getPossibleMoves();
    }

    @Override
    public ArrayList<Field> getPossibleMoves() {
        possibleMoves.clear();
        boolean isWhite = super.isWhite();
        int dx = isWhite ? -1 : 1;

        Field ahead = super.getPosition().getNeightbour(dx, 0);
        if (ahead.getFigur() == null) {
            possibleMoves.add(ahead);
            if (super.getPosition().ROW == 6 && isWhite) {
                Field aheadsecond = super.getPosition().getNeightbour(dx - 1, 0);
                if (aheadsecond.getFigur() == null) {
                    possibleMoves.add(aheadsecond);
                }
            } else if (super.getPosition().ROW == 1 && !isWhite) {
                Field aheadsecond = super.getPosition().getNeightbour(dx + 1, 0);
                if (aheadsecond.getFigur() == null) {
                    possibleMoves.add(aheadsecond);
                }
            }
        }
        Field aheadLeft = super.getPosition().getNeightbour(dx, -1);
        if (aheadLeft != null && aheadLeft.getFigur() != null && isOpponent(aheadLeft.getFigur())) {
            possibleMoves.add(aheadLeft);
        }
        Field aheadRight = super.getPosition().getNeightbour(dx, 1);
        if (aheadRight != null && aheadRight.getFigur() != null && isOpponent(aheadRight.getFigur())) {
            possibleMoves.add(aheadRight);
        }
        return possibleMoves;
    }
}
