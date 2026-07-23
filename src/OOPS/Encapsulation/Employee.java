package OOPS.Encapsulation;

/*
 * ============================================================
 * Topic: Real World Encapsulation Example
 * ============================================================
 */

public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {

        this.employeeId = employeeId;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public  void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;

    }

    public  double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary > 0) {

            this.salary = salary;

        } else {

            System.out.println("Salary cannot be negative.");

        }

    }

}
