package OOPS.Polymorphism.MethodOverloading;

public  class Demo {

    void add() {
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println(c);

    }
     void add(int x, int y)
     {
          int c;
          c = x + y;
          System.out.println(c);

     }


    // Addition of two double values
     void add(int x, double y) {

         double c;
         c = x + y;
         System.out.println(c);

    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.add();  obj.add(90,20);   obj.add(30,22.66);
    }

}

