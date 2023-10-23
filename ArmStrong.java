import java.util.Scanner;

public class ArmStrong {

    public static int power(int pow){
        int power = length.num;
        int base = 3;
        long result = 1;
        while (length.num > 0) {
            result *= base;
            num--;
        }
        System.out.println(base + "^" + power + " = " + result);
    }

    public static int Arm(int num){
        int original = num;
        int sum = 0;
        int digits = 0;
        
        while (num > 0) {
            num = num / 10;
            digits++;
        }
        
        num = original;
        
        while (num > 0) {
            
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digits);
            num = num / 10;
        }
        
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        return sum;
    }

    public static int count(int num){
        int count = 0;

        while(num>0){
            num = num/10;
            count++;
        }

        System.out.println("The number of digits are : " + count);
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        Arm(num);       
        count(num); 
        power(pow);
    }
}
