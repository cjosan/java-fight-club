//        (Dice Rolling) Write an application to simulate the rolling of two dice. The application
//        should use an object of class Random once to roll the first die and again to roll the second die. The
//        sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
//        the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
//        least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
//        should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
//        each possible sum appears. Display the results in tabular format.

import java.util.Random;

public class Exercise17 {

    public static void main(String[] args) {
        int[] rollSums = new int[11];

        for (int i = 0; i < 36000000; i++) {
            int sum = rollDice() + rollDice() - 2;

            ++rollSums[sum];
        }

        printTable(rollSums);
    }

    public static void printTable(int[] array) {
        System.out.println("Sum\tFrequency");

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 2 + "\t" + array[i]);
        }
    }

    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
