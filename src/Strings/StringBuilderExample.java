package Strings;

/*
 * ============================================================
 * Topic: StringBuilder
 * ============================================================
 *
 * StringBuilder is mutable.
 *
 * Faster than String when modifying text.
 */

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("Java");

        builder.append(" ");

        builder.append("Developer");

        System.out.println(builder);

        builder.insert(5,"Backend ");

        System.out.println(builder);

        builder.reverse();

        System.out.println(builder);

    }

}
