package OOPS.Polymorphism.SuperKeyword;

class A{

    //same variable
    int a = 10;

    //same method
    void  display(){
        System.out.println("Hello Viewer");
    }

    //same constructor
      A(){
        System.out.println("Hii Dad");
    }
}
class B extends A{
    int a=20;
    void  display(){
        super.display();
        System.out.println("Hello Learner");
    }

    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
    B(){
        //super(); java compiler by default khud sehi likh deta hai
        //super ke liye phle sehi  ek space reserve hota hai
        System.out.println("Hii Son");
    }
}
public class Test {
    public static void main(String[] args) {
        B obj = new B();
        //obj.show();
        //obj.display();
    }
}
