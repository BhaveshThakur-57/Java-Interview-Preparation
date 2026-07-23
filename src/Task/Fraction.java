package Task;

public class Fraction {
    public static fraction add(fraction f1, fraction f2){
        int numerator = f1.num*f2.den + f1.den* f2.num;
        int denominator = f1.den* f2.den;
        fraction f3= new fraction(numerator,denominator);
        return f3;
    }

    public static fraction multiply(fraction f1, fraction f2){
        int numerator = f1.num*f2.num;
        int denominator = f1.den* f2.den;
        fraction f4= new fraction(numerator,denominator);
        return f4;
    }

    public static int GCD(int num,int den){
        int min=Math.min(num,den);
        for(int i=min;i>=1;i--){
            if(num%i==0 && den%i==0) return i;
        }
        return min;
    }
    public static class fraction{
        int num;
        int den;

        public fraction(int num,int den){
            this.num=num;
            this.den=den;
            simplify();

        }

        public void simplify() {
            int HCF = GCD(num,den);
            num/=HCF;
            den/=HCF;
        }
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(35,21);
       // System.out.println(f1.num+"/"+f1.den);
       // f1.simplify();
        System.out.println(f1.num+"/"+f1.den);

        fraction f2 = new fraction(7,3);
        System.out.println(f2.num+"/"+f2.den);

        fraction f3 = add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
        fraction f4 = multiply(f1,f2);
        System.out.println(f4.num+"/"+f4.den);

    }
}
