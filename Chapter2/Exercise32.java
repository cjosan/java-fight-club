import java.util.Scanner;

// (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
// and prints the number of negative numbers input, the number of positive numbers input and
// the number of zeros input.

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeCount = 0, positiveCount = 0, zeroCount = 0;
        int[] numbers = new int[5];

        System.out.println("Enter five integers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] < 0)
                negativeCount++;
            else if (numbers[i] > 0)
                positiveCount++;
            else
                zeroCount++;
        }

        System.out.println("Positive count: " + positiveCount
                + "\nNegative count: " + negativeCount
                + "\nZero count: " + zeroCount);
    }
}
