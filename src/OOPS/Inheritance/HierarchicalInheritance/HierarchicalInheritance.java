package OOPS.Inheritance.HierarchicalInheritance;

/*
 * ============================================================
 * Topic : Hierarchical Inheritance
 *
 *             Vehicle
 *            /       \
 *          Car       Bike
 * ============================================================
 */

class Vehicle {

    protected String brand;

    public void setBrand(String brand) {

        this.brand = brand;

    }

}

class Car extends Vehicle {

    protected int numberOfDoors;

    public void setNumberOfDoors(int numberOfDoors) {

        this.numberOfDoors = numberOfDoors;

    }

    public void displayCarDetails() {

        System.out.println("Car Brand        : " + brand);
        System.out.println("Number of Doors  : " + numberOfDoors);

    }

}

class Bike extends Vehicle {

    protected boolean hasABS;

    public void setABS(boolean hasABS) {

        this.hasABS = hasABS;

    }

    public void displayBikeDetails() {

        System.out.println("Bike Brand       : " + brand);
        System.out.println("Has ABS          : " + hasABS);

    }

}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Car car = new Car();

        car.setBrand("Hyundai");
        car.setNumberOfDoors(4);

        Bike bike = new Bike();

        bike.setBrand("Yamaha");
        bike.setABS(true);

        System.out.println("===== Car Details =====");

        car.displayCarDetails();

        System.out.println();

        System.out.println("===== Bike Details =====");

        bike.displayBikeDetails();

    }

}