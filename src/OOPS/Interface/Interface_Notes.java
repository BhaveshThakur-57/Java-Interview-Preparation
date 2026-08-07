/*
 * ============================================================
 * Topic : Interface (Quick Revision Notes)
 * ============================================================
 *
 * Definition:
 * - Interface is a blueprint of a class.
 * - It contains method declarations.
 * - A class implements an interface and provides
 *   implementation of its methods.
 *
 * Example:
 *
 * interface Vehicle{
 *     void startEngine();
 * }
 *
 * class Car implements Vehicle{
 *     public void startEngine(){
 *         System.out.println("Car Started");
 *     }
 * }
 *
 * ============================================================
 * Why Interface?
 * ============================================================
 *
 * ✔ Achieve 100% Abstraction
 * ✔ Multiple Inheritance
 * ✔ Loose Coupling
 * ✔ Standard Rules/Contract
 *
 * ============================================================
 * Syntax
 * ============================================================
 *
 * interface Animal{
 *      void sound();
 * }
 *
 * class Dog implements Animal{
 *
 *      @Override
 *      public void sound(){
 *
 *      }
 * }
 *
 * ============================================================
 * Interface Rules
 * ============================================================
 *
 * ✔ Interface cannot have object.
 *
 * Wrong:
 * Animal a = new Animal();
 *
 * ✔ Interface reference is allowed.
 *
 * Correct:
 * Animal a = new Dog();
 *
 * ============================================================
 * Methods inside Interface
 * ============================================================
 *
 * Java 7
 * -------
 * ✔ abstract methods
 *
 * Java 8
 * -------
 * ✔ abstract methods
 * ✔ default methods
 * ✔ static methods
 *
 * Java 9
 * -------
 * ✔ private methods
 * ✔ private static methods
 *
 * ============================================================
 * Abstract Method
 * ============================================================
 *
 * interface A{
 *      void show();
 * }
 *
 * - No body.
 * - Must be implemented.
 *
 * ============================================================
 * Default Method
 * ============================================================
 *
 * interface A{
 *
 *      default void show(){
 *          System.out.println("Hello");
 *      }
 *
 * }
 *
 * Features:
 * ✔ Has body.
 * ✔ Override optional.
 * ✔ Used to provide default implementation.
 *
 * Implementing class:
 *
 * class B implements A{
 *
 * }
 *
 * OR
 *
 * class B implements A{
 *
 *      @Override
 *      public void show(){
 *
 *      }
 *
 * }
 *
 * ============================================================
 * Static Method
 * ============================================================
 *
 * interface A{
 *
 *      static void show(){
 *
 *      }
 *
 * }
 *
 * Call:
 *
 * A.show();
 *
 * Features:
 * ✔ Belongs to interface.
 * ✔ Cannot override.
 * ✔ Cannot call using object.
 *
 * Wrong:
 *
 * B obj = new B();
 * obj.show();
 *
 * ============================================================
 * Private Method (Java 9)
 * ============================================================
 *
 * interface A{
 *
 *      default void call(){
 *          add();
 *      }
 *
 *      private void add(){
 *
 *      }
 *
 * }
 *
 * Features:
 * ✔ Used only inside interface.
 * ✔ Cannot access outside.
 * ✔ Used to reduce duplicate code.
 *
 * ============================================================
 * Private Static Method
 * ============================================================
 *
 * interface A{
 *
 *      static void call(){
 *          add();
 *      }
 *
 *      private static void add(){
 *
 *      }
 *
 * }
 *
 * ============================================================
 * Interface Variables
 * ============================================================
 *
 * Every variable is automatically:
 *
 * public
 * static
 * final
 *
 * Example:
 *
 * interface A{
 *
 *      int x = 10;
 *
 * }
 *
 * Actually Java treats it as:
 *
 * public static final int x = 10;
 *
 * Cannot modify.
 *
 * ============================================================
 * Constructor
 * ============================================================
 *
 * ✘ Constructor not allowed.
 *
 * Wrong:
 *
 * interface A{
 *      A(){}
 * }
 *
 * ============================================================
 * Object Creation
 * ============================================================
 *
 * Wrong:
 *
 * A obj = new A();
 *
 * Correct:
 *
 * A obj = new B();
 *
 * ============================================================
 * implements Keyword
 * ============================================================
 *
 * Used by class.
 *
 * interface A{}
 *
 * class B implements A{}
 *
 * ============================================================
 * extends Keyword
 * ============================================================
 *
 * Used by interface.
 *
 * interface A{}
 *
 * interface B extends A{}
 *
 * ============================================================
 * Interface to Interface Inheritance
 * ============================================================
 *
 * interface A{
 *      void add();
 * }
 *
 * interface B extends A{
 *      void sub();
 * }
 *
 * class C implements B{
 *
 *      public void add(){}
 *
 *      public void sub(){}
 * }
 *
 * ============================================================
 * Multiple Inheritance
 * ============================================================
 *
 * interface A{
 *      void show();
 * }
 *
 * interface B{
 *      void show();
 * }
 *
 * class C implements A,B{
 *
 *      public void show(){
 *
 *      }
 *
 * }
 *
 * Java supports Multiple Inheritance
 * using Interfaces.
 *
 * ============================================================
 * Reference Rule
 * ============================================================
 *
 * Vehicle v = new Car();
 *
 * Reference Type -> Vehicle
 *
 * Object Type -> Car
 *
 * Runtime Polymorphism.
 *
 * ============================================================
 * Difference
 * ============================================================
 *
 * extends
 * -------
 * Class -> Class
 * Interface -> Interface
 *
 * implements
 * ----------
 * Class -> Interface
 *
 * ============================================================
 * Interface vs Abstract Class
 * ============================================================
 *
 * Interface
 * ---------
 * ✔ No Constructor
 * ✔ Multiple Inheritance
 * ✔ Variables are public static final
 * ✔ Object not allowed
 * ✔ Methods are abstract/default/static/private
 *
 * Abstract Class
 * --------------
 * ✔ Constructor allowed
 * ✔ Variables allowed
 * ✔ Normal methods allowed
 * ✔ Object not allowed
 * ✔ Single inheritance only
 *
 * ============================================================
 * Interview Questions
 * ============================================================
 *
 * Q. Can interface have constructor?
 * -> No
 *
 * Q. Can interface have object?
 * -> No
 *
 * Q. Can interface have variables?
 * -> Yes (public static final)
 *
 * Q. Can interface have static method?
 * -> Yes
 *
 * Q. Can interface have default method?
 * -> Yes
 *
 * Q. Can interface have private method?
 * -> Yes (Java 9)
 *
 * Q. Can interface have main method?
 * -> Yes
 *
 * Q. Can interface extend another interface?
 * -> Yes
 *
 * Q. Can class implement multiple interfaces?
 * -> Yes
 *
 * Q. Can static interface method be overridden?
 * -> No
 *
 * Q. Can default method be overridden?
 * -> Yes
 *
 * ============================================================
 * 30 Seconds Revision
 * ============================================================
 *
 * ✔ Interface is blueprint.
 * ✔ Object cannot be created.
 * ✔ Class uses implements.
 * ✔ Interface uses extends.
 * ✔ Abstract method -> Must implement.
 * ✔ Default method -> Optional override.
 * ✔ Static method -> Call using InterfaceName.method().
 * ✔ Private method -> Only inside interface.
 * ✔ Variables -> public static final.
 * ✔ Constructor -> Not allowed.
 * ✔ Supports Multiple Inheritance.
 * ✔ Parent Reference -> Child Object possible.
 *
 * ============================================================
 */