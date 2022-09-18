package exceptionHandling;

public class throwhs {
    class ThrowingClass {

        static void myMethod() throws ClassNotFoundException { throw new ClassNotFoundException ("just a demo");

        }

    }

    class ThrowsDemo {

        public static void main(String args[]) {

            try {

                ThrowingClass.myMethod();

            } catch (ClassNotFoundException e) {

                System.out.println(e);

            }

        }

    }

}
