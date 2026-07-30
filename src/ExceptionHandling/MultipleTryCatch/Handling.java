package ExceptionHandling.MultipleTryCatch;

// ishme ek exception dusre pe depend nhi hota

public class Handling {
    public static void main(String[] args) {
        try {
            int a=20,b=2,c;
            c=a/b;
            System.out.println(c);
        }
        catch (NullPointerException a){
            System.out.println("can't divide by zero");
        }
        try {
            int a[] = {10,20,30,40,50};
            System.out.println(a[2]);
        }
        catch (ArrayIndexOutOfBoundsException b){
            System.out.println("beyond the array limit");
        }
    }
}
