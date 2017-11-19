//        (Credit Limit Calculator) Develop a Java application that determines whether any of several
//        department-store customers has exceeded the credit limit on a charge account. For each customer,
//        the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
//        the message "Credit limit exceeded".

public class Exercise18 {
    public static void main(String[] args) {
        CustomerAccount customer = new CustomerAccount(1, 3000, 400, 200, -100);
        System.out.println("Balance: " + customer.calculateBalance() + "\tCredit Limit: " + customer.getCreditLimit() + "\n");
        customer.addCharge(4000);
        System.out.println("Balance: " + customer.calculateBalance() + "\tCredit Limit: " + customer.getCreditLimit() + "\n");
        customer.addCredit(2000);
        System.out.println("Balance: " + customer.calculateBalance() + "\tCredit Limit: " + customer.getCreditLimit() + "\n");
        System.out.println();
    }
}
