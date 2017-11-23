public abstract class ThreeDimensionalShape extends Shape{
    public ThreeDimensionalShape() {
    }

    public ThreeDimensionalShape(String color, boolean filled) {
        super(color, filled);
    }

    public abstract double getVolume();

    @Override
    public String toString() {
        return super.toString() + String.format("\nSurface: %.2f\nVolume: %.2f", getArea(), getVolume());
    }
}
