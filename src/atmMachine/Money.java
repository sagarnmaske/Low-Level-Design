package atmMachine;

import java.util.ArrayList;
import java.util.List;

public class Money {
    List<Note> hundredNotes;
    List<Note> twoHundredNotes;
    List<Note> fiveHundredNotes;

    public Money() {
        hundredNotes = new ArrayList<>();
        twoHundredNotes = new ArrayList<>();
        fiveHundredNotes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Money{" +
                "hundredNotes=" + hundredNotes.size() +
                ", twoHundredNotes=" + twoHundredNotes.size() +
                ", fiveHundredNotes=" + fiveHundredNotes.size() +
                '}';
    }
}
