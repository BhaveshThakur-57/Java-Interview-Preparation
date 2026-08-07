package Methods;

/*
 * ============================================================
 * Topic: Method Parameters
 * ============================================================
 *
 * Theory:
 * --------
 * Parameters are variables passed to methods.
 *
 */

public class ParameterExample {

    public static void studentDetails(String name, int age) {

        System.out.println("Student Details");
        System.out.println("-------------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

    public static void square(int number) {

        System.out.println("Square = " + (number * number));

    }

    public static void main(String[] args) {

        studentDetails("Bhavesh",22);

        System.out.println();

        studentDetails("Omkar",20);

        System.out.println();

        square(5);

    }

}