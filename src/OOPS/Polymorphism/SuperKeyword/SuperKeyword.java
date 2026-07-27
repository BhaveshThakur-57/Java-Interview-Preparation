package OOPS.Polymorphism.SuperKeyword;

/*
 * ============================================================
 * Topic : super Keyword
 *
 * Vehicle
 *    ↑
 *   Car
 * ============================================================
 */

class Vehicle {

    protected String brand = "Toyota";

    public void displayVehicle() {

        System.out.println("Vehicle Method");

    }

}

class Car extends Vehicle {

    protected String brand = "BMW";

    public void displayCar() {

        System.out.println("Current Class Brand : " + brand);

        System.out.println("Parent Class Brand  : " + super.brand);

        super.displayVehicle();

    }

}

public class SuperKeyword {

    public static void main(String[] args) {

        Car car = new Car();

        car.displayCar();

    }

}
