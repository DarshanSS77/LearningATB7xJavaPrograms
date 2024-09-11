package ex_24082024.CollectionFramework.List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(5);
//        l.add("one");
//        l.add(true);

        l.add(7);
        l.add(50);
        l.add(51);


        Collections.sort(l);
        System.out.println(l);
    }

}
