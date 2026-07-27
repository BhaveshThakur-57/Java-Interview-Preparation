package OOPS.Interface;

interface Client{
    void webdesign();
    void webdevelope();
}

abstract class BhaveshTech implements Client{
    @Override
    public void webdesign(){
        System.out.println("Green, top menu, three dot button");
    }
}

 class OmkarTech extends BhaveshTech{
    @Override
    public void webdevelope(){
        System.out.println("HTML,  CSS, JAVA");
    }
}

 class Check {
     public static void main(String[] args) {
         OmkarTech obj= new OmkarTech();
         obj.webdevelope();
         obj.webdesign();
     }
}
