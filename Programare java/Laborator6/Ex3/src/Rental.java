public class Rental{
    public final static int NR_MINUTE_PER_ORA=60;
    public final static int RATA_INCHIRIERII_PER_ORA=40;
    private String nrContract;
    private double nrOreInchiriere;
    private int nrMinuteOra;
    private double pret;

    public Rental(String nrContract, int nrMinuteOra) {
        setNrContract(nrContract);
        setNrMinuteOra(nrMinuteOra);
    }

    public Rental() {
        this("A000", 0);
    }


    public void setNrContract(String nrContract) {
        this.nrContract = nrContract;
    }

    public void setNrMinuteOra(int nrMinuteOra) {
        double ore, minuteRamase;
        ore=Math.floor(nrMinuteOra/NR_MINUTE_PER_ORA);
        minuteRamase=nrMinuteOra-ore*NR_MINUTE_PER_ORA;
        if(minuteRamase<=40)
        this.pret=ore*RATA_INCHIRIERII_PER_ORA+minuteRamase;
        else this.pret=ore*RATA_INCHIRIERII_PER_ORA+40;
        this.nrOreInchiriere=ore;
    }

    public String getNrContract() {
        return nrContract;
    }

    public double getNrOreInchiriere() {
        return nrOreInchiriere;
    }

    public int getNrMinuteOra() {
        return nrMinuteOra;
    }

    public double getPret() {
        return pret;
    }
}