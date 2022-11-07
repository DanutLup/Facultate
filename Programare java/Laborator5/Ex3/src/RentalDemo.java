import java.util.Scanner;

public class RentalDemo {

    public static void main(String[] args){
        Rental rental=new Rental();
        rental.setNrMinuteOra(minute());
        rental.setNrContract(contract());
        afisareDeviz(rental);
    }
    static Scanner keyboard=new Scanner(System.in);
    public static int minute(){
        int minute;
        System.out.print("Introduceti numarul de minute >> ");
        minute=keyboard.nextInt();
        return minute;
    }
    public static String contract(){
        String contract;
        keyboard.nextLine();
        System.out.print("Introduceti numarul contractului >> ");
        contract=keyboard.nextLine();
        return contract;
    }
    public static void afisareDeviz(Rental rental){
        System.out.print("Numar contract: "+rental.getNrContract()
        +"\nOre: "+rental.getNrOreInchiriere()+"\nTarif pe ora: "+
                rental.RATA_INCHIRIERII_PER_ORA+"\nPret total: "+
                rental.getPret());
    }
}
