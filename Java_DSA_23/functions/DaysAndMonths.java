public class DaysAndMonths {
    public static void printDaysOfWeek() {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Days of the Week:");
        for (String day : daysOfWeek) {
            System.out.println(day);
        }
    }

    public static void printMonthsOfYear() {
        String[] monthsOfYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Months of the Year:");
        for (String month : monthsOfYear) {
            System.out.println(month);
        }
    }

    public static void main(String[] args) {
        printDaysOfWeek();
        System.out.println();
        printMonthsOfYear();
    }
}
