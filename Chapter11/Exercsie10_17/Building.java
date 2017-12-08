public class Building implements CarbonFootprint {
    public static final double ELECTRICITY_EMISSIONS_FACTOR = 1.37;
    public static final double FUEL_EMISSIONS_FACTOR = 12.17;

    private String city;
    private int stages;
    private String heatingType;
    private double fuelAmount;
    private int energyConsumption;

    public Building(String city, int stages, String heatingType, double fuelAmount, int energyConsumption) {
        this.city = city;
        this.stages = stages;
        this.heatingType = heatingType;
        this.fuelAmount = fuelAmount;
        this.energyConsumption = energyConsumption;
    }

    @Override
    public String toString() {
        return "Building with " + stages + " stages situated in " + city;
    }

    @Override
    public double getCarbonFootprint() {
        return (energyConsumption * ELECTRICITY_EMISSIONS_FACTOR + fuelAmount * FUEL_EMISSIONS_FACTOR) * 12;
    }
}
