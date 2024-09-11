package ex_24082024.CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab061 {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap();

//        m1.put("Name", "darshan");//error
        m1.put("ID", 25);
        m1.put("year", 2024);
        m1.put("age", 10);

        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.containsKey("Date"));

        System.out.println("===============");

        //Iterate over the all elements
        for (Map.Entry<String,Integer> item : m1.entrySet()) {
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}
