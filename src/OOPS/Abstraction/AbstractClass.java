package OOPS.Abstraction;

/*
 * ============================================================
 * Topic : Abstraction
 *
 * Vehicle
 *    ↑
 *   Car
 * ============================================================
 *
 * Abstraction means hiding implementation details
 * and showing only essential functionality.
 */

// Abstract Parent Class
abstract class Vehicle {

    protected String brand;

    public Vehicle(String brand) {

        this.brand = brand;

    }

    // Abstract Method
    public abstract void startEngine();

    // Normal Method
    public void displayBrand() {

        System.out.println("Brand : " + brand);

    }

}

// Child Class
class Car extends Vehicle {

    public Car(String brand) {

        super(brand);

    }

    @Override
    public void startEngine() {

        System.out.println("Car Engine Started");

    }

}


