package snakeAndLadder;

import java.util.*;

public class SnakeAndLadderGame {
    public void playGame() {
        System.out.println("Enter Dimension");
        Scanner input = new Scanner(System.in);
        int dimension = input.nextInt();
        Board board = new Board(dimension);
        board.viewBoard();
        Player p1 = new Player(1,'*',0);
        Player p2 = new Player(2,'#',0);
        Queue<Player> players = new LinkedList<>();
        players.offer(p1);
        players.offer(p2);
        while (true) {
            Player turn = players.poll();
            System.out.println(turn.playerId +":Turn");
            System.out.println("Roll The Dice");
            int roll = input.nextInt();
            if(board.updatePiece(roll, turn)){
                System.out.println(turn.playerId +" Won the Game");
                break;
            }
            players.offer(turn);
        }
    }
}
