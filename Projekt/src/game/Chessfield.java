package game;

public class Chessfield {

    public final static int SIZE = 8;
    private Field[][] field = new Field[SIZE][SIZE];

    public Chessfield() {
        creatDefaultField();
    }

    private void creatDefaultField() {

        createEmptyField();

       /* field[0][0].setFigur(new Pawn("black"));
        field[0][1].setFigur(new Knight("black"));
        field[0][2].setFigur(new Bishop("black"));
        field[0][3].setFigur(new King("black"));
        field[0][4].setFigur(new Queen("black"));
        field[0][5].setFigur(new Bishop("black"));
        field[0][6].setFigur(new Knight("black"));
        field[0][7].setFigur(new Pawn("black"));

        field[7][0].setFigur(new Pawn("white"));
        field[7][1].setFigur(new Knight("white"));
        field[7][2].setFigur(new Bishop("white"));
        field[7][3].setFigur(new King("white"));
        field[7][4].setFigur(new Queen("white"));
        field[7][5].setFigur(new Bishop("white"));
        field[7][6].setFigur(new Knight("white"));
        field[7][7].setFigur(new Pawn("white"));*/
    }

    private void createEmptyField() {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                this.field[y][x] = (x + y) % 2 == 0 ? new Field(x, y) : new Field(x, y);
            }
        }
    }

    public Field[][] getField() {
        return field;
    }

    public void setField(Field[][] field) {
        this.field = field;
    }

}
