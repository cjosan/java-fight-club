import java.util.Scanner;

// (Largest and Smallest Integers) Write an application that reads five integers and determines
// and prints the largest and smallest integers in the group. Use only the programming techniques you
// learned in this chapter.

public class Exercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        int smallest = number1;
        int largest = number1;

        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;
        if (number4 < smallest)
            smallest = number4;
        if (number5 < smallest)
            smallest = number5;

        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        if (number4 > largest)
            largest = number4;
        if (number5 > largest)
            largest = number5;

        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);
    }
}
