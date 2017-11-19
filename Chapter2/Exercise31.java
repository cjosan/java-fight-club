// (Table of Squares and Cubes) Using only the programming techniques you learned in this
// chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
// prints the resulting values in table format, as shown below.

public class Exercise31 {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d\t\t%d\t\t%d\n", i, i * i, (int) Math.pow(i, 3));
        }
    }
}
