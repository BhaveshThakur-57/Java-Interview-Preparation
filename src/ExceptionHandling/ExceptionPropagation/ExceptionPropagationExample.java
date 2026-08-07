package ExceptionHandling.ExceptionPropagation;

public class ExceptionPropagationExample {

    public static void method3() {

        int result = 10 / 0;

        System.out.println(result);

    }

    public static void method2() {

        method3();

    }

    public static void method1() {

        method2();

    }

    public static void main(String[] args) {

        try {

            method1();

        }

        catch (ArithmeticException exception) {

            System.out.println("Exception Handled in main()");

        }

        System.out.println("Program Ended");

    }

}
