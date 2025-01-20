package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GetKeyswithValuesGreaterThan2 {

    public static  void main(String[] args)
    {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        Set<String> values = map.entrySet().stream()
                            .filter(s ->s.getValue() > 2)
                                    .map(Map.Entry::getKey)
                                .collect(Collectors.toSet());
        System.out.print(values);

    }

}
