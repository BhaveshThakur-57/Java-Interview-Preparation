package OOPS.Interface;

interface customerRaju
{
 int amt=5;          // by default public + static + final
 void purchase(); // by default public + abstract
}
 class SellerSanju implements customerRaju
 {
     @Override
     public void purchase(){
         System.out.println("Raj needs "+amt+" kg rice");
     }

     public static void main(String[] args) {
         customerRaju c = new SellerSanju();
         c.purchase();
     }
 }
