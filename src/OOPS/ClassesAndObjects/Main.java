package OOPS.ClassesAndObjects;

/*
 * ============================================================
 * Topic: Creating Objects
 * ============================================================
 *
 * Theory:
 * --------
 * Object Creation Syntax
 *
 * ClassName objectName = new ClassName();
 */

public class Main {

    public static void main(String[] args) {

        // ----------------------------
        // Student Object
        // ----------------------------

        Student student1 = new Student();

        student1.name = "Bhavesh";
        student1.rollNo = 101;
        student1.percentage = 82.40;

        student1.displayDetails();

        System.out.println();

        // ----------------------------
        // Car Object
        // ----------------------------

        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.model = "Fortuner";
        car1.price = 4200000;

        car1.displayCar();

    }

}
