package OOPS.Constructors;

/*
 * ============================================================
 * Topic: Constructor Overloading
 * ============================================================
 *
 * Theory:
 * --------
 * Constructor Overloading means creating multiple
 * constructors with different parameters.
 */

public class ConstructorOverloading {

    String name;
    int age;

    ConstructorOverloading() {

        name = "Unknown";
        age = 0;

    }

    ConstructorOverloading(String name) {

        this.name = name;
        this.age = 0;

    }

    ConstructorOverloading(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

}