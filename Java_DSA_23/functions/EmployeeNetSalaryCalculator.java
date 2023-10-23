import java.util.Scanner;

public class EmployeeNetSalaryCalculator {

    public static double calculateNetSalary(double basicSalary) {
        double hra = basicSalary * 0.3;
        double da = basicSalary * 0.2;
        double ta = basicSalary * 0.1;
        double grossSalary = basicSalary + hra + da + ta;
        double pf = 1400;
        double netSalary = grossSalary - pf;
        return netSalary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        double netSalary = calculateNetSalary(basicSalary);

        System.out.println("The net salary of the employee is: " + netSalary);
    }
}
