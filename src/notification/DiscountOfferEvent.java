package notification;

public class DiscountOfferEvent extends Event {
    public DiscountOfferEvent(int id, String title, String description, long timestamp) {
        super(id, title, description, timestamp);
    }
}
