//        Sides of a Triangle) Write an application that reads three nonzero values entered by the
//        user and determines and prints whether they could represent the sides of a triangle.

import java.util.Scanner;

public class Exercise35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;

        do {
            System.out.println("Enter three nonzero values for sides of a triangle");
            side1 = scanner.nextDouble();
            side2 = scanner.nextDouble();
            side3 = scanner.nextDouble();
        } while (side1 <= 0 || side2 <= 0 || side3 <= 0);

        if (Triangle.isValidTriangle(side1, side2, side3)) {
            System.out.println("These values could represent a triangle");
        } else {
            System.out.println("These values could not represent a triangle");
        }
    }
}
