package OOPS.Abstraction;

/*
 * ============================================================
 * Topic : Abstraction (Quick Revision Notes)
 * ============================================================
 *
 * Definition:
 * - Abstraction means hiding implementation details
 *   and showing only essential functionality.
 *
 * Example:
 * - ATM Machine
 *   -> Visible  : Withdraw, Deposit, Balance Check
 *   -> Hidden   : Database, PIN Verification, Server Logic
 *
 * ------------------------------------------------------------
 * How to Achieve Abstraction?
 * ------------------------------------------------------------
 * 1. Abstract Class
 * 2. Interface
 *
 * ------------------------------------------------------------
 * Abstract Class
 * ------------------------------------------------------------
 * - Declared using 'abstract' keyword.
 * - Cannot create object.
 * - Can contain:
 *      ✔ Variables
 *      ✔ Constructors
 *      ✔ Normal Methods
 *      ✔ Abstract Methods
 *
 * Example:
 * abstract class Animal { }
 *
 * Wrong:
 * Animal a = new Animal();   // Compile Time Error
 *
 * ------------------------------------------------------------
 * Abstract Method
 * ------------------------------------------------------------
 * - Declared using abstract keyword.
 * - Does NOT have method body.
 *
 * Correct:
 * abstract void sound();
 *
 * Wrong:
 * abstract void sound(){ }   // Compile Time Error
 *
 * ------------------------------------------------------------
 * Child Class Rules
 * ------------------------------------------------------------
 * - Child must implement ALL abstract methods.
 *
 * Correct:
 * class Dog extends Animal{
 *     public void sound(){ }
 * }
 *
 * If child doesn't implement all abstract methods:
 * -> Child must also be abstract.
 *
 * Example:
 * abstract class Dog extends Animal{ }
 *
 * ------------------------------------------------------------
 * Constructor in Abstract Class
 * ------------------------------------------------------------
 * ✔ Allowed
 *
 * abstract class Animal{
 *     Animal(){
 *         System.out.println("Constructor");
 *     }
 * }
 *
 * Note:
 * - Abstract class ka object nahi banta.
 * - Lekin child object banega to parent constructor call hoga.
 *
 * Flow:
 * new Dog()
 *      ↓
 * Dog()
 *      ↓
 * Animal()
 *
 * ------------------------------------------------------------
 * super() Keyword
 * ------------------------------------------------------------
 * - Used to call parent constructor.
 *
 * If parent has parameterized constructor,
 * child MUST call super(...).
 *
 * Example:
 *
 * Parent:
 * Animal(String name){}
 *
 * Child:
 * Dog(String name){
 *      super(name);
 * }
 *
 * ------------------------------------------------------------
 * Normal Methods
 * ------------------------------------------------------------
 * ✔ Allowed in abstract class.
 *
 * Reason:
 * Common implementation can be shared.
 *
 * ------------------------------------------------------------
 * Variables
 * ------------------------------------------------------------
 * ✔ Allowed
 *
 * Example:
 * int age;
 * String name;
 *
 * ------------------------------------------------------------
 * Object Creation
 * ------------------------------------------------------------
 * Wrong:
 * Animal a = new Animal();
 *
 * Correct:
 * Animal a = new Dog();
 *
 * ------------------------------------------------------------
 * Runtime Polymorphism
 * ------------------------------------------------------------
 * Animal a = new Dog();
 *
 * Reference -> Animal
 * Object    -> Dog
 *
 * Method executes according to
 * actual object (Dog).
 *
 * ------------------------------------------------------------
 * Not Allowed
 * ------------------------------------------------------------
 * ✘ abstract constructor
 * ✘ abstract static method
 * ✘ final abstract method
 *
 * Wrong:
 * abstract Animal();
 *
 * abstract static void show();
 *
 * final abstract void display();
 *
 * ------------------------------------------------------------
 * Allowed
 * ------------------------------------------------------------
 * ✔ Constructor
 * ✔ Variables
 * ✔ Normal Methods
 * ✔ Abstract Methods
 * ✔ Main Method
 *
 * ------------------------------------------------------------
 * Difference
 * ------------------------------------------------------------
 * Abstract Method
 * - No body
 * - Must be overridden
 *
 * Normal Method
 * - Has body
 * - Override optional
 *
 * ------------------------------------------------------------
 * Interview / Viva Questions
 * ------------------------------------------------------------
 * Q. Can we create object of abstract class?
 * -> No
 *
 * Q. Can abstract class have constructor?
 * -> Yes
 *
 * Q. Can abstract class have variables?
 * -> Yes
 *
 * Q. Can abstract class have normal methods?
 * -> Yes
 *
 * Q. Can constructor be abstract?
 * -> No
 *
 * Q. Can static method be abstract?
 * -> No
 *
 * Q. Can final method be abstract?
 * -> No
 *
 * Q. Child doesn't implement abstract method?
 * -> Child must also be abstract.
 *
 * ------------------------------------------------------------
 * 30 Seconds Revision
 * ------------------------------------------------------------
 * ✔ Object of abstract class cannot be created.
 * ✔ Constructor is allowed.
 * ✔ Variables are allowed.
 * ✔ Normal methods are allowed.
 * ✔ Abstract methods have no body.
 * ✔ Child must implement all abstract methods.
 * ✔ Otherwise child becomes abstract.
 * ✔ Parent Reference -> Child Object is allowed.
 * ✔ Constructor chaining works using super().
 * ✔ final + abstract -> Not Allowed.
 * ✔ static + abstract -> Not Allowed.
 * ✔ Constructor cannot be abstract.
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
