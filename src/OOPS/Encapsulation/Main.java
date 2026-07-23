package OOPS.Encapsulation;

/*
 * ============================================================
 * Topic: Encapsulation Demo
 * ============================================================
 */

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Bhavesh");
        student.setAge(22);
        student.setPercentage(82.5);

        System.out.println("Student Details");
        System.out.println("----------------------");

        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
        System.out.println("Percentage : " + student.getPercentage());

        System.out.println();

        Employee employee = new Employee();

        employee.setEmployeeId(101);
        employee.setEmployeeName("Rahul");
        employee.setSalary(55000);

        System.out.println("Employee Details");
        System.out.println("----------------------");
        System.out.println("Employee ID : " + employee.getEmployeeId());
        System.out.println("Employee Name : " + employee.getEmployeeName());
        System.out.println("Salary : ₹" + employee.getSalary());

    }

}
