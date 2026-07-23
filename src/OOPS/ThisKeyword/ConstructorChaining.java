package OOPS.ThisKeyword;

/*
 * ============================================================
 * Topic: Constructor Chaining using this()
 * ============================================================
 */

public class ConstructorChaining {

    String name;
    int age;

    ConstructorChaining() {

        // Calls second constructor
        this("Unknown",0);

        System.out.println("Default Constructor");

    }

    ConstructorChaining(String name,int age){

        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor");

    }

    void display(){

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

}
