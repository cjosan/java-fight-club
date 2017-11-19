import java.util.Scanner;

// (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
// the two largest values of the 10 values entered. [Note: You may input each number only once.]

public class Exercise23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0, secondLargest = 0;
        int zeroCount = 0;

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            while (true) {
                int number = input.nextInt();

                if (number == 0 && zeroCount < 1) {
                    numbers[i] = number;
                    zeroCount++;
                    break;
                }

                if (contains(numbers, number)) {
                    System.out.println(number + " is already in the list. Please enter another value!");
                } else {
                    numbers[i] = number;
                    break;
                }
            }

            if (largest < numbers[i]) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (secondLargest < numbers[i]) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Largest number: " + largest +
                "\nSecond largest number: " + secondLargest);
    }

    public static boolean contains(int[] array, int value) {
        for (int number : array) {
            if (value == number)
                return true;
        }

        return false;
    }

}
