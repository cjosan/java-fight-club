public class ExceptionsTest {

    public static void main(String[] args) {
        try {
            throwB();
        } catch (ExceptionA ex) {
            System.out.println(ex.getMessage());
            System.out.println("ExceptionA caught!");
        }

        System.out.println();

        try {
            throwC();
        } catch (ExceptionA ex) {
            System.out.println(ex.getMessage());
            System.out.println("ExceptionA caught!");
        }
    }

    public static void throwB() throws ExceptionB {
        throw new ExceptionB("ExceptionB thrown!");
    }

    public static void throwC() throws ExceptionC {
        throw new ExceptionC("ExceptionC thrown!");
    }
}
