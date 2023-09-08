package Qeue;

import java.util.*;

public class QeueIntro {
    public static void main(String[] args) {
        Queue<String> Fruit = new LinkedList<String>();
        Fruit.add("Apple");
        Fruit.add("Kiwi");
        Fruit.add("Grapes");
        System.out.println(Fruit);
        System.out.println(Fruit.remove());
        System.out.println(Fruit);

        for (String string : Fruit) {

            System.out.println(string);
        }
        System.out.println(((LinkedList<String>) Fruit).getLast());

    }
}