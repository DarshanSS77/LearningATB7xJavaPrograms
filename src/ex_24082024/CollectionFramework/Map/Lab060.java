package ex_24082024.CollectionFramework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab060 {
    public static void main(String[] args) {
//        Map hashMap = new HashMap();
//        Map hashMap = new LinkedHashMap();
        Map hashMap = new TreeMap();


        hashMap.put("Name", "darshan");
        hashMap.put("Phone", 123456789);
        hashMap.put("Id", 12);


        System.out.println(hashMap);
    }
}
