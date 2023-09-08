package Interface;

import java.util.Scanner;

public class Cuboid implements Area_Volume {
    double length,breadth,height;
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = in.nextDouble();
        System.out.print("Enter the length: ");
        breadth = in.nextDouble();
        System.out.print("Enter the length: ");
        height = in.nextDouble();
        in.close();
    }
    public double area(){
        System.out.println("Area of Cuboid");
        return 2*(length*breadth+breadth*height+length*height);
        
    }
    public double volume(){
        System.out.println("Volume of cuboid");
        return length*breadth*height;
    }
}
