import java.util.*;

public class SeasonDeterminer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month : ");
        String month = scanner.nextLine().toLowerCase(); 
        String season;

        switch (month) {
            case "december":
            case "january":
            case "february":
                season = "winter";
                break;
            case "march":
            case "april":
            case "may":
                season = "spring";
                break;
            case "june":
            case "july":
            case "august":
                season = "summer";
                break;
            case "september":
            case "october":
            case "november":
                season = "fall";
                break;
            default:
                season = "invalid";
        }

       
        System.out.println("The season associated with " + month + " is " + season + ".");
        

        scanner.close();
    }
}

