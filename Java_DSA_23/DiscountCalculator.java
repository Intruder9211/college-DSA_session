import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total bill amount: ");
        double totalBill = scanner.nextDouble();

        double discount = calculateDiscount(totalBill);
        double discountedAmount = totalBill - discount;

        System.out.println("\nBill Receipt");
        System.out.println("Total Bill Amount: $" + totalBill);
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Discounted Amount: $" + discountedAmount);

        scanner.close();
    }

    public static double calculateDiscount(double totalBill) {
        double discount = 0;

        if (totalBill >= 1000 && totalBill < 5000) {
            // 5% discount for bill between 1k and 5k
            discount = 0.05 * totalBill;
        } else if (totalBill >= 5000 && totalBill < 10000) {
            // 10% discount for bill between 5k and 10k
            discount = 0.10 * totalBill;
        } else if (totalBill >= 10000 && totalBill <= 20000) {
            // 15% discount for bill between 10k and 20k
            discount = 0.15 * totalBill;
        } else if (totalBill > 20000) {
            // 25% discount for bill above 20k
            discount = 0.25 * totalBill;
        }

        return discount;
    }
}
