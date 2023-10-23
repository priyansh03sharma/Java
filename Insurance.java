import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the person's name: ");
        String personName = scanner.nextLine();

        System.out.print("Enter the person's gender (male/female): ");
        String personGender = scanner.nextLine();

        System.out.print("Enter the person's age: ");
        int personAge = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter the person's city (metro/non-metro): ");
        String personCity = scanner.nextLine();

        // Calculate premium and display the result
        int premium = calculatePremium(personAge, personGender, personCity);
        displayPremium(personName, premium);

        scanner.close();
    }

    // Function to calculate the insurance premium
    public static int calculatePremium(int age, String gender, String city) {
        if (age >= 25 && age <= 35 && gender.equals("male") && city.equals("metro")) {
            return 6;
        } else if (age >= 25 && age <= 40 && gender.equals("male") && city.equals("non-metro")) {
            return 4;
        } else if (age >= 25 && age <= 42 && gender.equals("female") && city.equals("metro")) {
            return 3;
        } else if (age >= 25 && age <= 45 && gender.equals("female") && city.equals("non-metro")) {
            return 2;
        } else {
            return -1; 
        }
    }

    // Function to display the insurance premium result
    public static void displayPremium(String name, int premium) {
        if (premium != -1) {
            System.out.println("Premium for " + name + ": " + premium + "%");
        } else {
            System.out.println("Not insured");
        }
    }
}
