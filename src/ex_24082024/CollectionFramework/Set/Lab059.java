package ex_24082024.CollectionFramework.Set;

import java.util.*;

public class Lab059 {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
//        hashSet.add(1);
//        hashSet.add(5);
//        hashSet.add(4);
//        hashSet.add(0);
//        hashSet.add(10);
//        hashSet.add(15);
//        hashSet.add(41);
//        hashSet.add(10);

        hashSet.add("apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add(10);
        hashSet.add(15);
        hashSet.add(41);
        hashSet.add(10);
        hashSet.add(null);


        System.out.println(hashSet);

        Set ls = new LinkedHashSet();
        ls.add("apple");
        ls.add("Banana");
        ls.add("Orange");
        ls.add(10);
        ls.add(15);
        ls.add(41);
        ls.add(10);
        ls.add("Banana");
        ls.add("Orange");
        ls.add(null);

        System.out.println(ls);

        Set ts = new TreeSet();
        ts.add("orange");
        ts.add("apple");
        ts.add("banana");
//        ts.add(null); //can't add Null to TreeSet
        System.out.println(ts);
        for (Object o : ts) {
            System.out.println(o);
        }

        Iterator i = ts.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }


    }
}
