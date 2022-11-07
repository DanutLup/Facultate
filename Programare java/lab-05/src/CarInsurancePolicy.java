public class CarInsurancePolicy {

    private int policyNumber;
    private int numPayments;
    private String residentCity;

    public CarInsurancePolicy(int policyNumber, int numPayments, String residentCity){
        this.policyNumber=policyNumber;
        this.numPayments=numPayments;
        this.residentCity=residentCity;
    }

    public CarInsurancePolicy(int policyNumber, int numPayments) {
        this.policyNumber = policyNumber;
        this.numPayments = numPayments;
        residentCity="Mayfield";
    }

    public CarInsurancePolicy(int policyNumber) {
        this.policyNumber = policyNumber;
        residentCity="Mayfield";
        numPayments=2;
    }

    public void afiseaza(int policyNumber){
        System.out.println(this.policyNumber);
    }
    public void display(){
        System.out.println("Policy #" + policyNumber +". ");
    }
}
