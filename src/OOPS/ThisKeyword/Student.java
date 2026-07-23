package OOPS.ThisKeyword;

/*
 * ============================================================
 * Topic: this Keyword
 * ============================================================
 *
 * Theory:
 * --------
 * 'this' is a reference variable that refers
 * to the current object.
 *
 * Uses of this keyword:
 *
 * ✔ Differentiate instance variable and local variable.
 * ✔ Call current class constructor using this().
 * ✔ Pass current object.
 * ✔ Return current object.
 */

public class Student {

    String name;
    int age;
    double percentage;

    Student(String name, int age, double percentage) {

        // Local variable = Parameter
        // Instance variable = Class Variable

        this.name = name;
        this.age = age;
        this.percentage = percentage;

    }

    void display() {

        System.out.println("Student Details");
        System.out.println("-----------------------");
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Percentage : " + this.percentage);

    }

}
