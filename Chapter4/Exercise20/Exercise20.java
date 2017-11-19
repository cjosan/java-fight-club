import java.util.Scanner;

//    (Salary Calculator) Develop a Java application that determines the gross pay for each of
//    three employees. The company pays straight time for the first 40 hours worked by each employee
//    and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//    number of hours worked last week and their hourly rates. Your program should input this information
//    for each employee, then determine and display the employee’s gross pay. Use class Scanner to
//    input the data.

public class Exercise20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter worked hours and payment for employee" + (i + 1));
            employees[i] = new Employee(scanner.nextInt(), scanner.nextDouble());
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + " gross pay is " + employees[i].calculateGrossPay());
        }
    }
}
