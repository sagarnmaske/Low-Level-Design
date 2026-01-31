package ticTacToe;

public class OperationsOnBoard {

    Board board;

    OperationsOnBoard(Board board) {
        this.board = board;
    }

    public void showBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board.squares[i][j].pieceType + " ");
            }
            System.out.println();
        }
    }

    public void move(int row, int col, PieceType pieceType) {
        board.squares[row][col] = pieceType;
    }
}
