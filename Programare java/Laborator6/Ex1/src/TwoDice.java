import java.util.Scanner;

public class TwoDice {
    public static void main(String [] args){
        Scanner keyboard=new Scanner(System.in);
        int valoare, i;
        System.out.println("Introduceti un numar intre 2 si 12 >> ");
        valoare=keyboard.nextInt();
        System.out.println("Se arunca zarurile...\n-------------------------------------------");
        for(i=0; i<3; ++i){
            System.out.println("Aruncarea "+(i+1));
            Die zar1=new Die();
            Die zar2=new Die();
            int suma=zar1.getVal()+zar2.getVal();
            System.out.println("Suma zarurilor: "+suma);
            if(zar1.getVal()+ zar2.getVal()==valoare){
                System.out.println("Felicitari! Ati castigat!");
                break;
            }
        }
        if(i==3){
            System.out.println("Ati pierdut");
        }

    }
}
