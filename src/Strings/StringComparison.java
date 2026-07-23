package Strings;

/*
 * ============================================================
 * Topic: String Comparison
 * ============================================================
 *
 * Interview Point:
 *
 * == compares reference.
 *
 * equals() compares actual content.
 */

public class StringComparison {

    public static void main(String[] args) {

        String s1 = "Java";

        String s2 = "Java";

        String s3 = new String("Java");

        System.out.println("Using ==");

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println();

        System.out.println("Using equals()");

        System.out.println(s1.equals(s2));

        System.out.println(s1.equals(s3));

    }

}
