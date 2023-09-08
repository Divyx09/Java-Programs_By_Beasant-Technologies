package Stack;

import java.util.Scanner;

public class Stack_Intro {
    int top = 0;
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int[] stack = new int[input];


    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top]=0;
        return data;
    }

    public void show() {
        for (int i : stack) {
            System.out.println(i);
        }
    }
}
