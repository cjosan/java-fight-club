//        (Circle Area) Write an application that prompts the user for the radius of a circle and uses
//        a method called circleArea to calculate the area of the circle.

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = scanner.nextDouble();

        System.out.printf("The area of circle with radius %.2f is equal to %.2f", radius, circleArea(radius));
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
