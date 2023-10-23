import java.util.*;

public class DiscountCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the total amount : ");
        double amt = sc.nextDouble();
        double dis = 0.0;

        if(amt>=1000 && amt<=5000){
            System.out.println("5% discount applicable on your purchase");
            dis = amt * 0.05;
        }
        else if(amt>=5000 && amt<=10000){
            System.out.println("10% discount applicable on your purchase");
            dis = amt * 0.10;
        }
        else if(amt>=10000 && amt<=20000){
            System.out.println("15% discount applicable on your purchase");
            dis = amt * 0.15;
        }
        else if(amt >= 20000){
            System.out.println("25% discount applicable on your purchase");
            dis = amt * 0.25;
        }
        else{
            System.out.println("Invalid Input");
        }

        double disamt = amt - dis;

        System.out.print("Amount : " + amt);
        System.out.print("\nDiscount Amount: "+dis);
        System.out.print("\nTotal Amount : " + disamt);

        sc.close();
    }
    
}
