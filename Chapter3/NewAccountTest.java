import java.util.Scanner;

// Once you’ve completed displayAccount’s declaration, modify main to replace the statements
// that display each Account’s name and balance with calls to displayAccount—each receiving as its
// argument the account1 or account2 object, as appropriate. Then, test the updated AccountTest
// class to ensure that it produces the same output as shown in Fig. 3.9.

public class NewAccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);

        displayAccount(account1);
        displayAccount(account2);
    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: %.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
