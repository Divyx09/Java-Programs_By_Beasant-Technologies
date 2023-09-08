import java .util.Scanner;
public class Check_Vowel {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        char ch = obj.next().charAt(1);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
        obj.close();
    }
}
