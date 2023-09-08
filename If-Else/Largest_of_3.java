import java.util.Scanner;

public class Largest_of_3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first Number");
        int input1 = obj.nextInt();
        System.out.println("Enter Second Number");
        int input2 = obj.nextInt();
        System.out.println("Enter Third Number");
        int input3 = obj.nextInt();
        
        if (input1 > input2 && input1 > input3) {
            System.out.println(input1 + " is Greater");
        }
        if (input2 > input3 && input2 > input1) {
            System.out.println(input2 + " is Greater");
        }
        if (input3 > input1 && input3 > input2) {
            System.out.println(input3 + " is Greater");
        }
        if (input1 == input2 && input2 == input3 && input3 == input1) {
            System.out.println("All Number are equal");
        }
        if ((input1 == input2 || input2 == input1) && (input3 < input1 || input3 < input2)) {
            System.out.println("First and Second Number are equal and Greater then Third Number");
        }
        if ((input3 == input2 || input2 == input3) && (input1 < input3 || input1 < input2)) {
            System.out.println("Third and Second Number are equal and Greater then First Number");
        }
        if ((input1 == input3 || input3 == input1) && (input2 < input1 || input2 < input3)) {
            System.out.println("First and Third Number are equal and Greater then Second Number");
        }
        obj.close();

    }
}
