import java.util.*;
public class CalculatorWithSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison");
        int choice = sc.nextInt();

        switch(choice){
            case 1 :
            System.out.println("The addition is : " + (a+b));

            case 2 :
            System.out.println("The subtraction is : " + (a-b));

            case 3 :
            System.out.println("The multiplication is : " + (a*b));

            case 4 :
            System.out.println("The division is : " + (a/b));
        }
        sc.close();
    }
    
}
