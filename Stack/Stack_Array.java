package Stack;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class Stack_Array implements StackInterface {
    int n = 5;
    int stack[] = new int[n];
    int top = -1;

    public void push() {
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        if (top == (n - 1)) {
            System.out.println("Stack Overflow");
        } else {
            System.out.print("\nEnter the element to be pushed: ");
            // int input = Integer.parseInt(in.readLine());
            int input= in.nextInt();
            stack[++top] = input;
            System.out.println("Element Pushed Successfully.");
            // in.close();
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
        } else {
            int popper = stack[top];
            top--;
            System.out.println("Popped Element: " + popper);
        }
    }

    public void display() {
        if (top < 0) {
            System.out.println("Empty Stack!");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i] + " <--");
            }
        }
    }
}
