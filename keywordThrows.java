public class keywordThrows {

    public static void test(int n)
            throws NullPointerException, ArithmeticException{
        if (n < 0) {
            throw new NullPointerException(
                    "KESALAHAN: null pointer");
        } else {
            throw new ArithmeticException (
                    "KESALAHAN: arithmetic exception");
        }
    }

    public static void main(String[] args) {
        try {
            test(0); // menimbulkan eksepsi NullPointerException
            //test(0); // menimbulkan eksepsi ArithmeticException
        } catch (ArithmeticException|NullPointerException e) {
            System.out.println("Eksepsi ditangkap di sini...");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }

}
