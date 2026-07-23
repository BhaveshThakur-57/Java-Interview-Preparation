package JavaBasics;
/*
  Two Types:

  1. Implicit Casting (Widening)
  Smaller -> Larger

  byte -> short -> int -> long -> float -> double

  2. Explicit Casting (Narrowing)
  Larger -> Smaller

  double -> float -> long -> int -> short -> byte
 */

public class TypeCastingExample {
    public static void main(String[] args) {

        // ---------------------------
        // Implicit Casting
        // ---------------------------

        int number = 100;

        double value = number;

        System.out.println("Implicit Casting");
        System.out.println(value);

        // ---------------------------
        // Explicit Casting
        // ---------------------------

        double price = 99.99;

        int newPrice = (int) price;

        System.out.println();

        System.out.println("Explicit Casting");
        System.out.println(newPrice);

    }
}
