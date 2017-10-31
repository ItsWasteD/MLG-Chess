package core.figuren;

import java.util.ArrayList;

public abstract class Figur {

    private String color;
    private boolean isDead;

    public Figur(String color) {
        this.color = color;
        this.isDead = false;
    }

    public abstract ArrayList<int[][]> getPossibleMoves();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
