//        (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
//        For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
//        and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
//        If the number is not five digits long, display an error message and allow the user to enter
//        a new value.

import java.util.Scanner;

public class Exercise30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a five-digit integer");
            number = scanner.nextInt();
        } while (!isFiveDigit(number));

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }

    public static boolean isFiveDigit(int number) {
        int count = 0;

        while(number > 0) {
            number /= 10;
            count++;
        }

        return count == 5;
    }


    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int numberValue = number;

        while (number > 0) {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }

        return reversedNumber == numberValue;
    }
}
