// (Employee Class) Create a class called Employee that includes three instance variables—a
// first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
// that initializes the three instance variables. Provide a set and a get method for each instance
// variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest
// that demonstrates class Employee’s capabilities. Create two Employee objects and display each
// object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary
// again.

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Anton", "White", -2000);
        Employee emp2 = new Employee("Dan", "Snow", 1500.50);

        System.out.printf("%s %s yearly salary is: %.2f\n", emp1.getFirstName(),
                emp1.getLastName(), emp1.getYearlySalary());

        System.out.printf("%s %s yearly salary is: %.2f\n", emp2.getFirstName(),
                emp2.getLastName(), emp2.getYearlySalary());

        System.out.println();
        emp1.setMonthlySalary(2000);
        emp1.setMonthlySalary(emp1.getMonthlySalary() * (1 + 0.1));
        emp2.setMonthlySalary(-300);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * (1 + 0.1));

        System.out.println();
        System.out.printf("%s %s yearly salary is: %.2f\n", emp1.getFirstName(),
                emp1.getLastName(), emp1.getYearlySalary());

        System.out.printf("%s %s yearly salary is: %.2f\n", emp2.getFirstName(),
                emp2.getLastName(), emp2.getYearlySalary());

        emp1.setLastName("Black");
        emp2.setFirstName("Olea");

        System.out.println();
        System.out.println("First employee name changed to: " + emp1.getFirstName() +
                " " + emp1.getLastName());
        System.out.println("Second employee name changed to: " + emp2.getFirstName() +
                " " + emp2.getLastName());
    }
}
