package OOPS.Interface;

/*
 * ============================================================
 * Topic : Interface
 *
 *          Vehicle
 *             ▲
 *             │
 *            Car
 * ============================================================
 *
 * Interface:
 * An interface contains method declarations.
 * A class implements an interface and provides
 * the implementation of its methods.
 */

interface Vehicle {

    void startEngine();

}

class Car implements Vehicle {

    @Override
    public void startEngine() {

        System.out.println("Car Engine Started");

    }

}

public class InterfaceExample {

    public static void main(String[] args) {

        Car car = new Car();

        car.startEngine();

//        Vehicle vehicle = new Car();
//
//        vehicle.startEngine();

    }

}


