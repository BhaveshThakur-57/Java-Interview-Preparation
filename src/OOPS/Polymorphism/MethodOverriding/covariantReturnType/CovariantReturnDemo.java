package OOPS.Polymorphism.MethodOverriding.covariantReturnType;

class Animal {
    Animal getObject() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog getObject() {
        return new Dog();
    }
}

public class CovariantReturnDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        Dog obj = d.getObject();

        System.out.println(obj.getClass().getSimpleName());
    }
}
