package OOPS.Constructors;

/*
 * ============================================================
 * Topic: Parameterized Constructor
 * ============================================================
 *
 * Theory:
 * --------
 * A parameterized constructor receives values
 * while creating the object.
 */

public class ParameterizedConstructor {

    String name;
    int age;

    ParameterizedConstructor(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

}