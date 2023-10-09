import java.util.Scanner;

public class WeekdayOrWeekendChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week (1-7): ");
        int dayOfWeek = scanner.nextInt();

        String dayType = checkDayType(dayOfWeek);

        if (dayType != null) {
            System.out.println("Day " + dayOfWeek + " is a " + dayType + ".");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }

    public static String checkDayType(int dayOfWeek) {
        String dayType;

        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekday";
                break;
            case 6:
            case 7:
                dayType = "weekend day";
                break;
            default:
                dayType = null; // Invalid input
        }

        return dayType;
    }
}
