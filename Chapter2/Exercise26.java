import java.util.Scanner;

// (Multiples) Write an application that reads two integers, determines whether the first is a
// multiple of the second and prints the result.

public class Exercise26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers");
        int fNum = scanner.nextInt();
        int sNum = scanner.nextInt();

        if (fNum % sNum == 0) {
            System.out.println(fNum + " is a multiple of " + sNum);
        } else {
            System.out.println(fNum + " is not a multiple of " + sNum);
        }
    }
}
