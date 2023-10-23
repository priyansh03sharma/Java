import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int c=n;
        int rev=0;

        while(n>0){
            int digit = n % 10;
            rev = (rev*10) + digit;
            n = n/10;
        }

        if(c == rev){
            System.out.println(c + " is palindrome.");
        }
        else{
            System.out.println(c + " is not palindrome.");
        }

        sc.close();
    }
    
}