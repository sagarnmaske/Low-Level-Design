package snakeAndLadder;

import java.util.HashMap;
import java.util.Map;

public class Board {
    char[][] board;
    int size;
    int row;
    Map<Integer, Integer> snakesAndLadder;

    public Board(int n) {
        size = n * n;
        row = n;
        this.board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.board[i][j] = '-';
            }
        }
        this.snakesAndLadder = new HashMap<>();
        snakesAndLadder.put(1, 10);
        snakesAndLadder.put(5, 18);
        snakesAndLadder.put(7, 12);
        snakesAndLadder.put(9, 13);
        snakesAndLadder.put(14, 9);
        snakesAndLadder.put(15, 8);
        snakesAndLadder.put(16, 7);
        snakesAndLadder.put(17, 6);
    }

    public void viewBoard() {
        for (char[] chars : this.board) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    public boolean updatePiece(int count, Player player) {
        int newPos = player.curPos + count;
        if (newPos > size) {
            return false;
        }
        // clear old position
        if (player.curPos > 0) {
            int oldPos = player.curPos - 1;
            int oldR = oldPos / row;
            int oldC = oldPos % row;

            if (oldR % 2 == 1) {
                oldC = row - 1 - oldC;
            }
            board[row - 1 - oldR][oldC] = '-';
        }
        player.curPos = newPos;

        if (snakesAndLadder.containsKey(player.curPos)) {
            player.curPos = snakesAndLadder.get(player.curPos);
        }

        int pos = player.curPos - 1;

        int r = pos / row;
        int c = pos % row;

        if (r % 2 == 1) {
            c = row - 1 - c;
        }

        r = row - 1 - r;

        board[r][c] = player.piece;

        viewBoard();

        return player.curPos == size;
    }
}
