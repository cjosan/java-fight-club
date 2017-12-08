public class Car implements CarbonFootprint {
    public static final double CARBON_PER_GALLON = 19.4;
    public static final double OTHER_GASES = 100.0 / 95;

    private String model;
    private String ID;
    private double milesDriven;
    private double fuelEfficiency;

    public Car(String model, String ID, double milesDriven, double fuelEfficiency) {
        this.model = model;
        this.ID = ID;
        this.milesDriven = milesDriven;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public String toString() {
        return model + " car model with ID: " + ID;
    }

    @Override
    public double getCarbonFootprint() {
        return milesDriven / fuelEfficiency * CARBON_PER_GALLON * OTHER_GASES;
    }
}
