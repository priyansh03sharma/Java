import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int digit;

        System.out.print("The reverse is : ");
        while(n>0){
            digit = n % 10;
            System.out.print(digit);
            n = n/10;
        }

        sc.close();
    }
    
}
