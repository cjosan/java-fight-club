import java.math.BigDecimal;
import java.util.Scanner;

public class MyMath {
    private static Scanner scanner = new Scanner(System.in);

    public static int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }

    public static BigDecimal estimateE(int terms) {
        if (terms == 0)
            return BigDecimal.ONE;
        else {
            return new BigDecimal(1.0 / calculateFactorial(terms)).add(estimateE(terms - 1));
        }
    }

    public static BigDecimal calculateEToTheX(int x, int terms) {
        if (terms == 0)
            return BigDecimal.ONE;
        else {
            return new BigDecimal(Math.pow(x, terms) / calculateFactorial(terms)).add(calculateEToTheX(x, terms - 1));
        }
    }
}
