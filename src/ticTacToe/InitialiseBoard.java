package ticTacToe;

public class InitialiseBoard {

    public static Board initializeBoard(PieceType defaultPiece) {
        return new Board(defaultPiece);
    }
}
