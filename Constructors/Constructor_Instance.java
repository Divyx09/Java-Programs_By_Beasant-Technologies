package Constructors;
public class Constructor_Instance {
    static int count = 0;
    {
        count ++;
    }
Constructor_Instance(){
}
Constructor_Instance(int i){}
Constructor_Instance(double d){}

public static void main(String[] args) {
    Constructor_Instance obj = new Constructor_Instance();
    Constructor_Instance obj1 = new Constructor_Instance(10);
    Constructor_Instance obj2 = new Constructor_Instance(10.5); 
    System.out.println("Number of Object Created: "+count);
    obj.getClass();
    obj1.getClass();
    obj2.getClass();

    
}
}