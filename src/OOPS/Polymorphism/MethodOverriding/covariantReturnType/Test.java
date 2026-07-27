package OOPS.Polymorphism.MethodOverriding.ovariantReturnType;

class A{
    A Show()
    {
        System.out.println("Hii I am Super Class");
        return this;
        // return new A();
    }
}
class B extends A{
    @Override
    B Show(){
        super.Show();
        System.out.println("Hii I am sub class");
        return this;
       // return new B();
    }
}

 class Test {
     public static void main(String[] args) {
         B b = new B();
         b.Show();
     }
}
