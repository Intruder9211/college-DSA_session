public class TriangleType {

    public static String checkTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilateral Triangle";
        } else if (a == b || b == c || c == a) {
            return "Isosceles Triangle";
        } else {
            return "Scalene Triangle";
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;

        String triangleType = checkTriangleType(a, b, c);

        System.out.println(triangleType);
    }
}
