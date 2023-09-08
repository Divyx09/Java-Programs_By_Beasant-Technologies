import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter Year you want to Check");
        Scanner obj = new Scanner(System.in);
        int i = obj.nextInt();
        if (i % 4 == 0) {
            if (i % 100 == 0) {
                if (i % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a leap year");
        }
        obj.close();
    }
}
