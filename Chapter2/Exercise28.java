import java.util.Scanner;

// Write an application that inputs from the user the radius of a circle
// as an integer and prints the circle’s diameter, circumference and area using the floating-point value
// 3.14159 for π.

public class Exercise28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        int radius = scanner.nextInt();

        System.out.printf("The diameter of circle is %.2f\n", 2.0 * radius);
        System.out.printf("The circumference of circle is %.2f\n", 2.0 * Math.PI * radius);
        System.out.printf("The area of circle is %.2f\n", Math.PI * Math.pow(radius, 2));
    }
}
