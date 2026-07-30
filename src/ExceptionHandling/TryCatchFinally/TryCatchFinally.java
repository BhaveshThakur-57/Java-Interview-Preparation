package ExceptionHandling.TryCatchFinally;

import java.lang.ArithmeticException;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Learn Coding");
            int a=20,b=2,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Learn Java");
        } catch (ArithmeticException e) {
            System.out.println(" can't divide by zero");
        }
        finally {
            System.out.println("subscribe");
        }
        System.out.println("main method ended");
    }
}
