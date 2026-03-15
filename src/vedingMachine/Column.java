package vedingMachine;

import java.util.Queue;

public class Column {
    int columnNumber;
    Queue<Item> items;

    public Column(int columnNumber, Queue<Item> items) {
        this.columnNumber = columnNumber;
        this.items = items;
    }
}
