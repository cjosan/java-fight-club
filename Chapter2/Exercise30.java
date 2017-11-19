import java.util.Scanner;

// (Separating the Digits in an Integer) Write an application that inputs one number consisting
// of five digits from the user, separates the number into its individual digits and prints the digits
// separated from one another by three spaces each.

public class Exercise30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 5 digits number");
        int number = scanner.nextInt();

        int denominator = 10000;
        while (number > 0) {
            System.out.print(number / denominator + " ");
            number %= denominator;
            denominator /= 10;
        }
    }
}