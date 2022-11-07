import java.util.*;

public class CellPhoneService {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul maxim de minute pe care doriti sa-l utilizati lunar: ");
        int minute = sc.nextInt();
        System.out.println("Introduceti numarul maxim de mesaje: ");
        int mesaje = sc.nextInt();
        System.out.println("Introduceti numarul maxim de GB internet: ");
        int internet = sc.nextInt();
        if (minute < 500 && mesaje == 0 && internet == 0)
            System.out.println("Planul cel mai potrivit pentru dumneavoastra este planul A si costa 49 USD lunar");
        else if (minute < 500 && mesaje > 0 && internet == 0)
            System.out.println("Planul cel mai potrivit pentru dumneavoastra este planul B si costa 55 USD lunar");
        else if(minute >=500 && mesaje<100 && internet==0)
            System.out.println("Planul cel mai potrivit pentru dumneavoastra este planul C si costa 61 USD lunar");
        else if(minute>=500 && mesaje>=100 &&internet==0)
            System.out.println("Planul cel mai potrivit pentru dumneavoastra este planul D si costa 70 USD lunar");
        else if(internet>0 && internet<2)
            System.out.println("Planul cel mai potrivit pentru dumneavoastra este planul E si costa 79 USD lunar");
        else if(internet >= 2)
            System.out.println("Planul cel mai potrivit pentru dumneavoastra este planul F si costa 81 USD lunar");
    }
}