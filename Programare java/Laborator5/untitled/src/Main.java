import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int suma, sum1;
        Scanner sc=new Scanner(System.in);
        Dice first= new Dice();
        first.afiseaza();
        Dice two=new Dice();
        for(int i=1; i<=3; i++)
        {
            System.out.println("Introduceti suma dvs: ");
            suma=sc.nextInt();
            sum1=first.getnum()+two.getnum();
        if(suma==sum1){
            System.out.println("Ati ghicit suma");
        }
        else System.out.println("Nu ati ghicit suma");
        }
    }
}