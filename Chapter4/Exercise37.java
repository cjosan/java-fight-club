//        a) Write an application that reads a non negative integer and computes and prints its factorial.
//        b) Write an application that estimates the value of the mathematical constant e by using
//        the following formula. Allow the user to enter the number of terms to calculate.
//        c) Write an application that computes the value of ex by using the following formula. Allow
//        the user to enter the number of terms to calculate.

import java.util.Scanner;

public class Exercise37 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calculating factorial");
        int number = enterNumber();
        System.out.println("The factorial of " + number + " is equal to "
                + MyMath.calculateFactorial(number) + "\n");

        System.out.println("Estimating e");
        number = enterNumber();
        System.out.println("The estimated value of e calculated from " + number
                + " terms is equal to " + MyMath.estimateE(10) + "\n");

        System.out.println("Estimating e to the power of x");
        number = enterNumber();
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.println("The estimated value of e to the power " + x + " calculated from "
                + number + " terms is equal to " + MyMath.calculateEToTheX(x, number) + "\n");
    }

    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a non negative integer: ");
            number = scanner.nextInt();
        } while (number < 0);

        return number;
    }
}
