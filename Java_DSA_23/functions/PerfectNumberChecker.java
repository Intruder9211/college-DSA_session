import java.util.Scanner;

public class PerfectNumberChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        input.close();
    }

    static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false; // Perfect numbers are defined for positive integers.
        }

        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == num;
    }
}

