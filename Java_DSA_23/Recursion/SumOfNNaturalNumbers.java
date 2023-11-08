package ADVANCED;

public class SumOfNNaturalNumbers {
    public static int sumOfNNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfNNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        int sum = sumOfNNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
