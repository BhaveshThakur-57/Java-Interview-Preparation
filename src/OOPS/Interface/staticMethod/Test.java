package OOPS.Interface.staticMethod;
 interface A{
     public static void Show()
     {
         System.out.println("can't override interface static methods");
     }
 }

 class Test {
     public static void main(String[] args) {
         A.Show();
     }
}


//interface Test{
//    public static void main(String[] args) {
//        System.out.println("error");
//    }
//}

