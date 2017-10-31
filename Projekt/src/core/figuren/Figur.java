package core.figuren;

import api.Moveable;
import game.Feld;

import java.util.ArrayList;

public abstract class Figur implements Moveable {

    private Feld feld;
    private String farbe;
    private boolean isDead;

    @Override
    public boolean moveTo(int x, int y) {

        return false;
    }

    public abstract ArrayList<int[][]> getPossibleMoves();
}
