package atmMachine;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    Inventory inventory;

    public InventoryManager(Inventory inventory) {
        this.inventory = inventory;
    }

    public void addHundredNotes(List<Note> notes) {
        this.inventory.totalMoney += notes.size() * 100;
        this.inventory.hundredNotes.addAll(notes);
    }

    public void addTwoHundredNotes(List<Note> notes) {
        this.inventory.totalMoney += notes.size() * 200;
        this.inventory.twoHundredNotes.addAll(notes);
    }

    public void addFiveHundredNotes(List<Note> notes) {
        this.inventory.totalMoney += notes.size() * 500;
        this.inventory.fiveHundredNotes.addAll(notes);
    }

    public List<Note> removeHundredNotes(int count) {
        this.inventory.totalMoney -= count * 100;
        List<Note> notes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            notes.add(this.inventory.hundredNotes.poll());
        }

        return notes;
    }

    public List<Note> removeTwoHundredNotes(int count) {
        this.inventory.totalMoney -= count * 200;
        List<Note> notes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            notes.add(this.inventory.twoHundredNotes.poll());
        }
        return notes;
    }

    public List<Note> removeFiveHundredNotes(int count) {
        this.inventory.totalMoney -= count * 500;
        List<Note> notes = new ArrayList<Note>();
        for (int i = 0; i < count; i++) {
            notes.add(this.inventory.fiveHundredNotes.poll());
        }
        return notes;
    }

    public int getTotalMoney() {
        return this.inventory.totalMoney;
    }

    public String totalAvailableNotes() {
        return "500:" + this.inventory.fiveHundredNotes.size() +
                " , " + "200:" + this.inventory.twoHundredNotes.size() +
                " , " + "100:" + this.inventory.hundredNotes.size() + " " +
                "Total Available Amount Is: " + this.inventory.totalMoney;
    }

}
