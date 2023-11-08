package ADVANCED;
public class PrintDigits {
    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            printDigits(n / 10); 
            System.out.println(n % 10);
        }
    }

    public static void main(String[] args) {
        int number = 12; 
        System.out.println("Digits of " + number + ":");
        printDigits(number);
    }
}

