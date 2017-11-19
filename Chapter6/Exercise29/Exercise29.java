//        (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
//        each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
//        the coin appears. Display the results. The program should call a separate method flip that takes no
//        arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
//        simulates coin tossing, each side of the coin should appear approximately half the time.]

import java.util.Scanner;

public class Exercise29 {
    private static boolean quit = false;
    private static int headsCount = 0;
    private static int tailsCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option: ");
        printMenu();

        while (!quit) {
            int option = scanner.nextInt();
            executeAction(option);
        }
    }

    public static void printMenu() {
        System.out.println("0 - Display options\n" +
                "1 - Toss Coin\n" +
                "2 - Display results\n" +
                "3 - Quit\n");
    }

    public static void executeAction(int option) {
        switch (option) {
            case 0:
                printMenu();
                break;
            case 1:
                tossCoin();
                break;
            case 2:
                displayResults();
                quit = true;
                break;
            case 3:
                quit = true;
                break;
            default:
                System.out.println("Choose a valid option please. Enter 0 to see all available options");
        }
    }

    public static void tossCoin() {
        Coin coin = Coin.flip();
        System.out.println(coin);

        if (coin == Coin.HEAD) {
            headsCount++;
        } else {
            tailsCount++;
        }
    }

    public static void displayResults() {
        System.out.println("Head appeared " + headsCount + " times\n" +
                "Tails appeared " + tailsCount + " times\n");
    }
}
