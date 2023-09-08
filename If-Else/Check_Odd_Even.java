import java.util.Scanner;

public class Check_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Entered Number is Even");
        }
        else {
            System.out.println("Entered Number is Odd");
        }
        sc.close();
    }
}
