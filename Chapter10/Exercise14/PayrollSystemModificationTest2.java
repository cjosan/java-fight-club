//        (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include an
//        additional Employee subclass PieceWorker that represents an employee whose pay is based on the
//        number of pieces of merchandise produced. Class PieceWorker should contain private instance
//        variables wage (to store the employee’s wage per piece) and pieces (to store the number of pieces
//        produced). Provide a concrete implementation of method earnings in class PieceWorker that calculates
//        the employee’s earnings by multiplying the number of pieces produced by the wage per
//        piece. Create an array of Employee variables to store references to objects of each concrete class in
//        the new Employee hierarchy. For each Employee, display its String representation and earnings.

public class PayrollSystemModificationTest2 {

    public static void main(String[] args) {
        Employee[] employees = {new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",
                5000, .04, 300, new Date(1, 20, 1990)),
                new CommissionEmployee("Sue", "Jones", "333-33-3333",
                        10000, .06, new Date(5, 21, 2000)),
                new HourlyEmployee("Karen", "Price", "222-22-2222",
                        16.75, 40, new Date(8, 28, 1995)),
                new SalariedEmployee("John", "Smith", "111-11-1111",
                        800.00, new Date(11, 10, 1993)),
        new PieceWorker("Den", "White", "007-666-228", 15.5, 30, new Date(11, 23, 1980))};

        for (Employee employee : employees) {
            System.out.println(employee + "\nEarnings: " + employee.earnings() + "\n");
        }
    }
}