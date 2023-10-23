import java.util.*;
public class Swap2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter value of B : ");
        int b = sc.nextInt();

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("After Swapping : A = "+a+" , B = "+b );
        sc.close();
    }
    
}
