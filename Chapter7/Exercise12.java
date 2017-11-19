//        (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
//        Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
//        is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
//        in which all five numbers are different. Use the smallest possible array to solve this problem. Display
//        the complete set of unique values input after the user enters each new value.

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers between 10 and 100 inclusive");
        int count = 0;
        while (count < 5) {
            int newNumber = input.nextInt();

            if (newNumber < 10 || newNumber > 100) {
                System.out.println("Enter a number between 10 and 100 please");
                continue;
            }

            if (contains(numbers, newNumber)) {
                System.out.println(newNumber + " is already in the list");
                continue;
            }

            numbers[count] = newNumber;
            count++;
            printDistinctValues(numbers);
        }
    }

    public static boolean contains(int[] array, int element) {
        for (int e : array) {
            if (e == element) {
                return true;
            }
        }
        return false;
    }

    public static void printDistinctValues(int[] array) {
        System.out.print("Distinct valid numbers entered are: ");
        for (int e : array) {
            if (e != 0)
                System.out.print(e + "\t");
        }
        System.out.println();
    }
}
