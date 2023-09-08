package Stack;

import java.util.Stack;

public class StackFunc {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(14);
        System.out.println(s);

        s.pop();
        System.out.println(s);
        
        System.out.println(s.empty());

        s.get(1);
        System.out.println(s);

        s.remove(2);
        System.out.println(s);
        
    }
}
