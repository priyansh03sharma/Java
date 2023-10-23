import java.util.*;
public class CalculatorwithFunction {
    
    public static int add(int num1, int num2){
        System.out.println("The addition is: ");
        return(num1 + num2);
    }
    
    public static int sub(int num1, int num2){
        System.out.println("The subtraction is: ");
        return(num1 - num2);
    }

    public static int mul(int num1, int num2){
        System.out.println("The multiplication is: ");
        return(num1 * num2);
    }

    public static int div(int num1, int num2){
        System.out.println("The division is: ");
        return(num1 / num2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("\nEnter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter operation you want to perform(+,-,*,/) : ");
        char ch = sc.next().charAt(0);
        switch(ch){
            //addition
            case '+':System.out.println(add(a,b));
            break;

            //substraction
            case '-' :System.out.println(sub(a,b));
            break;

            //multiplication
            case '*' :System.out.println(mul(a,b));
            break;

            //division
            case '/' : System.out.println(div(a,b));
            break;
        }
        
        sc.close();
    }
}
