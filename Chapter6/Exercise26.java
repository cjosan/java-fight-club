//        (Reversing Digits) Write a method that takes an integer value and returns the number with
//        its digits reversed. For example, given the number 7631, the method should return 1367. Incorporate
//        the method into an application that reads a value from the user and displays the result.

import java.util.Scanner;

public class Exercise26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String number = scanner.nextLine();

        if (reverse(number) != null) {
            System.out.println("The reverse of " + number + " is " + reverse(number));
        } else {
            System.out.println("The number you entered is invalid.");
        }
    }

    public static String reverse(String number) {
        String reversedNumber = "";

        for (int i = number.length() - 1; i >= 0 ; i--) {
            if (!Character.isDigit(number.charAt(i)))
                return null;

            reversedNumber += number.charAt(i);
        }

        return reversedNumber;
    }
}
