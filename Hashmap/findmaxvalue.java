package Hashmap;

import java.util.Comparator;
import java.util.HashMap;

public class findmaxvalue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        Integer max = map.values().stream().max(Integer::compare).get();

        System.out.println(max);

        Integer maxValue = map.values()
                .stream()
                .max(Comparator.naturalOrder())
                .orElse(null);

        System.out.println("Maximum Value: " + maxValue);

    }


}
