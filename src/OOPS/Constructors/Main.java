package OOPS.Constructors;
/*
 * ============================================================
 * Topic: Constructor Examples
 * ============================================================
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Default Constructor");
        System.out.println("--------------------");

        DefaultConstructor obj1 = new DefaultConstructor();

        obj1.display();

        System.out.println();

        System.out.println("Parameterized Constructor");
        System.out.println("--------------------------");

        ParameterizedConstructor obj2 =
                new ParameterizedConstructor("Thakur",22);


        obj2.display();

        System.out.println();

        System.out.println("Constructor Overloading");
        System.out.println("------------------------");

        ConstructorOverloading s1 =
                new ConstructorOverloading();

        ConstructorOverloading s2 =
                new ConstructorOverloading("Rahul");

        ConstructorOverloading s3 =
                new ConstructorOverloading("Aman",20);



        s1.display();

        System.out.println();

        s2.display();

        System.out.println();

        s3.display();

    }

}
