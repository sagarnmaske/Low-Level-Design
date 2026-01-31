package ticTacToe;

public class DrawChecker {
    public PieceType[][] board;
    public PieceType defaultPiece;


    DrawChecker(Board board, PieceType defaultPiece) {
        this.board = board.squares;
        this.defaultPiece = defaultPiece;
    }

    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == this.defaultPiece) {
                    return false;
                }
            }
        }
        return true;
    }
}
