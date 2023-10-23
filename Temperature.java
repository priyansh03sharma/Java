import java.util.*;
public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("In which format you want to find temperature : ");
        System.out.println("For Celcius, press 1");
        System.out.println("For Fahrenheit, press 2");
        int press = sc.nextInt();
        double temperature;

        if(press == 1){
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = sc.nextDouble();
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        }
        else if(press == 2){
            System.out.print("Enter temperature in Celsius: ");
            temperature = sc.nextDouble();
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        }
        else{
            System.out.println("Wrong choice.");
        }
        sc.close();
    }
    
}
