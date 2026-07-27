package OOPS.Interface;

interface A{
    void show();
}
interface B{
    void show();
}
 class MultipleInheritance implements A,B {
    public void show(){
        System.out.println("Interface A & B");
    }

     public static void main(String[] args) {
         MultipleInheritance obj=  new MultipleInheritance();
         obj.show();
     }
}
