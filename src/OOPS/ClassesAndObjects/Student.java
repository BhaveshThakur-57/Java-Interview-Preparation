package OOPS.ClassesAndObjects;

/*
 * ============================================================
 * Topic: Classes and Objects
 * ============================================================
 *
 * Theory:
 * --------
 * Class:
 * A class is a blueprint or template used to create objects.
 *
 * Object:
 * An object is a real-world entity created from a class.
 *
 * A class contains:
 * ✔ Variables (Attributes)
 * ✔ Methods (Behaviors)
 */

public class Student {

    // Instance Variables
    String name;
    int rollNo;
    double percentage;

    // Method
    void displayDetails() {

        System.out.println("Student Details");
        System.out.println("----------------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Percentage : " + percentage);

    }

}