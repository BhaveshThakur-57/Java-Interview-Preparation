package OOPS.Interface;

interface Gill{
    void add();
}
interface Raj extends Gill{
    void sub();
}

class Mohan implements Raj{
    @Override
    public void add(){
        int a=2,b=6,c;
        c=a+b;
        System.out.println("Addition: "+c);
    }

    @Override
    public void sub(){
        int a=8,b=6,c;
        c=a-b;
        System.out.println("Subtraction: "+c);
    }
}

public class ExtendingInterfacesInJava {
    public static void main(String[] args) {
        Raj r =  new Mohan();
        r.add(); r.sub();

    }
}
