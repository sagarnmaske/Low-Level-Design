package ticTacToe;

public interface WinningStrategy {
    boolean isWinner(PieceType[][] board,PieceType defaultPieceType);
}
