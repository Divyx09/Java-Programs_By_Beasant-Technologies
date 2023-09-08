import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Calcul@tor 2.0");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First Number");
        int input1 = obj.nextInt();
        System.out.println("Enter Second Number");
        int input2 = obj.nextInt();
        System.out.println("Select the desired option to perform action");
        System.out.println("Addition [1]");
        System.out.println("Subtraction [2]");
        System.out.println("Multiplication [3]");
        System.out.println("Division [4]");
        System.out.print("Option ---> ");

        int option = obj.nextInt();

            if (option == 1) {
                float sum = input1 + input2;
                System.out.println("Sum of 4" + input1 + " and " + input2 + " = " + sum);
            }
            if (option == 2) {
                float minus = input1 - input2;
                System.out.println("Subtraction of " + input1 + " and " + input2 + " = " + minus);
            }
            if (option == 3) {
                float multiply = input1 * input2;
                System.out.println("Multiplication of " + input1 + " by " + input2 + " is " + multiply);
            }
            if (option == 4) {
                float divide = input1 / input2;
                System.out.println("Division of " + input1 + " divided by " + input2 + " is " + divide);
            } 
        
        else {
            System.out.println("Error Wrong Choice");
        }

        obj.close();

    }
}
