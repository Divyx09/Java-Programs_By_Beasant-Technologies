package Interface;

import java.util.Scanner;

public class Cube implements Area_Volume {
    double side;
    public void input(){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the side of Cube: ");
        side = in.nextDouble();
        in.close();
    }
    public double area(){
        System.out.print("Area of Cube: ");
        return 6*(side);
    }
    public double volume(){
        System.out.print("Volume of Cube: ");
        return Math.pow(side, 3);}
}
