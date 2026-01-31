package ticTacToe;

public class Board {
    public PieceType[][] squares;

    public Board(PieceType defaultPieceType) {
        squares = new PieceType[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                squares[i][j] = defaultPieceType;
            }
        }
    }
}
