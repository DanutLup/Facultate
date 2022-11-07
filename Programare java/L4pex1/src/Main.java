import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int scores, min, max;
        do{
            System.out.println("Introduceti un scor: ");
            scores=sc.nextInt();
            while((scores<0||scores>10)&&scores!=99){
                System.out.println("Introduceti un scor intre 0 si 10: ");
                scores=sc.nextInt();
            }
        }while(scores!=99);
    }
}