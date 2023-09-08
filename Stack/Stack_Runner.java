package Stack;

// import java.util.Scanner;

public class Stack_Runner {    
    public static void main(String[] args) {
        System.out.println("Enetr the Size of Stack");
        Stack_Intro obj = new Stack_Intro();
        System.out.println("Enter the value you want to push");
        obj.push(12);
        obj.push(45);
        obj.push(56);
        obj.pop();
        obj.pop();
        obj.show();
    }
}
