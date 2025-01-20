package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        Map<String, Integer> evenValues = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() % 2 == 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Even Values: " + evenValues);
    }

}
