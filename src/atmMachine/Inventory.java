package atmMachine;

import java.util.LinkedList;
import java.util.Queue;

public class Inventory {
    int totalMoney;
    Queue<Note> hundredNotes;
    Queue<Note> twoHundredNotes;
    Queue<Note> fiveHundredNotes;

    public Inventory() {
        hundredNotes = new LinkedList<>();
        twoHundredNotes = new LinkedList<>();
        fiveHundredNotes = new LinkedList<>();
        totalMoney = 0;
    }
}
