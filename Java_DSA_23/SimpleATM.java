import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double accountBalance = 1000.0; // Initial account balance

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is $" + accountBalance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        accountBalance += depositAmount;
                        System.out.println("Deposit successful. Your new balance is $" + accountBalance);
                    } else {
                        System.out.println("Invalid deposit amount. Please enter a positive amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= accountBalance) {
                        accountBalance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Your new balance is $" + accountBalance);
                    } else if (withdrawAmount <= 0) {
                        System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
                    } else {
                        System.out.println("Insufficient balance. Your current balance is $" + accountBalance);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the ATM. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-4).");
                    break;
            }
        }
    }
}
