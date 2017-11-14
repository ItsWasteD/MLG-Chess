package core.figuren;

import game.java.Field;

import java.util.ArrayList;
import java.util.List;

public class King extends Figur {


    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public ArrayList<Field> getPossibleMoves() {
        possibleMoves.clear();
        List<Field> moves = new ArrayList<>();
        int[][] offsets = {
                {1, 0},
                {0, 1},
                {-1, 0},
                {0, -1},
                {1, 1},
                {-1, 1},
                {-1, -1},
                {1, -1}
        };
        for (int[] o : offsets) {
            Field field = super.getPosition().getNeightbour(o[0], o[1]);
            if (field != null && (field.getFigur() == null || isOpponent(field.getFigur()))) {
                moves.add(field);
            }
        }
        possibleMoves.addAll(moves);
        return possibleMoves;
        /*if (getSquare().isSelected()) {
            Piece[] pieces = {
                    PieceType.PAWN.create(getPieceColor()),
                    PieceType.ROOK.create(getPieceColor()),
                    PieceType.BISHOP.create(getPieceColor()),
                    PieceType.KNIGHT.create(getPieceColor()),
                    PieceType.QUEEN.create(getPieceColor()),
                    PieceType.KING.create(getPieceColor())};
            Piece oldKing = this;
            getSquare().removePiece();
            for (Square kingMove : moves) {
                if (kingMove.isEmpty()) {
                    for (Piece piece : pieces) {
                        piece.putPieceOnSquareFirstTime(kingMove);
                        piece.generatePossibleMoves();
                        for (Square enemy : piece.getPossibleMoves()) {
                            if (!enemy.isEmpty() && enemy.getPiece().isOpponent(piece) && enemy.getPiece().getTypeNumber() == piece.getTypeNumber()) {
                                enemy.setBackground(Color.BLUE);
                                possibleMoves.remove(kingMove);
                                break;
                            }
                        }
                    }
                    kingMove.removePiece();
                } else if (isOpponent(kingMove.getPiece())) {
                    Piece oldPiece = kingMove.getPiece();
                    for (Piece piece : pieces) {
                        kingMove.removePiece();
                        piece.putPieceOnSquareFirstTime(kingMove);
                        piece.generatePossibleMoves();
                        for (Square square1 : piece.getPossibleMoves()) {
                            if (!square1.isEmpty() && square1.getPiece().isOpponent(piece) && square1.getPiece().getTypeNumber() == piece.getTypeNumber()) {
                                possibleMoves.remove(kingMove);
                                break;
                            }
                        }
                    }
                    kingMove.removePiece();
                    oldPiece.putPieceOnSquareFirstTime(kingMove);
                }
            }
            oldKing.putPieceOnSquareFirstTime(getSquare());
        }*/
    }

}
