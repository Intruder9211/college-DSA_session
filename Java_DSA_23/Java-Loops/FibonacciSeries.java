import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int numTerms = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series (first " + numTerms + " terms): ");
        for (int i = 0; i < numTerms; i++) {
            if (i == 0) {
                System.out.print(firstTerm + " ");
            } else if (i == 1) {
                System.out.print(secondTerm + " ");
            } else {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(nextTerm + " ");
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }

        scanner.close();
    }
}
