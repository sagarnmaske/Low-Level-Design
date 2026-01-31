package ticTacToe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BoardManager {
    public void playTicTacToe() {
        PieceType defaultPiece = new DefaultPieceType();
        PieceType xPiece = new XPieceType();
        PieceType oPiece = new OPieceType();
        Board board = InitialiseBoard.initializeBoard(defaultPiece);
        Player player1 = new Player(1, xPiece);
        Player player2 = new Player(2, oPiece);
        OperationsOnBoard operationsOnBoard = new OperationsOnBoard(board);
        Queue<Player> playerQueue = new LinkedList<Player>();
        playerQueue.add(player1);
        playerQueue.add(player2);
        CheckWinner checkWinner = new CheckWinner(new ColumnWiseWinner(),
                new RowWiseWinner(), new DiagonalWiseWinner()
                , board, defaultPiece);
        DrawChecker drawChecker = new DrawChecker(board, defaultPiece);
        while (true) {
            operationsOnBoard.showBoard();
            Player currPlayer = playerQueue.poll();
            System.out.println(currPlayer.playerId + ": Please Add Your Move Like (row,col)");
            Scanner scanner = new Scanner(System.in);
            int row = Integer.parseInt(scanner.nextLine());
            int col = Integer.parseInt(scanner.nextLine());
            operationsOnBoard.move(row, col, currPlayer.pieceType);
            if (checkWinner.isWinner()) {
                System.out.println(currPlayer.playerId + " Is Winner");
                break;
            }

            if (drawChecker.isDraw()) {
                System.out.println("Draw!!! No Winner Possible");
                break;
            }

            playerQueue.offer(currPlayer);

        }
        System.out.println("Game Over!!!!!!");

    }
}
