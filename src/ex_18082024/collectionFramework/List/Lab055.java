package ex_18082024.collectionFramework.List;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
//import java.util.List;

public class Lab055 {
    public static void main(String[] args) {
        ArrayList lists1 = new ArrayList();

        lists1.add("Bob");
        lists1.add("King");
        lists1.add("Pop");
        lists1.add("Bob");
        lists1.add("King");
        lists1.add("King");
        System.out.println(lists1);

        System.out.println("-------------");

        lists1.remove("King");
        System.out.println(lists1);

        lists1.add(123);
        lists1.add(true);
        lists1.add(false);
        System.out.println("-------------");

        for (Object o : lists1) {
            System.out.println(o);
        }

        System.out.println("-------------");

        for (int i = 0; i < lists1.size(); i++) {
            System.out.println(lists1.get(i));
        }


    }
}
