//        (Using the Enhanced for Statement) Write an application that uses an enhanced for statement
//        to sum the double values passed by the command-line arguments. [

public class Exercise16 {

    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }

        System.out.print("The sum of arguments passed is " + sum);
    }
}
