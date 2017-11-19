public class Customer {
    public static double totalCharges;
    private double hours;

    public Customer(double hours) {
        this.hours = hours;
        totalCharges += calculateCharges();
    }

    public double getHours() {
        return hours;
    }

    public double calculateCharges() {
        double charges = 2;

        if (hours == 24) {
            charges = 10;
        } else if (hours > 3) {
            charges += Math.ceil(hours - 3) * 0.5;
        }

        return charges;
    }
}
