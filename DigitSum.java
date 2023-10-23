import java.util.*;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,i=0;
        System.out.print("Enter number:");
        k=sc.nextInt();
        while(k!=0)
        {
            i+=k%10;
            k=k/10;
        }
        System.out.println("The sum of digits is: "+i);
        sc.close();
       
    } 
    
}

