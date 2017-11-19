import java.util.Scanner;

// (Odd or Even) Write an application that reads an integer and determines and prints whether
// it’s odd or even.

public class Exercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

    }
}
