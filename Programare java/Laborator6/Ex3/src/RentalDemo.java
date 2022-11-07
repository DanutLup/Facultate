import java.util.Scanner;

public class RentalDemo {

    public static void main(String[] args){
        int i=0;
        Rental rental=new Rental();
        Rental rental2=new Rental(contract(), minute());
        afisareDeviz(rental2);
        while(i<rental2.getNrOreInchiriere()){
            System.out.println("\nCoupon good for 10 percent off next rental ");
            i++;
        }
    }
    static Scanner keyboard=new Scanner(System.in);
    public static int minute(){
        int minute;
        System.out.print("Introduceti numarul de minute >> ");
        minute=keyboard.nextInt();
        while(minute<=60&&minute>=7200){
            System.out.print("Numarul de minute trebuie sa fie cuprins intre 60 si 7200>> ");
            minute=keyboard.nextInt();
        }
        return minute;
    }
    public static String contract(){
        String contract;
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
