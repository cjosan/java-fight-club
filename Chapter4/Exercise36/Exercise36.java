//        (Sides of a Right Triangle) Write an application that reads three nonzero integers and determines
//        and prints whether they could represent the sides of a right triangle.

import java.util.Scanner;

public class Exercise36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;

        do {
            System.out.println("Enter three nonzero values for sides of a triangle");
            side1 = scanner.nextDouble();
            side2 = scanner.nextDouble();
            side3 = scanner.nextDouble();
        } while (side1 <= 0 || side2 <= 0 || side3 <= 0);

        if (Triangle.isValidRightTriangle(side1, side2, side3)) {
            System.out.println("These values could represent a right triangle");
        } else {
            System.out.println("These values could not represent a right triangle");
        }
    }
}
