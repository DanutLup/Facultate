import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int corecte=0;
        String correct1="B";
        String correct2="A";
        String correct3="B";
        String correct4="B";
        String correct5="D";
        System.out.println("Celulele cu conuri: ");
        System.out.println("A: sunt stimultate de substante chimice;");
        System.out.println("B: contin pigmenti;");
        System.out.println("C: asigura vederea nocturna;");
        System.out.println("D: sunt localizate in coroida");
        System.out.println("Introduceti literele corsepunzatoare variantelor corecte: ");
        String a1=sc.nextLine();
        if(a1.equals(correct1)){
            System.out.println("Felicitari! ati raspuns corect");
            corecte++;
        }
        else {
            System.out.println("Raspunsul corect era "+correct1);
        }
        System.out.println("Urina se formeaza in: ");
        System.out.println("A: nefron");
        System.out.println("B: calicele renale");
        System.out.println("C: ureter");
        System.out.println("D: vezica urinara");
        System.out.println("Introduceti literele corsepunzatoare variantelor corecte: ");
        String a2=sc.nextLine();
        if(a2.equals(correct2)){
            System.out.println("Felicitari! ati raspuns corect");
            corecte++;
        }
        else {
            System.out.println("Raspunsul corect era "+correct2);
        }
        System.out.println("Receptorul analizatorului auditiv este localizat in: ");
        System.out.println("A: urechea medie;");
        System.out.println("B: urechea interna;");
        System.out.println("C: scoarta cerebrala;");
        System.out.println("D: urechea externa");
        System.out.println("Introduceti literele corsepunzatoare variantelor corecte: ");
        String a3=sc.nextLine();
        if(a3.equals(correct3)){
            System.out.println("Felicitari! ati raspuns corect");
            corecte++;
        }
        else{
            System.out.println("Raspunsul corect era "+correct3);
        }
        System.out.println("Emfizemul pulmonar este afectiune a sistemului: ");
        System.out.println("A: muscular");
        System.out.println("B: respirator");
        System.out.println("C: digestiv");
        System.out.println("D: excretor");
        System.out.println("Introduceti literele corsepunzatoare variantelor corecte: ");
        String a4=sc.nextLine();
        if(a4.equals(correct4)){
            System.out.println("Felicitari! ati raspuns corect");
            corecte++;
        }
        else{
            System.out.println("Raspunsul corect era "+correct4);
        }
        System.out.println("In timpul unei inspiratii normale: ");
        System.out.println("A: Cutia toracica isi micsoreaza volumul");
        System.out.println("B: Muschiul diafragm se relaxeaza");
        System.out.println("C: Presiunea aerului din plamani creste");
        System.out.println("D: Aerul atmosferic patrunde in plamani");
        System.out.println("Introduceti literele corsepunzatoare variantelor corecte: ");
        String a5=sc.nextLine();
        if(a5.equals(correct5)){
            System.out.println("Felicitari! ati raspuns corect");
            corecte++;
        }
        else {
            System.out.println("Raspunsul corect era " + correct5);
        }
        int procent;
        procent=(corecte*100)/5;
        System.out.println("Ati raspuns corect la "+corecte+" intrebari, ceea ce reprezinta" +
                " "+procent+"%");
    }
}