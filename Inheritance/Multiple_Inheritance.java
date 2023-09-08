package Inheritance;

interface A{
    public void show1();
}
interface B{
    public void show2();
}
interface C extends A,B{
    public void show3();
}

class D implements C{
    public void show1(){
        System.out.println("Show1");
    }
    public void show2(){
        System.out.println("Show2");
    }
    public void show3(){
        System.out.println("Show3");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.show1();
        obj.show2();
        obj.show3();
    }
}
