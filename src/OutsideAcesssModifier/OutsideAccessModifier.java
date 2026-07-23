package OutsideAcesssModifier;
import AccessModifiers.App;
public class OutsideAccessModifier {
    public static void main(String[] args) {
        App obj = new App();
        System.out.println("Outside Package, non-child class: "+obj.str_1);

        App3 obj3 = new App3();
        obj3.printFromChildClass();
    }
}

class App3 extends App{
    void printFromChildClass(){
        App3 obj3 = new App3();
        System.out.println("child class: "+obj3.str_1);
    }
}