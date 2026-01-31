package ticTacToe;

public class ColumnWiseWinner implements WinningStrategy {
    @Override
    public boolean isWinner(PieceType[][] board, PieceType defaultPieceType) {
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == defaultPieceType) {
                continue;
            }
            if (board[0][col] == board[1][col] && board[2][col] == board[0][col]) {
                return true;
            }
        }
        return false;
    }
}
