public class Employee {
    private double hours;
    private double pay;

    public Employee(double hours, double pay) {
        setHours(hours);
        setPay(pay);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0) {
            System.out.println("The number of worked hours can not be negative");
        } else {
            this.hours = hours;
        }
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        if (pay <= 0) {
            System.out.println("The sum of payment can not be negative or zero");
        } else {
            this.pay = pay;
        }
    }

    public double calculateGrossPay() {
        if (hours > 40) {
            return pay * 40 + pay * 1.5 * (hours - 40);
        } else {
            return pay * hours;
        }
    }
}
