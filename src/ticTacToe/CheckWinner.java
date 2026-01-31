package ticTacToe;

public class CheckWinner {
    ColumnWiseWinner columnWiseWinner;
    RowWiseWinner rowWiseWinner;
    DiagonalWiseWinner diagonalWiseWinner;
    PieceType[][] board;
    PieceType defaultPieceType;

    public CheckWinner(ColumnWiseWinner columnWiseWinner,
                       RowWiseWinner rowWiseWinner,
                       DiagonalWiseWinner diagonalWiseWinner,
                       Board board, PieceType defaultPieceType) {
        this.columnWiseWinner = columnWiseWinner;
        this.rowWiseWinner = rowWiseWinner;
        this.diagonalWiseWinner = diagonalWiseWinner;
        this.board = board.squares;
        this.defaultPieceType = defaultPieceType;
    }

    public boolean isWinner() {
        return columnWiseWinner.isWinner(board, defaultPieceType) == rowWiseWinner.isWinner(board, defaultPieceType)
                == diagonalWiseWinner.isWinner(board, defaultPieceType);
    }
}
