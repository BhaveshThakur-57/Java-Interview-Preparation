package Methods;

/*
 * ============================================================
 * Topic: Methods in Java
 * ============================================================
 *
 * Theory:
 * --------
 * A method is a block of code that performs a specific task.
 *
 * Syntax:
 *
 * accessModifier returnType methodName(){
 *
 * }

 */

public class MethodsExample {
    // Method without parameters
    public static void welcomeMessage() {
        System.out.println("Welcome to Java Programming.");
    }

    // Method without parameters
    public static void displayStudent() {

        System.out.println("Name : Bhavesh");
        System.out.println("Age : 22");
        System.out.println("Course : B.Tech");
    }

    public static void main(String[] args) {

        System.out.println("Calling Methods");

        welcomeMessage();

        System.out.println();

        displayStudent();

    }
}
