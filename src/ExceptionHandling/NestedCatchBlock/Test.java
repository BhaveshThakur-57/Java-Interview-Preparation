package ExceptionHandling.NestedCatchBlock;

public class Test {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            try{
                String a=null;
                System.out.println(a.toUpperCase());
            }
            catch (NumberFormatException n){
                System.out.println(n);
            }

        }
        System.out.println("Program ended");
    }
}
