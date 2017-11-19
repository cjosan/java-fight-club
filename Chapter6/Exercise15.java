//        (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
//        a right triangle when the lengths of the other two sides are given. The method should take two arguments
//        of type double and return the hypotenuse as a double. Incorporate this method into an
//        Exercises 239
//        application that reads values for side1 and side2 and performs the calculation with the hypotenuse
//        method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
//        triangles in Fig. 6.15.

public class Exercise15 {

    public static void main(String[] args) {
        double[][] sides = {{3.0, 4.0}, {5.0, 12.0}, {8.0, 15.0}};
        System.out.println("Triangle\tSide1\t\tSide2\tHypotenuse");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d\t\t\t%.2f\t\t%.2f\t\t%.2f\n", i + 1, sides[i][0], sides[i][1],
                    Triangle.calculateHypotenuse(sides[i][0], sides[i][1]));
        }
    }
}
