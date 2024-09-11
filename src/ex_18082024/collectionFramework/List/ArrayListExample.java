package ex_18082024.collectionFramework.List;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExample {

    public static void main(String[] args) {
//        List myList1 = new List();
//        Collection myList2 = new ArrayList();

        ArrayList myList = new ArrayList();
        myList.add("Bob");
        myList.add("King");
        myList.add("Pop");

        System.out.println(myList);
        System.out.println(myList.contains("Charlie"));
        System.out.println(myList.contains("Bob"));
        System.out.println(myList.get(1));
        String a = (String) myList.get(2);
        System.out.println(a);

    }
}
