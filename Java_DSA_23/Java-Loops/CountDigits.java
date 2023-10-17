import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0; // Initialize a count variable to 0

        // Handle negative numbers by taking the absolute value
        if (number < 0) {
            number = Math.abs(number);
        }

        // Count the digits using a loop
        while (number > 0) {
            number /= 10; // Remove the last digit
            count++; // Increment the count
        }

        System.out.println("The number of digits in the integer is: " + count);

        scanner.close();
    }
}
