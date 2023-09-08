package Overloading;

class Birds {
    public void fly() {
        System.out.println("All Birds can fly except 'Ostrich' and 'Kiwi'");
    }

    public void fly(String s) {
        System.out.println("Sparrow,Parrot,Crow all can fly");
    }

    public void fly(String s,String d){
        System.out.println("Ostrich and Kiwi can't fly");
    }
}

public class Intro_Overloading {
    public static void main(String[] args) {
        Birds obj = new Birds();
        obj.fly("a","b");
        obj.fly("a");
        obj.fly();
    }
}
