package OOPS.Interface.privateMethod;

interface A{

     //1st way

    default void call()
    {
        add(10,80);
    }

    /*
     //2nd way

    public static void call()
    {
        add(10,80);
    }
    private static void add(int x,int y){
        System.out.println("Sum : "+(x+y));
    }

     */

    private void add(int x,int y){
        System.out.println("Sum : "+(x+y));
    }
}

class B implements A{
    public void sub(int x,int y){
        System.out.println("Sub : "+(x-y));
    }
}
 class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.sub(100,50);
        //A.call();
        obj.call();
    }
}
