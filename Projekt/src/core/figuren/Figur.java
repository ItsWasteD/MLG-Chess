package core.figuren;

import game.Feld;

import java.util.ArrayList;

public abstract class Figur {

    private String farbe;
    private boolean isDead;

    public abstract ArrayList<int[][]> getPossibleMoves();

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
