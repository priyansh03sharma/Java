import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            
            int c = a + b;

            System.out.print(c + " ");

            a = b;
            b = c;
        }
        scanner.close();
    }
}