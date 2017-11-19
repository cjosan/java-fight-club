//        (Square of Asterisks) Write an application that prompts the user to enter the size of the side
//        of a square, then displays a hollow square of that size made of asterisks. Your program should work
//        for squares of all side lengths between 1 and 20.

import java.util.Scanner;

public class Exercise29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side;

        do {
            System.out.print("Enter the size of square's side(1-20): ");
            side = scanner.nextInt();
        } while (side < 1 || side > 20);

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
