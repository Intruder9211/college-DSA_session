import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
        
        input.close();
    }

    static boolean isPerfectSquare(long num) {
        if (num < 0) {
            return false; // Negative numbers are not perfect squares.
        }

        long sqrt = (long) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
