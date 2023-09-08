package Stack;

import java.io.IOException;
import java.util.Scanner;

public class Stack_Run {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Stack_Array obj = new Stack_Array();
        int loopValue = 0;
        do {
            System.out.println("Choose your Desired Function To perform on Stack");
            System.out.print("(1)-->Push an Element\n(2)-->Pop an Element\n(3)-->Display your Stack\n(4)-->Exit\n");
            System.out.print("Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    obj.push();
                    break;
                }
                case 2: {
                    obj.pop();
                    break;
                }
                case 3: {

                    obj.display();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default:{
                    System.err.println("Invalid Input\nPlease Enter a Valid Option!");
                }
            }

        } while (loopValue < 5);

        sc.close();
    }
}
