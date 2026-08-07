package ExceptionHandling.CheckedException;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Example2 {

    public static void readFile() throws FileNotFoundException {

        FileReader file = new FileReader("student.txt");

        System.out.println("File Opened");

    }

    public static void main(String[] args) {

        try {

            readFile();

        }

        catch (FileNotFoundException exception) {

            System.out.println("File Not Found.");

        }

    }

}
