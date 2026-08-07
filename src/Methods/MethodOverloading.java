package Methods;

/*
 * ============================================================
 * Topic: Method Overloading
 * ============================================================
 *
 * Theory:
 * --------
 * Method Overloading means having multiple methods
 * with the same name but different parameters.
 *
 * Rules:
 *
 * ✔ Same Method Name
 * ✔ Different Number of Parameters
 * OR
 * ✔ Different Data Types
 *
 * Method Overloading is an example of
 * Compile-Time Polymorphism.
 *
 * Method Overloading depends ONLY on the Method Signature.
 * Method Signature = Method Name + Parameter List

 */

public class MethodOverloading {

    public static int add(int a,int b){

        return a+b;

    }

    public static int add(int a,int b,int c){

        return a+b+c;

    }

    public static double add(double a,double b){

        return a+b;

    }

    public static void main(String[] args) {

        System.out.println(add(10,20));

        System.out.println(add(10,20,30));

        System.out.println(add(12.5,8.5));

    }

}