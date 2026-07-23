package OOPS.ThisKeyword;

/*
 * ============================================================
 * Topic: this Keyword Examples
 * ============================================================
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Example 1");
        System.out.println("----------------");

        Student s1 = new Student(
                "Bhavesh",
                22,
                82.5
        );

        s1.display();

        System.out.println();

        System.out.println("Example 2");
        System.out.println("----------------");

        ConstructorChaining obj =
                new ConstructorChaining();

        obj.display();

    }

}
