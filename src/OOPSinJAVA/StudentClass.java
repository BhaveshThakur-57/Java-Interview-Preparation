package OOPSinJAVA;

public class StudentClass {
    //creating a new  data type with multiple attributes
    public static class  Student{
        String name;
        int rno;
        double percent;
    }

//    public static class  Car{
//        String name;
//        int price;
//        String type;
//    }

    public static void fun(Student x){
        System.out.println(x.rno);
        return;

    }

    public static void main(String[] args) {
        Student obj1 = new Student();  // maine x name ka bda dabba bnaya
        obj1.name="Bhavesh Thakur";    // ushme uske values store kr di using .operator
        obj1.rno=69;
        obj1.percent=62.18;
        fun(obj1);


        Student obj2 = new Student();  // declaration
        obj2.name="Omkar Chauhan";    // Initialization
        obj2.rno=18;                 // Initialization
        obj2.percent=86;            // Initialization
        System.out.println(obj2.name);

//        Car c1 = new Car();
//        c1.name="Alto";
//        c1.type="Hatchback";
        //c1.rno=18;         //not acessible because it is declared as private


    }
}
