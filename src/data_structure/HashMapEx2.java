package data_structure;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("신파파", 50);
        hashMap.put("신예나", 70);
        hashMap.put("신코니", 20);
        hashMap.put("오영주", 10);


        Set<String> keys = hashMap.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ": " + hashMap.get(key));
        }

    }
}
