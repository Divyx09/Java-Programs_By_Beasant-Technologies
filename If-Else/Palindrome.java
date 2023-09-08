import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Palindrome obj1 =new Palindrome();
        obj1.pali();
    }
    public void pali(){
        Scanner obj = new Scanner(System.in);
        int input = obj.nextInt();
        int i;
        int reverse = 0, remainder;
        i = input;
        while (i != 0) {
            remainder = i % 10;
            reverse = reverse * 10 + remainder;
            i = i / 10;
        }
        if (input == reverse) {
            System.out.println(input + " is a Palindrome Number");
        } else {
            System.out.println(input + " Not a Palidrome Number");
        }
        obj.close();
    }
}
