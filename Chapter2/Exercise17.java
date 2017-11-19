import java.util.Scanner;

// (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
// user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
// shown in Fig. 2.15.

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        int smallest = firstNumber;
        if (smallest > secondNumber)
            smallest = secondNumber;
        if (smallest > thirdNumber)
            smallest = thirdNumber;

        int largest = firstNumber;
        if (largest < secondNumber)
            largest = secondNumber;
        if (largest < thirdNumber)
            largest = thirdNumber;

        System.out.println("The sum is: " + (firstNumber + secondNumber + thirdNumber));
        System.out.println("The average is: " + ((firstNumber + secondNumber + thirdNumber) / 3));
        System.out.println("The product is: " + (firstNumber * secondNumber * thirdNumber));

        if (smallest == largest) {
            System.out.println("The smallest and largest numbers are equal: " + smallest);
        } else {
            System.out.println("The smallest number  is: " + smallest);
            System.out.println("The largest number is: " + largest);
        }
    }
}
