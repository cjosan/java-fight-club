public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public Sphere(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return getArea() * radius / 3.0;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
}
