public class Bicycle implements CarbonFootprint {
    public static final double CARBON_PER_GALLON = 19.4;
    public static final double OTHER_GASES = 100.0 / 95;

    private String type;
    private String color;
    private double milesDriven;
    private double fuelEfficiency;

    public Bicycle(String type, String color, double milesDriven, double fuelEfficiency) {
        this.type = type;
        this.color = color;
        this.milesDriven = milesDriven;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public String toString() {
        return type + " " + color + " bicycle";
    }

    @Override
    public double getCarbonFootprint() {
        return milesDriven / fuelEfficiency * CARBON_PER_GALLON * OTHER_GASES;
    }
}
