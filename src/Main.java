
import singletonPattern.LoggerController;
import threadSafeCaching.CacheController;

public class Main {
    public static void main(String[] args) {
        CacheController cacheController = new CacheController();
        cacheController.controlCaching();
    }
}