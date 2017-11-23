//        (Savings Account Class) Create class SavingsAccount. Use a static variable annualInterestRate
//        to store the annual interest rate for all account holders. Each object of the class contains a
//        private instance variable savingsBalance indicating the amount the saver currently has on deposit.
//        Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
//        savingsBalance by annualInterestRate divided by 12—this interest should be added to savings-
//        Balance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new
//        value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
//        saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
//        to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
//        both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
//        the new balances for both savers.

public class SavingsAccountTest {

    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount(2000.0);
        SavingsAccount account2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(4.0);

        for (int i = 0; i < 12; i++) {
            account1.calculateMonthlyInterest();
            account2.calculateMonthlyInterest();
        }

        System.out.println("Accounts balances after 12 months with interest rate 4%:\n" +
                "Account 1: " + account1 + "\n" +
                "Account 2: " + account2 + "\n");

        SavingsAccount.modifyInterestRate(5.0);
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        System.out.println("Accounts balances after one month with interest rate 5%:\n" +
                "Account 1: " + account1 + "\n" +
                "Account 2: " + account2 + "\n");
    }
}
