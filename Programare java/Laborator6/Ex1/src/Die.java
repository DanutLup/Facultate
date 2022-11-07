public class Die{
    public final int HIGHEST_DIE_VALUE=6;
    public final int LOWEST_DIE_VALUE=1;
    private int val;


    public Die() {
        int val;
        val= ((int) (Math.random () * 100)% HIGHEST_DIE_VALUE + 	LOWEST_DIE_VALUE);
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}