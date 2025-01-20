package Hashmap;

import java.util.HashMap;

public class GettheSumofValuesinHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        //If you use entrySet() instead of values(), the difference is
        // that entrySet() gives you both the key
        // and the value of each map entry, whereas values() only
        // gives you the values.
        int sum = map.values().stream().mapToInt(Integer::intValue).sum();
       int sum1  = map.entrySet().stream()
                .mapToInt(entry -> entry.getValue())
                .sum();


        System.out.print(sum);

        map.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


    }
}
