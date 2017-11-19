//        (Bar Chart Printing Program) One interesting application of computers is to display
//        graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//        number that’s read, your program should display the same number of adjacent asterisks. For example,
//        if your program reads the number 7, it should display *******. Display the bars of asterisks after
//        you read all five numbers.

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five integers between 1 and 30");
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                int number = scanner.nextInt();

                if (number < 1 || number > 30) {
                    System.out.println("The value should be in range 1-30");
                } else {
                    numbers[i] = number;
                    break;
                }
            }
        }

        System.out.println("\nBar Chart:");
        for (int number : numbers) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
