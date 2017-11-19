//        (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to receive
//        a second parameter of type char called fillCharacter. Form the square using the char provided
//        as an argument.

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of square: ");
        int side = scanner.nextInt();
        System.out.print("Enter the character to fill the square: ");
        char fillCharacter = scanner.next().charAt(0);

        drawSquare(side, fillCharacter);
    }

    public static void drawSquare(int size, char fillCharacter) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(fillCharacter + " ");
            }
            System.out.println();
        }
    }
}
