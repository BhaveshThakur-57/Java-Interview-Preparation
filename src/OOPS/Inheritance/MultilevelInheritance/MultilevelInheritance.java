package OOPS.Inheritance.MultilevelInheritance;

/*
 * ============================================================
 * Topic : Multilevel Inheritance
 *
 * Vehicle
 *    ↑
 *   Car
 *    ↑
 * ElectricCar
 * ============================================================
 */

class Vehicle {

    protected String brand;

    public void setBrand(String brand) {

        this.brand = brand;

    }

}

class Car extends Vehicle {

    protected String model;

    public void setModel(String model) {

        this.model = model;

    }

}

class ElectricCar extends Car {

    protected int batteryCapacity;

    public void setBatteryCapacity(int batteryCapacity) {

        this.batteryCapacity = batteryCapacity;

    }

    public void displayElectricCarDetails() {

        System.out.println("Brand             : " + brand);
        System.out.println("Model             : " + model);
        System.out.println("Battery Capacity  : " + batteryCapacity + " kWh");

    }

}

public class MultilevelInheritance {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();

        electricCar.setBrand("Tesla");
        electricCar.setModel("Model 3");
        electricCar.setBatteryCapacity(75);

        System.out.println("===== Electric Car Details =====");

        electricCar.displayElectricCarDetails();

    }

}