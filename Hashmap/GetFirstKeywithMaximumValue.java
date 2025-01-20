package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class GetFirstKeywithMaximumValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 5);
        map.put("C", 3);
        map.put("D", 4);

        String keykey = map.entrySet().stream().max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey).orElse(null);

        System.out.print(keykey);
    }
}
