package Inheritance;

public class SuperKeyword {
    int speed = 100;
}

class Childclass extends SuperKeyword {
    int speed = 100;

    void Display() {
        System.out.println("Max Speed : " + super.speed);
    }
}

class InnerSuperKeyword {
    public static void main(String[] args) {
        Childclass  c = new Childclass();
        c.Display();    
    }
}
