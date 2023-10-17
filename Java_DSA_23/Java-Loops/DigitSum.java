import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int originalNumber = number; // Store the original number for later use
        int sum = 0;

        // Handle negative numbers by taking the absolute value
        if (number < 0) {
            number = Math.abs(number);
        }

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        System.out.println("The sum of digits in " + originalNumber + " is: " + sum);

        scanner.close();
    }
}
