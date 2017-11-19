import java.util.Scanner;

//        (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
//        total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//        these items are as follows:
//        Item Value
//        1 239.99
//        2 129.75
//        3 99.95
//        4 350.89
//        Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
//        displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.

public class Exercise19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalesPerson salesPerson = new SalesPerson();
        int item;

        while (true){
            System.out.println("Enter item's index(1-4) sold by salesperson or -1 to see the earnings");
            item = scanner.nextInt();

            if (item < 0)
                break;

            if (item < 1 || item > 4) {
                System.out.println("Item index should be in range 1-4");
                continue;
            }

            ++salesPerson.getSoldItems()[item - 1];
        }

        System.out.printf("The salesperson earns $%.2f", salesPerson.getEarnings());
    }
}
