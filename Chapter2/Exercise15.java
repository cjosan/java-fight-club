import java.util.Scanner;

// (Arithmetic) Write an application that asks the user to enter two integers, obtains them
// from the user and prints their sum, product, difference and quotient (division). Use the techniques
// shown in Fig. 2.7.

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int fNum = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int sNum = scanner.nextInt();

        System.out.println("The sum is " + (fNum + sNum));
        System.out.println("The difference is " + (fNum - sNum));
        System.out.println("The product is " + (fNum * sNum));
        System.out.println("The quotient is " + (fNum / sNum));
    }
}
