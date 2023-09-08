package Inheritance;

class Animals {
    public void Carnivore() {
        System.out.println("Have Four Legs");
    }
}

class Lion2 extends Animals {
    public void typeFood() {
        System.out.println("Eat Other Animal");
    }
}

class Dog extends Animals {
    public void typeFood() {
        System.out.println("Eat Pet Food as Well as small Animals");
    }
}

class Bear extends Animals {
    public void typeFood() {
        System.out.println("Eat Other Animal as well as Grass also");
    }
}

public class Hierrachial_Inheritance {
    public static void main(String[] args) {
        Lion2 o1 = new Lion2();
        o1.Carnivore();
        o1.typeFood();

        Lion2 o2 = new Lion2();
        o2.Carnivore();
        o2.typeFood();

        Lion2 o3 = new Lion2();
        o3.Carnivore();
        o3.typeFood();
    }
}
