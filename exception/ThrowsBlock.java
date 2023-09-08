package exception;

public class ThrowsBlock {
    static void Error() throws Exception{
        System.out.println("Inside Error Method");
        throw new IllegalAccessException();
    }


    public static void main(String[] args) {
        try {
            Error();
        } catch (Exception e) {
            System.out.println("This will Execute");
        }
    }
}
