import java.util.Scanner;

public class CarlysEventPriceWithMethods {
    public static void main(String[] args){
        Event event=buildEvent();
        displayEvent(event);
    }
    private static void displayEvent(Event event){
        System.out.println("Numele evenimentului este: "+ event.getEventNr());
        System.out.println("Numarul de participanti: "+event.getGuestsNr());
        System.out.println("Pretul total: "+ event.getPrice());
    }

    public static Event buildEvent(){
        Event event=new Event();
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Introdu eventNumber >> ");
        event.setEventNr(keyboard.nextLine());

        System.out.print("Introdu numarul de participanti >> ");
        event.setGuestsNr(keyboard.nextInt());

        event.setPrice(event.getGuestsNr()*35);

        return event;
    }
}
