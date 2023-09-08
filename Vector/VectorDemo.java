package Vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer>v = new Vector<>();
        int size=5;
        for(int i =0;i<size;i++){
            v.add(i);
        }
        System.out.println(v);

        Vector v1 = new Vector();
        v1.add(1);
        v1.add("Welcome");
        v1.add(23);
        System.out.println(v1);


        Vector<String> v2 = new Vector<String>();
        v2.add("string");
        v2.add("string1");
        v2.add("string2");

        System.out.println(v2);





    }
}
