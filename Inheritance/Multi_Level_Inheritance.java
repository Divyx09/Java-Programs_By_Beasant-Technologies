package Inheritance;

class Animals1{
    public void eat(){
        System.out.println("Eating Food");
    }
}
class AnimalType extends Animals1{
    public void typeFood(){
        System.out.println("Carnivore");
    }
}
class Lion1 extends AnimalType{
    public void carnivore(){
        System.out.println("Eat Flesh");
    }
}
public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        Lion1 obj = new Lion1();
        obj.eat();
        obj.typeFood();
        obj.carnivore();
    }    
}
