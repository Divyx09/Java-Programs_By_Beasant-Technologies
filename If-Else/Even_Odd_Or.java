import java.util.Scanner;
public class Even_Odd_Or {
    public static void main(String[] args) {
        System.out.println("Enter the Number To Be Checked");
        Scanner obj =  new Scanner(System.in);
        int i = obj.nextInt();
        if ((i | 1) > i) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
        obj.close();
    }
}
