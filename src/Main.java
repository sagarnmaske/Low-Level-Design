
import snakeAndLadder.Board;
import snakeAndLadder.SnakeAndLadderGame;
import vedingMachine.*;

public class Main {
    public static void main(String[] args) {

//        VendingMachineController vendingMachineController =
//                new VendingMachineController(new VendingMachine
//                        (new Inventory(new Column[]{}), new IdleState()));
//        vendingMachineController.controlVendingMachine();
        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderGame();
        snakeAndLadderGame.playGame();
    }
}