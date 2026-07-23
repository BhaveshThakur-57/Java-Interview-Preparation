package OOPSinJAVA;

public class Car {
    String name;
   private int price;
    String type;
    final int totalWheels=4;
    static int numberOfCars;

   //  static functions
   //  used if we want to access a function in the class through just classname.function  without creating Objects
   public static int getNumberOfCars(){
       return numberOfCars;
   }


    public int getPrice(){ // getter
        return price;
}

public void setPrice(int kimat){ //setter
        price = kimat;
}

// default constructor
public Car() {

    }

//constructor

//public Car(String naam, String Type){
//        name=naam;
//        type=Type;
//}

public Car(String name, String type){
        this.name = name;
        this.type = type;
        numberOfCars++;
    }


//    public void setPrice(int price){ //setter
//        this.price = price;
//    }

}