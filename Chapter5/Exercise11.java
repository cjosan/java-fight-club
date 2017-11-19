//        (Find the Smallest Value) Write an application that finds the smallest of several integers.
//        Assume that the first value read specifies the number of values to input from the user.

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of values to enter: ");
        int count = scanner.nextInt();

        System.out.println("Enter " + count + " integers");
        int smallest = scanner.nextInt();
        for (int i = 1; i < count; i++) {
            int number = scanner.nextInt();

            if (smallest > number) {
                smallest = number;
            }
        }

        System.out.println("The smallest value you entered is " + smallest);
    }
}
