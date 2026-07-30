package ExceptionHandling.MultipleCatch;

// ishme ek exception dusre pe depend hota hai

public class Test {
    public static void main(String[] args) {
        try {
            int a = 20, b = 2, c;
            c = a / b;
            System.out.println(c);

            int arr[] = {10, 20, 30, 40, 50};
            System.out.println(arr[2]);

            String str = "Bhavesh";
            System.out.println(str.toUpperCase());

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Array Exception");
        } catch (ArithmeticException b) {
            System.out.println("Number Exception");
        } catch (NumberFormatException c) {
            throw new RuntimeException(c);
        } catch (Exception E) {
            System.out.println("All Type Exception Handled");
        }


    }
}