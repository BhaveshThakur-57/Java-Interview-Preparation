package OOPS.Abstraction;

/*
 * ============================================================
 * Topic : Abstraction
 *
 *               Animal
 *                  ↑
 *          ┌───────┴────────┐
 *          │                │
 *         Dog             Lion
 *
 * Abstraction:
 * Hide implementation details and expose only
 * the essential behavior.
 * ============================================================
 */

// Abstract Parent Class
abstract class Animal {

    protected String animalName;

    public Animal(String animalName) {

        this.animalName = animalName;

        System.out.println("Animal Constructor Called");

    }

    // Abstract Method
    public abstract void sound();

    // Normal Method
    public void displayAnimal() {

        System.out.println("Animal Name : " + animalName);

    }

}

// Child Class
class Dog extends Animal {

    public Dog(String animalName) {

        super(animalName);

    }

    @Override
    public void sound() {

        System.out.println("Sound       : Dog Barks");

    }

}

// Child Class
class Lion extends Animal {

    public Lion(String animalName) {

        super(animalName);

    }

    @Override
    public void sound() {

        System.out.println("Sound       : Lion Roars");

    }

}

public class Demo {

    public static void main(String[] args) {

        Dog dog = new Dog("Dog");

        dog.displayAnimal();
        dog.sound();

        System.out.println();

        Lion lion = new Lion("Lion");

        lion.displayAnimal();
        lion.sound();


//        Animal animal = new Dog("Dog");
//
//        animal.displayAnimal();
//
//        animal.sound();

    }

}



//abstract class Animal {
//    Animal(){
//        System.out.println("All Animals");
//    }
//    public abstract void sound();
//
//}
//
//class Dog extends Animal {
//Dog(){
//    super();
//}
//    public void sound() {
//        System.out.println("Dog Barks");
//    }
//}
//
//class Lion extends Animal {
//    Lion(){
//        super();
//    }
//    public void sound() {
//        System.out.println("Lion Roars");
//    }
//}
//
//class Demo {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        Lion l= new Lion();
//        d.sound();
//        l.sound();
//
//    }
//}
