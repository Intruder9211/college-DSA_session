//without function
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input hourly wage and hours worked
        System.out.print("Enter hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked in a month: ");
        double hoursWorked = scanner.nextDouble();

        // Calculate the monthly salary
        double monthlySalary = hourlyWage * hoursWorked;

        System.out.println("Your monthly salary is: $" + monthlySalary);

        // Close the scanner
        scanner.close();
    }
}
