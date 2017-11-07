package core.figuren;

import game.Field;

import java.util.ArrayList;

public abstract class Figur {

    private boolean isWhite;
    private boolean isDead;
    private Field position;
    private boolean opponent;
    public ArrayList<Field> possibleMoves;

    public Figur(boolean isWhite) {
        this.isWhite = isWhite;
        this.isDead = false;
    }

    public abstract ArrayList<Field> getPossibleMoves();

    public boolean isWhite() {
        return isWhite;
    }

    public boolean isDead() {
        return isDead;
    }

    public void kill() {
        isDead = true;
    }

    public Field getPosition() {
        return position;
    }

    public void setPosition(Field position) {
        this.position = position;
    }

    public boolean isOpponent(Figur figur) {
        return figur.isWhite != this.isWhite;
    }
}
