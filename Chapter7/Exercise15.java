//        (Command-Line Arguments) Rewrite Fig. 7.2 so that the size of the array is specified by the
//        first command-line argument. If no command-line argument is supplied, use 10 as the default size
//        of the array.

public class Exercise15 {

    public static void main(String[] args) {
        int size;
        if (args.length > 0) {
            size = Integer.parseInt(args[0]);
        } else {
            size = 10;
        }

        // declare variable array and initialize it with an array object
        int[] array = new int[size]; // create the array object

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}
