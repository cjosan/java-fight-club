//        (Dangling-else Problem) Determine the output for each of the given sets of code when x
//        is 9 and y is 11 and when x is 11 and y is 9. The compiler ignores the indentation in a Java program.
//        Also, the Java compiler always associates an else with the immediately preceding if unless told to
//        do otherwise by the placement of braces ({}). On first glance, you may not be sure which if a particular
//        else matches—this situation is referred to as the “dangling-else problem.” We’ve eliminated
//        the indentation from the following code to make the problem more challenging.

public class Exercise27 {

    public static void main(String[] args) {
        int x = 9, y = 11;

        // prints asterisks and because both conditions are true
        // and dollars are printed in all cases
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");

        // prints asterisks because both conditions are true
        // dollars are not displayed because are placed inside else
        if (x < 10)
        {
            if (y > 10)
                System.out.println("*****");
        }
        else
        {
            System.out.println("#####");
            System.out.println("$$$$$");
        }

        x = 11;
        y = 9;

        // prints dollars because first condition is false, and other statements
        // are inside of it
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");

        // hashes and dollars are printed because the first condition is false
        // and else is associated with first if
        if (x < 10)
        {
            if (y > 10)
                System.out.println("*****");
        }
        else
        {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}
