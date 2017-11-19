public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance += depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > this.balance) {
            System.out.println("Withdrawal amount exceeded account balance.");
        } else if (withdrawalAmount <= 0) {
            System.out.println("Cannot withdraw 0 or negative amount");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println(withdrawalAmount + " successfully withdrawn from account balance");
        }
    }
}
