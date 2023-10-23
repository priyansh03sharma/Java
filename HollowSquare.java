import java.util.*;
public class HollowSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for(int j=0;j<=n;j++){
                if( i == 1 || i== n || j==1 || j== n-1){
                    System.out.println("* ");
                }
            }
            
        }
        System.out.println();

        sc.close();
    }
}
