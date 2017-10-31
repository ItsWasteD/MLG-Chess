package core.figuren;

import game.Feld;

import java.util.ArrayList;

public abstract class Figur {

    private Feld feld;
    private String farbe;
    private boolean isDead;

    public abstract ArrayList<int[][]> getPossibleMoves();
}
