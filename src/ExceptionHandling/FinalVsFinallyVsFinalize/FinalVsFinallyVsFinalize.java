package ExceptionHandling.FinalVsFinallyVsFinalize;

/*
 * ============================================================
 * Topic : final vs finally vs finalize()
 * ============================================================
 */

class Student {

    @Override
    protected void finalize() throws Throwable {

        System.out.println("finalize() Method Called");

    }

}

public class FinalVsFinallyVsFinalize {

    public static void main(String[] args) {

        // ===========================
        // final Keyword
        // ===========================

        final int age = 21;

        System.out.println("Age : " + age);

        // age = 25;   // Compile-Time Error



        // ===========================
        // finally Block
        // ===========================

        try {

            int result = 20 / 0;

        }

        catch (ArithmeticException exception) {

            System.out.println("Arithmetic Exception Handled");

        }

        finally {

            System.out.println("Finally Block Executed");

        }



        // ===========================
        // finalize() Method
        // ===========================

        Student student = new Student();

        student = null;

        System.gc();

        System.out.println("Program Ended");

    }

}