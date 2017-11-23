public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        if (savingsBalance >= 0) {
            this.savingsBalance = savingsBalance;
        } else {
            throw new IllegalArgumentException("Cannot create account with negative balance.");
        }
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        if (newInterestRate >= 0) {
            annualInterestRate = newInterestRate;
        } else {
            throw new IllegalArgumentException("Interest rate must not be negative.");
        }

    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * annualInterestRate / 1200.0;
    }

    @Override
    public String toString() {
        return String.format("%.2f", savingsBalance);
    }
}
