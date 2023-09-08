package Arrays;
import java.util.Scanner;

public class Array_WithoutSort {
        public static void main(String[] args) {
        System.out.println("Insert Value Into arrays");
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[5];
        for(int l=0;l<5;l++){
            arr[l] = obj.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int n=0;
                    arr[i]= n;
                    arr[i]=arr[j];
                    arr[j]=n;
                }
                System.out.println();
            }
        }obj.close();
    }    
}
