import java.util.*;

public class TaxCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your salary : ");
        double salary = sc.nextDouble();
        double tax = 0.0;

        if(salary <= 10000){
            System.out.println("No Tax apply");
            tax = 0.0;
        }
        else if(salary>=10000 && salary<=20000){
            System.out.println("10% tax applicable on your salary");
            tax = salary * 0.10;
        }
        else if(salary>=20000 && salary<=30000){
            System.out.println("15% tax applicable on your salary");
            tax = salary * 0.15;
        }
        else if(salary >= 30000){
            System.out.println("25% discount applicable on your salary");
            tax = salary * 0.25;
        }

        double actsalary = salary - tax;

        System.out.print("salary : " + salary);
        System.out.print("\nTax : "+ tax);
        System.out.print("\nActual Salary : " + actsalary);

        sc.close();
    }
    
}
