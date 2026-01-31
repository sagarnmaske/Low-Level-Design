package ticTacToe;

public class DiagonalWiseWinner implements WinningStrategy {
    @Override
    public boolean isWinner(PieceType[][] board, PieceType defaultPieceType) {

        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != defaultPieceType) {
            return true;
        }
        return board[0][2] == board[1][1] && board[0][2] == board[2][2] && board[0][2] != defaultPieceType;
    }
}
