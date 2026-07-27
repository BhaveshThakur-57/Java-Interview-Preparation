package OOPS.ThisKeyword;
/*

 class A {
     void show(){
         System.out.println(this);
     }

     public static void main(String[] args) {
         A obj = new A();
         System.out.println(obj);
         obj.show();
     }
}
*/


// this keyword is used when we want to call the default constructor of its own class
// It is also used to call parameterized constructor of its own class
class A {
     A(){
         this(10);
        //System.out.println("Learn Java");

    }
    A(int a){
        // this();
         System.out.println(a);
    }

    public static void main(String[] args) {
        // A obj = new A(20);
        A obj = new A();

    }
}
