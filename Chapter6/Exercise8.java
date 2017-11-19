//        (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
//        hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
//        hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
//        longer than 24 hours at a time. Write an application that calculates and displays the parking charges
//        for each customer who parked in the garage yesterday. You should enter the hours parked for each
//        customer. The program should display the charge for the current customer and should calculate and
//        display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
//        the charge for each customer.

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the hours parked or -1 to quit: ");
            double hours = scanner.nextDouble();
            if (hours < 0) {
                break;
            }

            Customer customer = new Customer(hours);
            System.out.println("The customer should pay $" + customer.calculateCharges());
        }

        System.out.println("The total of yesterday's receipts is equal to $" + Customer.totalCharges);
    }
}
