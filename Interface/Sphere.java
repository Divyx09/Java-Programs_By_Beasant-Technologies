package Interface;

import java.util.Scanner;

public class Sphere implements Area_Volume {
    double r;
    public void input() {
        System.out.print("Enter the radius of a Sphere: ");
        Scanner in = new Scanner(System.in);
        r=in.nextDouble();
        in.close();
    }

    public double area() {
        System.out.print("Area of Sphere: ");
        return 4*3.14*Math.pow(r, 2);
    }

    public double volume() {
        System.out.println("Volume of Sphere: ");
        return 4/3*3.14*Math.pow(r, 3);

    }

}
