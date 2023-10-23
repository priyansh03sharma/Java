import java.util.*;
public class EvenOdd1toN {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What you want to print....... ");
        System.out.println("1.Even");
        System.out.println("2.Odd");
        System.out.println("Enter your choice(1/2) : ");
        int n=sc.nextInt();
        int i;

        switch(n){

            case 1 :
            System.out.print("Enter range: ");
            int z = sc.nextInt();
            for(i=2;i<=z;i++){
                if(i%2==0){
                    System.out.println(i);
                }
                
            }
            break;

            case 2 :
            System.out.print("Enter range: ");
            n = sc.nextInt();
            for(i=1;i<=n;i++){
                if(i%2 != 0){
                    System.out.println(i);
                }
            }    
        }    
        sc.close();    
    }
}
