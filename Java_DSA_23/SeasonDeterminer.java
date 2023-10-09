import java.util.Scanner;

public class SeasonDeterminer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        String season = determineSeason(month);

        if (season != null) {
            System.out.println("The season associated with month " + month + " is " + season + ".");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }

    public static String determineSeason(int month) {
        String season;

        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "fall";
                break;
            default:
                season = null; // Invalid input
        }

        return season;
    }
}
