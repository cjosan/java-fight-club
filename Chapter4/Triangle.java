public class Triangle {

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) &&
                (side2 + side3 > side1) &&
                (side3 + side1 > side2);
    }

    public static boolean isValidRightTriangle(double side1, double side2, double side3) {
        return isValidTriangle(side1, side2, side3) && ((side1 * side1 == side2 * side2 + side3 * side3) ||
                (side2 * side2 == side1 * side1 + side3 * side3) ||
                (side3 * side3 == side1 * side1 + side2 * side2));
    }
}
