public abstract class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape() {
    }

    public TwoDimensionalShape(String color, boolean filled) {
        super(color, filled);
    }

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return super.toString() + String.format("\nPerimeter: %.2f\nArea: %.2f", getPerimeter(), getArea());
    }
}
