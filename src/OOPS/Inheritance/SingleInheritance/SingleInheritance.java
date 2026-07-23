package OOPS.Inheritance.SingleInheritance;

/*
 * ============================================================
 * Topic : Single Inheritance
 *
 * Vehicle
 *    ↑
 *   Car
 * ============================================================
 */

class Vehicle {

    protected String brand;
    protected String model;

    public void setVehicleDetails(String brand, String model) {

        this.brand = brand;
        this.model = model;

    }

    public void displayVehicleDetails() {

        System.out.println("Brand      : " + brand);
        System.out.println("Model      : " + model);

    }

}

/*
 * Car inherits Vehicle.
 */

class Car extends Vehicle {

    protected String fuelType;

    public void setCarDetails(String fuelType) {

        this.fuelType = fuelType;

    }

    public void displayCarDetails() {

        displayVehicleDetails();

        System.out.println("Fuel Type  : " + fuelType);

    }

}

public class SingleInheritance {

    public static void main(String[] args) {

        Car car = new Car();

        car.setVehicleDetails("Toyota", "Fortuner");

        car.setCarDetails("Diesel");

        System.out.println("===== Car Details =====");

        car.displayCarDetails();

    }

}