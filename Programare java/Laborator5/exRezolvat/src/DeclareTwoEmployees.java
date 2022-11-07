import java.util.Scanner;

public class DeclareTwoEmployees {
    public static void main(String[] args){
        employee clerk=new employee();
        employee driver=new employee();

        clerk=getData(clerk);
        driver=getData(driver);

        System.out.println("Clerk details: ");
        System.out.println(clerk.getEmpNum()+" "+
                clerk.getEmpFirstName()+" "+clerk.getEmpLastName()+" "
                + clerk.getEmpSalary()+" RON" );

        System.out.println("Driver details: ");
        System.out.println(driver.getEmpNum()+" "+
                driver.getEmpFirstName()+" "+driver.getEmpLastName()+" "
                + driver.getEmpSalary()+" RON" );
    }
    public static employee getData(employee emp){
        int num=0;
        String firstName, lastName;
        double salary;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter number >> ");
        num=keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter firstname >> ");
        firstName=keyboard.nextLine();
        System.out.print("Enter last name >> ");
        lastName=keyboard.nextLine();
        System.out.print("Enter salary >> ");
        salary=keyboard.nextDouble();
        emp.setEmpNum(num);
        emp.setEmpFirstName(firstName);
        emp.setEmpLastName(lastName);
        emp.setEmpSalary(salary);
        return emp;
    }

}
