import java.util.Scanner;

public class eventDemo {
    public static void main(String[] args){
        String nrEveniment;
        int nrInvitati;
        Scanner keyboard=new Scanner(System.in);
        Event event1=new Event();
        System.out.println("Introduceti numarul celui de-al doilea eveniment >> ");
        nrEveniment=keyboard.nextLine();
        System.out.println("Introduceti numarul de invitati >> ");
        nrInvitati=keyboard.nextInt();
        while(nrInvitati<5||nrInvitati>100){
            System.out.println("Introduceti un numar intre 5 si 100");
            nrInvitati=keyboard.nextInt();
        }
        Event event2=new Event(nrEveniment, nrInvitati);
        displayEvent(event1);
        displayEvent(event2);
        displayEvent(compare(event1, event2));
    }
    public static void displayEvent(Event event){
        int i=0;
        System.out.println("Detaliile evenimentelor:");
        System.out.println("Eveniment "+event.getNrEvent()+" : "+event.getNrGuests()+
                " "+event.getPricePerGuest()+" "+event.getPrice());
        while(i<=event.getNrGuests()){
            System.out.println("Please come to my event! ");
        }
    }
    public static Event compare(Event event1, Event event2){
        if(event1.getNrGuests()>event2.getNrGuests())
            return event1;
        else return event2;
    }
}
