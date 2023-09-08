package exception;

public class FinallyBlock {
    public static void main(String[] args) {
         int a=10,b=5,c=5,r;

         try {
            r=a/(b-c);
            System.out.println(r);
         } catch (Exception e) {
            System.out.println("Exception Occured");
         }
         finally{
            System.out.println("This will always print");
         }
        }
}
