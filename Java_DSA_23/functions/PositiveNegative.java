public class PositiveNegative {

    public static String checkNumber(int number) {
        if (number > 0) {
            return "Positive Number";
        } else if (number < 0) {
            return "Negative Number";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        int number = 10;

        String result = checkNumber(number);

        System.out.println(result);
    }
}
