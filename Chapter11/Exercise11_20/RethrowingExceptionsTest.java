public class RethrowingExceptionsTest {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Exception thrown from: someMethod");
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown from: someMethod2");
    }
}
