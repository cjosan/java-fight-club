public class GasMileage {
    private int totalMiles;
    private int totalGallons;

    public double getMilesPerGallon(int miles, int gallons) {
        this.totalMiles += miles;
        this.totalGallons += gallons;

        return (double)miles / gallons;
    }

    public double getTotalMilesPerGallon() {
        return (double) totalMiles / totalGallons;
    }
}