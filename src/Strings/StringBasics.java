package Strings;

/*
 * ============================================================
 * Topic: Introduction to Strings
 * ============================================================
 *
 * Theory:
 * --------
 * A String is a sequence of characters.
 *
 * In Java, String is NOT a primitive data type.
 * It is a predefined class.
 *
 * Strings are immutable.
 * (Once created, they cannot be changed.)
 */

public class StringBasics {

    public static void main(String[] args) {

        String firstName = "Bhavesh";
        String lastName = "Sattavan";

        String fullName = firstName + " " + lastName;

        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Full Name : " + fullName);

        System.out.println();

        System.out.println("Length : " + fullName.length());

    }

}
