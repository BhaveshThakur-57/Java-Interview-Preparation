package ExceptionHandling.ThrowsKeyword;

 class ThrowVSThrows
{
    void div(int a, int b) throws ArithmeticException
    {
        if(b==0){
            throw new ArithmeticException();
        }
        else {
            int c=a/b;
            System.out.println(c);
        }
    }

    public static void main(String[] args)  //throws ArithmeticException
    {
        ThrowVSThrows obj = new ThrowVSThrows();
        try {
            obj.div(20,0);
        } catch (Exception e){
            System.out.println("The value of b is zero");
        }

    }
}
