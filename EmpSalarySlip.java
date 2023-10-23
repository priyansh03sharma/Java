import java.util.Scanner;

public class EmpSalarySlip {
    int id;
    String name;
    double basicSalary;
    // Earnings
    double hra = 0.40;
    double da = 0.20;
    double ta = 0.25;
    double ma = 0.15;
    
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
        
        EmpUtils utils = new EmpUtils();
        name = utils.formatName(name);
        
        System.out.println("Enter your Salary : ");
        this.basicSalary = scanner.nextDouble();
        
        
        String nameArray[] = name.split(" ");
        
        String fullName = "";
        for(String n : nameArray) {
            
            char firstLetter = n.charAt(0);
            
            
            String first = String.valueOf(firstLetter).toUpperCase();
            
        
            String remainingString = n.substring(1).toLowerCase();
            n = first + remainingString;
            fullName = fullName + n + " ";
            
        }
        
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
        ma = ma * basicSalary;
        double earningSalary = hra + da + ta + ma + basicSalary;
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
    
}
