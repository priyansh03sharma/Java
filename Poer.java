import java.util.*;
public class Poer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power :");
        int n = sc.nextInt();
        
        int power = n;
        int base = 3;
        long result = 1;
        while (n > 0) {
            result *= base;
            n--;
        }
        System.out.println(base + "^" + power + " = " + result);

        sc.close();
            
    }
}
    
