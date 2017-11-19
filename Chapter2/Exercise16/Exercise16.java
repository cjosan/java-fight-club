import java.util.Scanner;

// (Comparing Integers) Write an application that asks the user to enter two integers, obtains
// them from the user and displays the larger number followed by the words "is larger". If the numbers
// are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int fNum = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int sNum = scanner.nextInt();

        if (fNum > sNum) {
            System.out.println(fNum + " is larger");
        } else if (sNum > fNum) {
            System.out.println(sNum + " is larger");
        } else {
            System.out.println("These numbers are equal");
        }
    }
}
