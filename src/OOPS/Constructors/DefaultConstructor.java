package OOPS.Constructors;

/*
 * ============================================================
 * Topic: Default Constructor
 * ============================================================
 *
 * Theory:
 * --------
 * A constructor is a special method that is automatically
 * called when an object is created.
 *
 * Characteristics:
 * ✔ Constructor name = Class name
 * ✔ No return type (not even void)
 * ✔ Automatically executes during object creation
 */

public class DefaultConstructor {

    String name;
    int age;

    // Default Constructor
    DefaultConstructor() {

        name = "Bhavesh";
        age = 22;

        System.out.println("Default Constructor Executed");

    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

}