package ExceptionHandling.userDefinedException;

class InvalidAGeException extends Exception{
    InvalidAGeException(String msg){
        System.out.println(msg);
    }
}
 class Test {

    public static void main(String[] args) {
        try {
            vote(120);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     public static void vote (int age) throws InvalidAGeException
     {
         if (age < 18) {
             throw new InvalidAGeException("Not Eligible for votting");
         } else {
             System.out.println("Eligible for voting");
         }
     }
}
