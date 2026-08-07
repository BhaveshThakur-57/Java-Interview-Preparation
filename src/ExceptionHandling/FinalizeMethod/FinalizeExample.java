package ExceptionHandling.FinalizeMethod;

/*
 * Note:
 * finalize() is deprecated since Java 9.
 * This example is only for learning purposes.
 */

class Student {

    @Override
    protected void finalize() throws Throwable {

        System.out.println("Student Object Destroyed");

    }

}

public class FinalizeExample {

    public static void main(String[] args) {

        Student student = new Student();

        student = null;

        System.gc();

        System.out.println("Program Ended");

    }

}