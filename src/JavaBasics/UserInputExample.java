package JavaBasics;
/*


  Java uses the Scanner class to take input from the keyboard.

  Package Required:
  import java.util.Scanner;

  Common Methods:

  next()        -> Reads one word
  nextLine()    -> Reads an entire line
  nextInt()     -> Reads integer
  nextDouble()  -> Reads double
  nextFloat()   -> Reads float
  nextBoolean() -> Reads boolean

  Best Practice:
  Close the Scanner object after use.
 */

import java.util.Scanner;
public class UserInputExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Details =====");

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        System.out.print("Enter Percentage : ");
        double percentage = sc.nextDouble();

        System.out.println();

        System.out.println("===== Output =====");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);

        sc.close();
    }
}
