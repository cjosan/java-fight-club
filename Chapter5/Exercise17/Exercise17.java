//        (Calculating Sales) An online retailer sells five products whose retail prices are as follows:
//        Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
//        Write an application that reads a series of pairs of numbers as follows:
//        a) product number
//        b) quantity sold
//        Your program should use a switch statement to determine the retail price for each product. It
//        should calculate and display the total retail value of all products sold. Use a sentinel-controlled
//        loop to determine when the program should stop looping and display the final results.

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] quantitiesSold = new int[5];
        char quit = 'y';
        while (quit != 'n') {
            System.out.print("Enter product number(1-5): ");
            int index;
            while (true) {
                index = scanner.nextInt();

                if (index < 1 || index > 5) {
                    System.out.print("The value should be one of (1-5): ");
                } else
                    break;
            }

            System.out.print("Enter the quantity sold: ");
            int quantity = scanner.nextInt();
            quantitiesSold[--index] += quantity;

            scanner.nextLine(); // get the new line character from nextInt()
            do {
                System.out.print("Do you want to continue?(y/n)");
                quit = Character.toLowerCase(scanner.nextLine().charAt(0));
            } while (quit != 'y' && quit != 'n');
        }

        double totalValue = 0;
        for (int i = 0; i < quantitiesSold.length; i++) {
            totalValue += quantitiesSold[i] * getPrice(i + 1);
        }
        System.out.println("The retail value of all products sold is " + totalValue);
    }

    public static double getPrice(int product) {
        switch (product) {
            case 1:
                return 2.98;
            case 2:
                return 4.50;
            case 3:
                return 9.98;
            case 4:
                return 4.49;
            case 5:
                return 6.87;
            default:
                return -1;
        }
    }
}
