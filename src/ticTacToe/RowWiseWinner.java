package ticTacToe;

public class RowWiseWinner implements WinningStrategy {
    @Override
    public boolean isWinner(PieceType[][] board, PieceType defaultPieceType) {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == defaultPieceType) {
                continue;
            }

            if (board[row][0] == board[row][1] && board[row][0] == board[row][2]) {
                return true;
            }
        }
        return false;
    }
}
