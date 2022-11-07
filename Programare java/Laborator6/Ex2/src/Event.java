public class Event{
    public static final int LOWER_PRICE_PER_GUEST=32;
    public static final int HIGHER_PRICE_PER_GUEST=35;
    public static final int MAX_GUESTS=50;
    private String nrEvent;
    private int nrGuests;
    private int price;
    private int pricePerGuest;

    public Event(String nrEvent, int nrGuests) {
        setNrEvent(nrEvent);
        setNrGuests(nrGuests);
    }

    public Event() {
        this("A000", 0);
    }

    public void setNrEvent(String nrEvent) {
        this.nrEvent = nrEvent;
    }

    public void setNrGuests(int nrGuests) {
        this.nrGuests = nrGuests;
        if(isLargeEvent()) {
            this.pricePerGuest=LOWER_PRICE_PER_GUEST;
            this.price=nrGuests*LOWER_PRICE_PER_GUEST;
        }
        else {
            this.pricePerGuest=HIGHER_PRICE_PER_GUEST;
            this.price=nrGuests*HIGHER_PRICE_PER_GUEST;
        }
    }

    public String getNrEvent() {
        return nrEvent;
    }

    public int getNrGuests() {
        return nrGuests;
    }

    public int getPrice() {
        return price;
    }
    public boolean isLargeEvent(){
        if(this.nrGuests>50) return true;
        else return false;
    }

    public int getPricePerGuest() {
        return pricePerGuest;
    }
}