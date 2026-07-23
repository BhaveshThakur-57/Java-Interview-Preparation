package Strings;

/*
 * ============================================================
 * File : StringPrograms.java
 * Topic: Interview Programs
 * ============================================================
 */

public class StringPrograms {

    public static void main(String[] args) {

        String text = "Java Developer";

        // Reverse String

        System.out.println("Reverse");

        for(int i=text.length()-1;i>=0;i--){

            System.out.print(text.charAt(i));

        }

        System.out.println();

        // Count Vowels

        int vowels = 0;

        for(int i=0;i<text.length();i++){

            char ch = Character.toLowerCase(text.charAt(i));

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                vowels++;

            }

        }

        System.out.println("Vowels = " + vowels);

        // Palindrome

        String word = "madam";

        String reverse = "";

        for(int i=word.length()-1;i>=0;i--){

            reverse += word.charAt(i);

        }

        if(word.equals(reverse)){

            System.out.println(word + " is Palindrome");

        }

        else{

            System.out.println(word + " is not Palindrome");

        }

    }

}
