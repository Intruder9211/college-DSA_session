import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the basic salary: $");
        double basicSalary = scanner.nextDouble();
        
        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTA(basicSalary);
        double pf = 1400; // Fixed PF
        
        double netSalary = basicSalary + hra + da + ta - pf;
        
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
        System.out.println("TA: $" + ta);
        System.out.println("PF: $" + pf);
        System.out.println("Net Salary: $" + netSalary);
        
        scanner.close();
    }
    
    // Function to calculate HRA (30% of basic salary)
    public static double calculateHRA(double basicSalary) {
        return 0.3 * basicSalary;
    }
    
    // Function to calculate DA (20% of basic salary)
    public static double calculateDA(double basicSalary) {
        return 0.2 * basicSalary;
    }
    
    // Function to calculate TA (10% of basic salary)
    public static double calculateTA(double basicSalary) {
        return 0.1 * basicSalary;
    }
}
