package OOPS.Interface;
/*
Interface is just like a class, which contains only abstract methods.

To achieve interface, Java provides a keyword called "implements".

Note:

1) Interface methods are by default public & abstract.

2) Interface variables are by default public + static + final.

3) Interface methods must be overridden inside the implementing class.

4) Interface is nothing but a deal (contract) between the client and the developer.
 */

interface GPS {

    void navigation();

}

interface Music {

    void playMusic();

}

class Car1 implements GPS, Music {

    @Override
    public void navigation() {

        System.out.println("Navigation Started");

    }

    @Override
    public void playMusic() {

        System.out.println("Music Started");

    }

}

public class InterfaceExample2 {

    public static void main(String[] args) {

        Car1 car = new Car1();

        car.navigation();

        car.playMusic();

    }

}
