import java.io.IOException;

public class ExceptionClassTest {

    public static void main(String[] args) {
        try {
            getExceptionA();
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n" +
                    "Exception caught!\n");
        }

        try {
            getExceptionB();
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n" +
                    "Exception caught!\n");
        }

        try {
            getNullPointerException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n" +
                    "Exception caught!\n");
        }

        try {
            getIOException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n" +
                    "Exception caught!\n");
        }
    }

    public static void getExceptionA() throws ExceptionA {
        throw new ExceptionA("ExceptionA thrown!");
    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB("ExceptionB thrown!");
    }

    public static void getNullPointerException() throws NullPointerException {
        throw new NullPointerException("NullPointerException thrown!");
    }

    public static void getIOException() throws IOException {
        throw new IOException("IOException thrown!");
    }
}
