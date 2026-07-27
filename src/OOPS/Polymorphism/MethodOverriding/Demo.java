package OOPS.Polymorphism.MethodOverriding;
/*
 * Flow:
 *
 *                     Method Call
 *                         |
 *              +----------+----------+
 *              |                     |
 *        Method Exists?             No
 *              |                     |
 *             Yes             Compile-Time Error
 *              |
 *      Is Method Overridden?
 *         +---------+---------+
 *         |                   |
 *        Yes                 No
 *         |                   |
 * Call Subclass Method   Call Superclass Method
 *
*/

class shape{
    void draw()
    {
        System.out.println("Can't Say Shape Type");
    }
}
class square extends shape{
    @Override
    void draw() {
        System.out.println("Square Shape");
    }
}

public class Demo {
    public static void main(String[] args) {
        shape obj = new square();
        obj.draw();
    }

}
