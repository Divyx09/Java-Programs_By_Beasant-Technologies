package Interface;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args)
    {
        System.out.println("Enter the number According to Your Shape");
        System.out.print("(1)-->Cube\n(2)-->Cuboid\n(3)-->Sphere\n(4)-->Exit\n");
        System.out.print("Your Choice: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        switch(n){
            case 1:{
                Cube obj = new Cube();
                obj.input();
                System.out.println(obj.area());
                System.out.println(obj.volume());
                break;
            }
            case 2:{
                Cuboid obj1 =new Cuboid ();
                obj1.input();
                obj1.area();
                obj1.volume();
                break;
            }
            case 3:{
                Sphere obj2= new Sphere () ;
                obj2.input();
                obj2.area();
                obj2.volume();
                break;
            }
            case 4:{
                break;
            }
        }
        in.close();
    }
}
