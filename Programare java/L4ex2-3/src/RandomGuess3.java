import java.util.Scanner;

public class RandomGuess3 {
    public static void main(String[] args) {
        int nr=1+ (int)(Math.random()*10);
        Scanner sc=new Scanner(System.in);
        System.out.println("A fost generat un numar. Incercati sa-l ghiciti: ");
        int rasp = sc.nextInt();
        int incercari=1;
        while(rasp!=nr)  {
            incercari++;
            if (rasp < nr) {
                System.out.println("Ati introdus un numar mai mic decat numarul generat");
                System.out.println("Incercati din nou: ");
            }
            else {
                System.out.println("Ati introdus un numar mai mare decat numarul generat");
                System.out.println("Incercati din nou: ");
            }
            rasp=sc.nextInt();
        }
        System.out.println("Felicitari! Ati ghicit numarul din "+incercari+" incercari.");
    }
}