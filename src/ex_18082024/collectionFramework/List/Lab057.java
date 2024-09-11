package ex_18082024.collectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab057 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList();

        num.add(12);
        num.add(21);
        num.add(25);

//        num.add(true); //Gives error
//        num.add("good");

        for (Integer i : num){
            System.out.println(i);
        }
    }
}
