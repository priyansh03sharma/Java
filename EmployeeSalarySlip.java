import java.util.Scanner;

public class EmployeeSalarySlip {
    int id;
    String name;
    double basicSalary;
    // Earnings
    double hra = 0.40;
    double da = 0.20;
    double ta = 2000.0;
    
    // Deductions
    double pf = 0.05;
    double tds = 0.10;
    
    
    
    void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID : ");
        this.id = scanner.nextInt();
        
        scanner.nextLine();
        System.out.println("Enter your Name : ");
        this.name = scanner.nextLine();

        scanner.close();

    }
    
    void showEmpDetails() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + basicSalary);
    }
    
    public double earnings() {
        hra = hra * basicSalary;
        da = da * basicSalary;
        ta = ta * basicSalary;
        double earningSalary = hra + da + ta + basicSalary;
        return earningSalary;
    }
    
    public double deductions() {
        pf = pf * basicSalary;
        tds = tds * basicSalary;
        double deductionSalary = pf + tds;
        return deductionSalary;
    }
    
    public double netSalary() {
        double earningSalary = earnings();
        double deductionSal = deductions();
        System.out.println("Earning : " + earningSalary);
        System.out.println("Deduction : " + deductionSal);
        double netSal = earningSalary - deductionSal;
        return netSal;
    }

    public static void main(String[] args) {
        EmpSalarySlip ram = new EmpSalarySlip();
        ram.takeInput();
        ram.showEmpDetails();
        double netSal = ram.netSalary();
        System.out.println("Net Salary is : " + netSal);
    }
    
}
