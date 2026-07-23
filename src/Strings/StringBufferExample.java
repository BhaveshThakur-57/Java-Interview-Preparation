package Strings;

/*
 * ============================================================
 * Topic: StringBuffer
 * ============================================================
 *
 * StringBuffer is mutable.
 *
 * It is thread-safe.
 *
 * Slower than StringBuilder.
 */

public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();

        buffer.append("Java");

        buffer.append(" Backend");

        System.out.println(buffer);

        buffer.replace(5,12,"Full Stack");

        System.out.println(buffer);

        buffer.delete(5,15);

        System.out.println(buffer);

    }

}
