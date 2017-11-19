public class CustomerAccount {
    private int accountNumber;
    private int balance;
    private int charges;
    private int credits;
    private int creditLimit;

    public CustomerAccount(int accountNumber, int balance, int charges, int credits, int creditLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.charges = charges;
        this.credits = credits;
        this.creditLimit = creditLimit;
        limitExceeded();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getCharges() {
        return charges;
    }

    public int getCredits() {
        return credits;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void addCharge(int charges) {
        this.charges += charges;
        System.out.println(charges + " added to charges of customer with id " + accountNumber);
        limitExceeded();
    }

    public void addCredit(int credits) {
        this.credits += credits;
        System.out.println(charges + " added to credits of customer with id " + accountNumber);
        limitExceeded();
    }

    public int calculateBalance() {
        return balance - charges + credits;
    }

    public boolean limitExceeded() {
        boolean exceeded = calculateBalance() < this.creditLimit;
        if (exceeded) {
            System.out.println("Credit limit exceeded");
        }
        return exceeded;
    }
}
