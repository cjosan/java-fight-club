//        (Variable-Length Argument List) Write an application that calculates the product of a series
//        of integers that are passed to method product using a variable-length argument list. Test your method
//        with several calls, each with a different number of arguments.

public class Exercise14 {

    public static void main(String[] args) {
        System.out.println(product(1));
        System.out.println(product(1, 2 , 3));
        System.out.println(product(1, 1, 1, -1));
        System.out.println(product(3, 5, 7, 9, 0));
        System.out.println(product(1, 4, 5, 6, 7, 7, 8));
    }

    public static int product(int... series) {
        int product = 1;
        for (int i = 0; i < series.length; i++) {
            product *= series[i];
        }

        return product;
    }
}
