package AccessModifiers;

/*
 * ============================================================
 *                JAVA ACCESS MODIFIERS
 * ============================================================
 *
 * Modifier      Same Class   Same Package   Outside Package   Child Class
 * ------------------------------------------------------------------------
 * public            ✔️            ✔️              ✔️              ✔️
 * protected         ✔️            ✔️              ❌              ✔️
 * default           ✔️            ✔️              ❌              ❌
 * private           ✔️            ❌              ❌              ❌
 *
 * ============================================================
 * Shortcut:
 *
 * public    -> Accessible Everywhere
 * protected -> Same Package + Child Class
 * default   -> Same Package Only
 * private   -> Same Class Only
 * ============================================================
 */

public class App {
     public String str_1 = "I am a Public Member";

     void PrintFromClass(){
        System.out.println("within  class: " +str_1);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.PrintFromClass();
        System.out.println("within class: "+obj.str_1);

        App2 obj2 = new App2();
        obj2.PrintFromOutsideClass();

    }


}

class App2{
    void PrintFromOutsideClass(){
        App obj = new App();
        System.out.println("withis package, outside class: "+obj.str_1);
    }

}