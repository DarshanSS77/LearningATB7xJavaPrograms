package ex_18082024.collectionFramework.List;

import java.awt.*;
import java.util.List;

public class Lab054 {
    public static void main(String[] args) {
        List myLists = List.of("milk", "bread", "butter");
        System.out.println(myLists);
        System.out.println(myLists.size());
        myLists.add("Banana");
        System.out.println(myLists);


    }
}
