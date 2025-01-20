package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharacterFrequencyCounter {

    public static void main(String[] args)
    {
        String str = "HelloWorld";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        HashMap<Character,Integer> SortedMap = new HashMap<>(map);

        for(Map.Entry<Character,Integer> entry: SortedMap.entrySet())
        {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
