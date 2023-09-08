class Customer {
}

class Student {
}

public class NewInstanceIntro {
    public static void main(String[] args) throws Exception{
        // try {
        // Object o = Class.forName(args[0]).newInstance();
        // System.out.println("Object Created For: "+o.getClass().getName());

        // } catch (Exception e) {
        // System.out.println(e);
        // }

        Object o = Class.forName("Customer").newInstance();
        System.out.println("Object Created For: " + o.getClass().getName());
    }
}
