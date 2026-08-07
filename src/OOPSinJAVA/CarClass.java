package OOPSinJAVA;

public class CarClass {
    public static void main(String[] args) {
        Car c1 = new Car("Alto","Sedan");
        System.out.println(c1.totalWheels);
        System.out.println(c1.getPrice());
        System.out.println(c1.numberOfCars);
        System.out.println(Car.getNumberOfCars());
//
//       // c1.price=20000;
//        c1.setPrice(20000);
//        System.out.println(c1.getPrice());

        Car c2 = new Car("Tata Punch", "SUV");
        System.out.println(c2.name);
        System.out.println(c2.type);
 //      System.out.println(c2.totalWheels);
        System.out.println(c2.numberOfCars);

        Car c3 = new Car("BMW","Hatchback");
        System.out.println(c3.numberOfCars);
        System.out.println(c3.getNumberOfCars());
    }
}
