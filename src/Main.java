
import builderPattern.BuilderController;
import chainOfResponsibilityPattern.LogHandler;
import equalandHashcode.MoneyDriverController;
import factoryPattern.CarFactoryController;
import notification.EmailNotification;
import notification.NotificationManager;
import notification.SmsNotification;
import printerService.AdvancePrinter;
import printerService.AllInOnePrinter;
import printerService.BasicPrinter;
import printerService.Office;
import shoppingcartSystem.UserCartController;
import singletonPattern.LoggerController;
import stateDesignPattern.RunTraffic;
import userRegistrationSystem.UserRegistrationController;

public class Main {
    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler();
        logHandler.handleLog("tree");
    }
}