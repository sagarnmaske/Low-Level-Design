
import executorService.ParallelTaskController;
import notification.NotificationController;
import parkingLot.ParkingLot;
import singletonPattern.LoggerController;

public class Main {
    public static void main(String[] args) {
        LoggerController loggerController = new LoggerController();
        loggerController.checkInstances();
    }
}