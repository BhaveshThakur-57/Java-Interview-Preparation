package ExceptionHandling.ExceptionPropagation;

public class Test {
    public static void main(String[] args) {

        try {
        m1();
    } catch (ArithmeticException e){
            System.out.println("Exception Handeled by main method");
        }
}
    public static void m1(){
        m2();
    }
    public static void m2(){
        System.out.println(10/0);
    }
}
