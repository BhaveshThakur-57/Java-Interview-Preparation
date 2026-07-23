package JavaBasics;
/*
  A variable is a named memory location used to store data.

 Syntax:
  datatype variableName = value;

Example:
  int age = 21;

Rules:
  1. Variable names are case-sensitive.
  2. Cannot start with a number.
  3. Can start with a letter, _ or $.
  4. Cannot use Java keywords.

Naming Convention:
  camelCase
  Example:
  studentName
  totalMarks
  isActive
*/

public class VariablesExample {
    public static void main(String[] args) {

        // String variable
        String name = "Bhavesh";

        // Integer variable
        int age = 22;

        // Decimal number
        double percentage = 82.75;

        // Single character
        char grade = 'A';

        // Boolean value
        boolean placed = false;

        System.out.println("Student Details");
        System.out.println("-------------------------");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade      : " + grade);
        System.out.println("Placed     : " + placed);
    }
}

