package exception.userDefine;

public class MyexceptionIntro {

    public static void main(String[] args) {
        try {
            throw new Myexception("Exception Created By Me");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Myexception extends Exception{
    public Myexception(String s) {
        super(s);
    }

}
