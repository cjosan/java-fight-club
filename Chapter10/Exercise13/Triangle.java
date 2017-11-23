public class Triangle extends TwoDimensionalShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws InvalidTriangleException {
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new InvalidTriangleException("Can not create triangle with given sides");
        }
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) throws InvalidTriangleException {
        super(color, filled);
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new InvalidTriangleException("Can not create triangle with given sides");
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) &&
                (side2 + side3 > side1) &&
                (side3 + side1 > side2);
    }

}
