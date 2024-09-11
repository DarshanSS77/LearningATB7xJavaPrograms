package ex_18082024.collectionFramework.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab056 {
    public static void main(String[] args) {
        List marks = new ArrayList();

        marks.add(70);
        marks.add(95);
        marks.add(36);
        marks.add(55);
        marks.add(66);
        marks.add(10);
        System.out.println(marks);
//        Collection - interface
//        Collections - Class

        Collections.sort(marks);
        System.out.println(marks);


    }
}
