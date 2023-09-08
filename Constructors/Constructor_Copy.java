package Constructors;
public class Constructor_Copy {
    String str;
    int n;
    Constructor_Copy(String str, int n) {
        this.str = str;
        this.n = n;
    }
    Constructor_Copy(Constructor_Copy obj1) {
        this.str = obj1.str;
        this.n = obj1.n;
    }
}
class Main {
    public static void main(String[] args) {

        System.out.println("First object");

        Constructor_Copy obj = new Constructor_Copy("Besant", 100);

        System.out.println(obj.str + " " + obj.n);
        System.out.println("=============");

        System.out.println("Second Object");
        Constructor_Copy obj3 = new Constructor_Copy(obj);

        System.out.println(obj3.str + " " + obj3.n);

    }

}
