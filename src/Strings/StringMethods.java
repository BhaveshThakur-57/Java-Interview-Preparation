package Strings;

/*
 * ============================================================
 * Topic: Important String Methods
 * ============================================================
 */

public class StringMethods {

    public static void main(String[] args) {

        String language = "Java Programming";

        System.out.println("Original String : " + language);

        System.out.println();

        System.out.println("Length : " + language.length());

        System.out.println("Uppercase : " + language.toUpperCase());

        System.out.println("Lowercase : " + language.toLowerCase());

        System.out.println("Character at Index 5 : " + language.charAt(5));

        System.out.println("Substring : " + language.substring(5));

        System.out.println("Contains Java : " + language.contains("Java"));

        System.out.println("Starts With Java : " + language.startsWith("Java"));

        System.out.println("Ends With ming : " + language.endsWith("ming"));

        System.out.println("Replace : " +
                language.replace("Programming", "Developer"));

    }

}
