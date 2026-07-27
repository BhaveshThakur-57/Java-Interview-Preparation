package OOPS.Interface;
import java.util.Scanner;

interface client{
    void input();
    void output();
}

 class Raju implements client
 {
     String name; double salary;

     @Override
      public void input() {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter Username: ");
         name = scan.nextLine();

         System.out.println("Enter Salary: ");
         salary = scan.nextDouble();
     }

     @Override
     public void output(){
         System.out.println(name+" "+salary);


     }
     public static void main(String[] args) {
         client c = new Raju();
         c.input(); c.output();
     }

 }
