public class Event{
    public final static int pricePerGuest=35;
    public final static int maxGuests=50;
    private String eventNr;
    private int guestsNr;
    private int price;

    public void setEventNr(String eventNr) {
        this.eventNr = eventNr;
    }

    public void setGuestsNr(int guestsNr) {
        this.guestsNr = guestsNr;
    }

    public String getEventNr() {
        return eventNr;
    }

    public int getGuestsNr() {
        return guestsNr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}