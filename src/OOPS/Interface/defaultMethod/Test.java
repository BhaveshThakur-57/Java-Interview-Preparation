package OOPS.Interface.defaultMethod;

interface A
{
    void a1();
    void a2();
    default void a3(){
        System.out.println("may or may not override in implementing classes");
    }
}
class B implements A
{
    @Override
    public void a1() {
        System.out.println("Class B a1()");

    }

    @Override
    public void a2() {
        System.out.println("Class B a2()");
    }
    @Override
    public void a3(){
        System.out.println("override in implementing class B");
    }
}

class C implements A
{
    @Override
    public void a1() {
        System.out.println("Class C a1()");

    }

    @Override
    public void a2() {
        System.out.println("Class C a2()");
    }
}

class D implements A
{
    @Override
    public void a1() {
        System.out.println("Class D a1()");

    }

    @Override
    public void a2() {
        System.out.println("Class D a2()");
    }
}
public class Test {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.a1(); obj1.a2(); obj1.a3();

        C obj2 = new C();
        obj2.a1(); obj2.a2(); obj2.a3();

        D obj3 = new D();
        obj3.a1(); obj3.a2(); obj3.a3();


    }
}
