import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = calculateIncomeTax(income);

        if (tax == 0) {
            System.out.println("No tax is applicable for income below 10k.");
        } else {
            System.out.println("Income tax to be paid: $" + tax);
        }

        scanner.close();
    }

    public static double calculateIncomeTax(double income) {
        double tax = 0;

        if (income < 10000) {
            // No tax for income below 10k
            tax = 0;
        } else if (income >= 10000 && income <= 20000) {
            // 10% tax for income between 10k and 20k
            tax = 0.10 * (income - 10000);
        } else if (income > 20000 && income <= 30000) {
            // 15% tax for income between 20k and 30k
            tax = 0.10 * (20000 - 10000) + 0.15 * (income - 20000);
        } else {
            // 25% tax for income above 30k
            tax = 0.10 * (20000 - 10000) + 0.15 * (30000 - 20000) + 0.25 * (income - 30000);
        }

        return tax;
    }
}
