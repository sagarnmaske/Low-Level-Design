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
}
