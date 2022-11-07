import java.util.Scanner;

public class RandomGuess2 {
    public static void main(String[] args) {
        int nr=1+ (int)(Math.random()*10);
        Scanner sc=new Scanner(System.in);
        System.out.println("A fost generat un numar. Incercati sa-l ghiciti: ");
        int rasp=sc.nextInt();
        if(rasp==nr){
            System.out.println("Felicitari! Ati ghicit numarul!");
        }
        else if(rasp<nr)
            System.out.println("Ati introdus un numar mai mic decat numarul generat");
        else if(rasp>nr)
            System.out.println("Ati introdus un numar mai mare decat numarul generat");
        System.out.println("Numarul generat este: "+nr);
    }
}