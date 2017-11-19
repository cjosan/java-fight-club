//    (Find the Largest Number) The process of finding the largest value is used frequently in computer
//    applications. For example, a program that determines the winner of a sales contest would input
//    the number of units sold by each salesperson. The salesperson who sells the most units wins the contest.
//    Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines
//    and prints the largest integer. Your program should use at least the following three variables:
//    a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
//    input and to determine when all 10 numbers have been processed).
//    b) number: The integer most recently input by

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers");
        int largest = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            int number = scanner.nextInt();

            if (largest < number) {
                largest = number;
            }
        }

        System.out.println("The largest number is " + largest);
    }
}
