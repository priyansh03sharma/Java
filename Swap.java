import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter value of B : ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: A = " + a + ", B = " + b);
        sc.close();
    }
}

