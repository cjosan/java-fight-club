public class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    public Tetrahedron(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Tetrahedron(double side) {

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
        return side * side * side / 6 * Math.sqrt(2);
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side;
    }
}
