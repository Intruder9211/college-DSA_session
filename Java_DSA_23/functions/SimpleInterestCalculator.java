
   /*  import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount, rate, and time in years
        System.out.print("Enter the principal amount: $");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        
        double simpleInterest = (principal * rate * time);

        System.out.println("Simple Interest: " + simpleInterest);

        
        scanner.close();
    }
} */



import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter the principal amount: $");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("Simple Interest: $" + simpleInterest);

        
        scanner.close();
    }

   
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time;
    }
}

