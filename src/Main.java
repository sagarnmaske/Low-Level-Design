
import equalandHashcode.MoneyDriverController;
import notification.EmailNotification;
import notification.NotificationManager;
import notification.SmsNotification;
import printerService.AdvancePrinter;
import printerService.AllInOnePrinter;
import printerService.BasicPrinter;
import printerService.Office;
import shoppingcartSystem.UserCartController;

public class Main {
    public static void main(String[] args) {
//        PaymentManager paymentManager = new PaymentManager();
//        PaymentStrategy paymentStrategy = paymentManager.choosePaymentMethod("cash");
//        paymentStrategy.pay();
//        Office office = new Office(new BasicPrinter());
//        office.doWork();
//        NotificationManager notificationManager = new NotificationManager(new SmsNotification());
 //       notificationManager.tellSecret();
//        UserCartController userCartController = new UserCartController();
//        userCartController.createCartSystem();
        MoneyDriverController moneyDriverController = new MoneyDriverController();
        moneyDriverController.createImmutableClass();
    }
}