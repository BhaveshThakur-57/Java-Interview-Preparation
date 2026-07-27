package OOPS.Abstraction;

//abstract class Programming
//{
//    public abstract void Developer();
//}
//
//class HTML extends Programming {
//    @Override
//    public void Developer() {
//        System.out.println("Tim Berners Lee");
//    }
//}
//
//class Java extends Programming {
//    @Override
//    public void Developer() {
//        System.out.println("James Gosling");
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        HTML h = new HTML();
//        h.Developer();
//        Java j= new Java();
//        j.Developer();
//
////        we cannot create object of abstract class but
////        we can create object reference of it
//
//
////        Programming h = new HTML();
////        h.Developer();
////        Programming j= new Java();
////        j.Developer();
//    }
//}



abstract class Programming
{
    public abstract void Developer();
    public abstract void Rank();
}

abstract class HTML extends Programming {
    @Override
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }
}

class Java extends HTML {
    @Override
    public void Rank() {
        System.out.println("1st");
    }
}

class Test {
    public static void main(String[] args) {
        Programming h = new Java();
        h.Developer();
        h.Rank();
    }
}