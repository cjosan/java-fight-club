import java.util.Scanner;

// (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw
// that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
// the Account’s balance. If it does, the balance should be left unchanged and the method should print
// a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
// (Fig. 3.9) to test method withdraw.

public class AccountTest {

    public static void main(String[] args) {
	    Account account1 = new Account("Jane Green", 50.00);
	    Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawal amount for account1: ");
        double amount = input.nextDouble();
        account1.withdraw(amount);

        System.out.print("Enter withdrawal amount for account2: ");
        amount = input.nextDouble();
        account2.withdraw(amount);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
    }
}
