import java.util.Scanner;

public class TwoCharacters {
    public static void main(String[] args){
        MyCharacter character1=new MyCharacter();
        MyCharacter character2=new MyCharacter();

        character1=getData(character1);
        character2=getData(character2);

        System.out.println("Character 1 info...");
        System.out.println(character1.getColor()+" "+
                character1.getEyeNumber()+" "+character1.getLifesNumber());

        System.out.println("Character 2 info...");
        System.out.println(character2.getColor()+" "+
                character2.getEyeNumber()+" "+character2.getLifesNumber());
    }
    public static MyCharacter getData(MyCharacter character){
        String color;
        int eyeNumber, lifesNumber;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Introduceti culoarea >> ");
        color=keyboard.nextLine();
        System.out.print("Introduceti numarul de ochi >> ");
        eyeNumber=keyboard.nextInt();
        System.out.print("Introduceti numarul de vieti >> ");
        lifesNumber=keyboard.nextInt();
        character.setColor(color);
        character.setEyeNumber(eyeNumber);
        character.setLifesNumber(lifesNumber);
        return character;
    }
}
