package OOPS.Polymorphism.MethodOverriding;

/*
 * ===============================================================
 * Topic : Method Overriding
 * ===============================================================
 *
 * Method Overriding:
 * Defining the same method (same method name and same parameters)
 * in both the superclass and subclass is called Method Overriding.
 *
 * We cannot perform Method Overriding without inheritance.
 *
 * Flow:
 *
 *                     Method Call
 *                         |
 *              +----------+----------+
 *              |                     |
 *        Method Exists?             No
 *              |                     |
 *             Yes             Compile-Time Error
 *              |
 *      Is Method Overridden?
 *         +---------+---------+
 *         |                   |
 *        Yes                 No
 *         |                   |
 * Call Subclass Method   Call Superclass Method
 *
 * Example:
 *
 *      Vehicle (Superclass)
 *             ↑
 *            Car (Subclass)
 *
 * ===============================================================
 */

class Vehicle {

    public void startEngine() {

        System.out.println("Vehicle Engine Started");

    }

}

class Car extends Vehicle {

    @Override
    public void startEngine() {

        System.out.println("Car Engine Started");

    }

}

public class MethodOverriding {

    public static void main(String[] args) {

        Car car = new Car();

        car.startEngine();

    }

}
