public class employee{
    private int empNum;
    private String empLastName;
    private String empFirstName;
    private double empSalary;

    public int getEmpNum() {
        return empNum;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}