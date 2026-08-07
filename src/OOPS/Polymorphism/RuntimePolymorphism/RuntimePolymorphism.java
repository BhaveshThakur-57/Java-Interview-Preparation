package OOPS.Polymorphism.RuntimePolymorphism;

/*
 * ============================================================
 * Topic : Runtime Polymorphism
 *
 * Vehicle
 *    ↑
 *   Car
 * ============================================================
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

public class RuntimePolymorphism {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        vehicle.startEngine();

    }

}
