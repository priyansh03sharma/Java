import java.util.*;

public class AreaofCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius of circle : ");
        int c = sc.nextInt();
        double area = 3.14*c*c;
        System.out.print("Area of circle is : " + area);
        sc.close();
    }
    
}
