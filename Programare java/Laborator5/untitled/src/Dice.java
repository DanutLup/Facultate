public class Dice {
    private int number;
    private static int highest_die_value=1;
    private static int lowest_die_valuel=6;

    public Dice() {
        number= ((int) (Math.random()));
    }
    public void afiseaza(){
        System.out.println("Numarul este "+number);
    }

    public int getnum() {
        return number;
    }
}
