public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Cube(double side) {

        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public double getArea() {
        return 6.0 * side * side;
    }
}
