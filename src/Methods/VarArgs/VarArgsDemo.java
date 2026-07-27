package Methods.VarArgs;
/*
Definition:
Varargs (Variable Arguments) is a feature in Java that allows a method to accept zero or more arguments of the same type. It is represented using three dots (...).

Syntax:

returnType methodName(dataType... variableName) {
    // code
}

 */
public class VarArgsDemo {

    static void add(int... nums)  // var-args method
    {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add(10);
        add(10, 20);
        add(10, 20, 30, 40);
    }
}
