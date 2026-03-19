package notification;

public class DiscountOfferPublisher extends Publisher {

    public DiscountOfferPublisher(EventsQueue queue) {
        super(queue);
    }

    public void appyDiscountOffer(int id) {
        publishEvent(new DiscountOfferEvent(id, "10% Discount",
                "We are giving 10% discount on our premium subscription",
                System.currentTimeMillis()));
    }

    @Override
    void publishEvent(Event event) {
        eventsQueue.addEvent(event);
    }
}
