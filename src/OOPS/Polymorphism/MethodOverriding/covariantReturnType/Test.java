package OOPS.Polymorphism.MethodOverriding.covariantReturnType;
/*
*Before Covariant Return Type concept generally we can't change the return type of overridden method, but new concept introduced in Java called Co-varient where we can change the return-type of overridden method.

*When a child class overrides a method, it can return its own object (child class object) instead of the parent class object. This feature is called Covariant Return Type.
*Covariant Return Type allows an overridden method to return a subclass (child class) object instead of the superclass (parent class) object.
 */
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
