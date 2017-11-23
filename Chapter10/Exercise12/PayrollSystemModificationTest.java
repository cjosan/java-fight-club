//        (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include private
//        instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s
//        birthday. Add get methods to class Date. Assume that payroll is processed once per month.
//        Create an array of Employee variables to store references to the various employee objects. In a loop,
//        calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
//        payroll amount if the current month is the one in which the Employee’s birthday occurs.

public class PayrollSystemModificationTest {

    public static void main(String[] args) {
        Employee[] employees = {new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",
                5000, .04, 300, new Date(1, 20, 1990)),
                new CommissionEmployee("Sue", "Jones", "333-33-3333",
                        10000, .06, new Date(5, 21, 2000)),
                new HourlyEmployee("Karen", "Price", "222-22-2222",
                        16.75, 40, new Date(8, 28, 1995)),
                new SalariedEmployee("John", "Smith", "111-11-1111",
                        800.00, new Date(11, 10, 1993))};

        for (Employee employee : employees) {
            System.out.println(employee + "\nEarnings: " + employee.earnings() + "\n");
        }
    }
}
