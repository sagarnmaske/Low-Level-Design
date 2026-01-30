package libraryManagamentSystem;

public class Reader {
    public int readerID;
    public String readerName;

    public Reader(int readerID, String readerName) {
        this.readerID = readerID;
        this.readerName = readerName;
    }

    public void acceptNotification(String notification) {
        System.out.println(notification);
    }
}
