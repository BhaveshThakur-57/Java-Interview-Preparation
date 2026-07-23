package JavaBasics;
/*
  Java Primitive Data Types

  byte    -> 1 byte
  short   -> 2 bytes
  int     -> 4 bytes
  long    -> 8 bytes
  float   -> 4 bytes
  double  -> 8 bytes
  char    -> 2 bytes
  boolean -> true/false

  Interview Point:
  ----------------
  String is NOT a primitive data type
  It is a class
 */

public class DataTypesExample {
    public static void main(String[] args) {

        byte age = 22;

        short year = 2026;

        int salary = 500000;

        long population = 1430000000L;

        float cgpa = 7.52f;

        double pi = 3.14159265359;

        char grade = 'A';

        boolean isJavaFun = true;

        System.out.println("Byte      : " + age);
        System.out.println("Short     : " + year);
        System.out.println("Int       : " + salary);
        System.out.println("Long      : " + population);
        System.out.println("Float     : " + cgpa);
        System.out.println("Double    : " + pi);
        System.out.println("Char      : " + grade);
        System.out.println("Boolean   : " + isJavaFun);
    }
}
