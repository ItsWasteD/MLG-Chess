package game;

import core.figuren.*;

public class Chessfield {

    public final static int SIZE = 8;
    private static Field[][] field = new Field[SIZE][SIZE];

    public Chessfield() {
        creatDefaultField();
    }

    private void creatDefaultField() {

        createEmptyField();
        field[0][0].setFigur(new Pawn(true));
        field[0][1].setFigur(new Knight(true));
        field[0][2].setFigur(new Bishop(true));
        field[0][3].setFigur(new King(true));
        field[0][4].setFigur(new Queen(true));
        field[0][5].setFigur(new Bishop(true));
        field[0][6].setFigur(new Knight(true));
        field[0][7].setFigur(new Pawn(true));

        field[7][0].setFigur(new Pawn(false));
        field[7][1].setFigur(new Knight(false));
        field[7][2].setFigur(new Bishop(false));
        field[7][3].setFigur(new King(false));
        field[7][4].setFigur(new Queen(false));
        field[7][5].setFigur(new Bishop(false));
        field[7][6].setFigur(new Knight(false));
        field[7][7].setFigur(new Pawn(false));
    }

    private void createEmptyField() {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                this.field[y][x] = new Field(x, y);
            }
        }
    }

    public static Field[][] getField() {
        return Chessfield.field;
    }

    public static void setField(Field[][] field) {
        Chessfield.field = field;
    }

}
