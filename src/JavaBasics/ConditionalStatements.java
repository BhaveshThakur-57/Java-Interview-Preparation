package JavaBasics;

/*

  Conditional Statements are used to make decisions.

  Types:
  1. if
  2. if-else
  3. else-if ladder
  4. nested if

 */

public class ConditionalStatements {
    public static void main(String[] args) {

        int marks = 78;

        // --------------------------
        // Simple if
        // --------------------------

        if (marks >= 35) {
            System.out.println("Pass");
        }

        // --------------------------
        // if - else
        // --------------------------

        int age = 19;

        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible");
        }

        // --------------------------
        // else if ladder
        // --------------------------

        int percentage = 82;

        if (percentage >= 90) {
            System.out.println("Grade A+");
        } else if (percentage >= 75) {
            System.out.println("Grade A");
        } else if (percentage >= 60) {
            System.out.println("Grade B");
        } else if (percentage >= 35) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // --------------------------
        // Nested if
        // --------------------------

        boolean hasID = true;
        int userAge = 20;

        if (userAge >= 18) {

            if (hasID) {
                System.out.println("Entry Allowed");
            } else {
                System.out.println("ID Required");
            }

        } else {
            System.out.println("Under Age");
        }

    }
}
