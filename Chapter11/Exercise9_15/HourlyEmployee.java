public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        setHours(hours);
        setWage(wage);
    }

    public void setWage(double wage) {
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");

        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0 and <= 168.0");

        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return String.format("Hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "Hourly wage", getWage(),
                "Hours worked", getHours());
    }
}
