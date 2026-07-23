package OOPS.ClassesAndObjects;

public class Car {

    String brand;
    String model;
    int price;

    void displayCar() {

        System.out.println("Car Details");
        System.out.println("----------------------");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);

    }

}