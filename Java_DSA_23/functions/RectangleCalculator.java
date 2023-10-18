import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

       
        double area = calculateRectangleArea(length, width);
        double perimeter = calculateRectanglePerimeter(length, width);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Close the scanner
        scanner.close();
    }

    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    
    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
