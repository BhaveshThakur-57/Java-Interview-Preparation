package ExceptionHandling.TryCatch;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "Bhavesh";

        try {
            int a =Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("String "+str+" can't be converted to Integer");
        }
    }
}
